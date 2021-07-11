package com.clovertech.autolibdz.activities

import android.Manifest
import android.app.AlertDialog
import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothServerSocket
import android.bluetooth.BluetoothSocket
import android.content.ContentValues
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.clovertech.autolibdz.R
import com.skyfishjy.library.RippleBackground
import io.socket.client.IO
import io.socket.client.Socket
import io.socket.emitter.Emitter
import kotlinx.android.synthetic.main.activity_find_your_car.*
import org.json.JSONObject
import java.io.IOException
import java.net.URISyntaxException
import java.util.*

var rippleBackground: RippleBackground? = null
class FindYourCarActivity : AppCompatActivity() {

    private lateinit var mSocket: Socket
    var bluetoothAdapter: BluetoothAdapter? = null


    private val onError: Emitter.Listener = Emitter.Listener {
        this.runOnUiThread(Runnable {
            try {
                val data: Exception = it[0] as Exception
                data.printStackTrace()
                Toast.makeText(this, data.message, Toast.LENGTH_SHORT).show()
            } catch (e: Exception) {
                val data: JSONObject = it[0] as JSONObject

            }

        })
    }
    private val onLink: Emitter.Listener = Emitter.Listener {

    }

    private val onDisconnect: Emitter.Listener = Emitter.Listener {
        this.runOnUiThread(Runnable {
            Toast.makeText(this, "Diconnected!", Toast.LENGTH_SHORT).show()
        })
    }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_find_your_car)

        rippleBackground = findViewById<View>(R.id.content) as RippleBackground
        rippleBackground?.startRippleAnimation()


        val disassociateButton = findViewById<Button>(R.id.disassociateButton)
        disassociateButton.setOnClickListener {
            bluetoothAdapter = null
            mSocket.emit("stop association")
            val associationStatus = findViewById<TextView>(R.id.association_status_id)
            associationStatus.text = "Non associÃ©"
            rippleBackground?.startRippleAnimation()
            this.runOnUiThread {
                Toast.makeText(this, "Non associÃ©", Toast.LENGTH_SHORT).show()
            }
        }

        try {
            val opts = IO.Options()
            opts.path = "/socket"
            mSocket = IO.socket("http://54.37.87.85:7001", opts)

        } catch(e: URISyntaxException) {
            Toast.makeText(this, "Exception ${e.localizedMessage}", Toast.LENGTH_SHORT).show()
            e.printStackTrace()
        }

        mSocket.on(Socket.EVENT_CONNECT, onConnected)
        mSocket.on("error", onError)
        mSocket.on("connect_error", onError)
        mSocket.on("start link", onLink)
        mSocket.on("link started", onLinkStarted)
        mSocket.on("disconnect", onDisconnect)
        mSocket.on("link failed", onLinkFailed)

        mSocket.connect()


        val idVehicule = savedInstanceState?.getInt("idVehicule")


        val linkButton = findViewById<Button>(R.id.associateButton)
        linkButton.setOnClickListener {
            rippleBackground?.stopRippleAnimation()
            val jsonInfos = JSONObject()
            jsonInfos.put("idVehicule", 5)
            val jsonInfosObj = JSONObject()
            jsonInfosObj.put("id", 5)
            val mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter()
            val name: String = mBluetoothAdapter.name
            jsonInfosObj.put("nom", name)
            jsonInfos.put("locataire", jsonInfosObj)
            mSocket.emit("demande vehicule", jsonInfos)
        }
    }

    private fun requestLocationPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.ACCESS_BACKGROUND_LOCATION
                ),
                100
            )
        } else {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.ACCESS_FINE_LOCATION),
                100
            )
        }
    }

    private val onLinkFailed: Emitter.Listener = Emitter.Listener {
        this.runOnUiThread(Runnable {Toast.makeText(this, "OnLinkFailed Event", Toast.LENGTH_SHORT).show()})
    }

    private val onLinkStarted: Emitter.Listener = Emitter.Listener {
        this.runOnUiThread(Runnable {Toast.makeText(this, "OnLinkStarted Event", Toast.LENGTH_SHORT).show()})
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter()
        val acceptThread = AcceptThread(this@FindYourCarActivity)
        acceptThread?.start()

    }

    private val onConnected: Emitter.Listener = Emitter.Listener {

        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter()



        // Location permissions
        if (ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(
                    this,
                    Manifest.permission.ACCESS_FINE_LOCATION
                )
            ) {
                // Show an explanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.
                AlertDialog.Builder(this)
                    .setTitle("Location Permission Needed")
                    .setMessage("This app needs the Location permission, please accept to use location functionality")
                    .setPositiveButton(
                        "OK"
                    ) { _, _ ->
                        //Prompt the user once explanation has been shown
                        requestLocationPermission()
                    }
                    .create()
                    .show()
            } else {
                // No explanation needed, we can request the permission.
                requestLocationPermission()
            }
        }

        // Bluetooth permissions

        if (bluetoothAdapter?.isEnabled == false) {
            val enableBtIntent = Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)
            startActivityForResult(enableBtIntent, 100)
        }

        // Discoverabilite permissions

        val requestCode = 1
        val discoverableIntent: Intent =
            Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE).apply {
                putExtra(BluetoothAdapter.EXTRA_DISCOVERABLE_DURATION, 300)
            }
        startActivityForResult(discoverableIntent, requestCode)

        this.runOnUiThread(Runnable {
            Toast.makeText(this, "OnConnected Event", Toast.LENGTH_SHORT).show()
        })
        // Start the association

        val acceptThread = AcceptThread(this@FindYourCarActivity)
        acceptThread?.start()

    }

    override fun onDestroy() {
        super.onDestroy()

        mSocket.disconnect()
        mSocket.off("error", onError)
        mSocket.off("connect_error", onError)
        mSocket.off("start link", onLink)


    }

}


private class AcceptThread(
    val activity: FindYourCarActivity
) : Thread() {

    private var mmServerSocket: BluetoothServerSocket? = null

    override fun run() {
        try {
            mmServerSocket = bluetoothAdapter?.listenUsingInsecureRfcommWithServiceRecord("PermissionsP2p", UUID(100, 200))
        } catch (e: Exception) {
            Log.e("exception", e.localizedMessage)
        }

        // Keep listening until exception occurs or a socket is returned.
        var shouldLoop = true
        while (shouldLoop) {
            val socket: BluetoothSocket? = try {
                val bluetoothSocket = mmServerSocket?.accept()
                bluetoothSocket
            } catch (e: IOException) {
                Log.e(ContentValues.TAG, "Socket's accept() method failed", e)
                shouldLoop = false
                null
            }
            socket?.also {
                activity.runOnUiThread {
                    val associationStatus = activity.findViewById<TextView>(R.id.association_status_id)
                    associationStatus.text = "AssociÃ© avec l'appareil ${socket.remoteDevice.name}"
                    rippleBackground?.stopRippleAnimation()
                }
                mmServerSocket?.close()
                shouldLoop = false
            }
        }
    }
}