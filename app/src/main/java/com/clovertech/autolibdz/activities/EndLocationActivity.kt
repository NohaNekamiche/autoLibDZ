package com.clovertech.autolibdz.activities

import android.Manifest
import android.annotation.SuppressLint
import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.graphics.PorterDuff
import android.location.Location
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.CountDownTimer
import android.provider.Settings
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.clovertech.autolibdz.ui.HomeFragment
import com.clovertech.autolibdz.R
import com.clovertech.autolibdz.ViewModel.RentalViewModel
import com.clovertech.autolibdz.ViewModel.RentalViewModelFactory
import com.clovertech.autolibdz.activities.auth.fragments.Register1Fragment
import com.clovertech.autolibdz.activities.auth.fragments.Register2Fragment
import com.clovertech.autolibdz.activities.auth.fragments.Register3Fragment
import com.clovertech.autolibdz.repository.RentalRepository
import com.clovertech.autolibdz.utils.Constants
import kotlinx.android.synthetic.main.bottom_bar_layout.*
import kotlinx.android.synthetic.main.end_location.*
import java.util.ArrayList
import java.util.concurrent.TimeUnit
import com.google.android.gms.location.FusedLocationProviderClient
import com.google.android.gms.location.LocationServices

class EndLocationActivity: AppCompatActivity() {

    private var fusedLocationClient: FusedLocationProviderClient? = null
    private var lastLocation: Location? = null
    private var latitudeLabel: String? = null
    private var longitudeLabel: String? = null
    private lateinit var rentalViewModel: RentalViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.end_location)
//        val toolbar: Toolbar = findViewById(R.id.toolbar)
  //      setSupportActionBar(toolbar)
       // init()
        //supportFragmentManager.beginTransaction().replace(R.id.fragments_container, fragments[0]).commit()

       /* for (i in layouts.indices) {
            layouts[i].setOnClickListener {
                editTint(i)
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragments_container, fragments[i])
                    .commit()
            }
        }*/
        latitudeLabel = resources.getString(R.string.latitudeBabel)
        longitudeLabel = resources.getString(R.string.longitudeBabel)
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this)
        countDown()
        var idcar=0
        var idborn=0
        val preferences: SharedPreferences =getSharedPreferences(Constants.APP_PREFS, Context.MODE_PRIVATE)
        preferences.getInt("idcar", idcar)
        preferences.getInt("idborn",idborn)
        endrental(idcar,idborn)
    }

    private fun endrental(idcar:Int,idBorn:Int){
        val repository = RentalRepository()
        val factory = RentalViewModelFactory(repository)
        rentalViewModel = ViewModelProvider(this,factory)
        .get(RentalViewModel::class.java)
        rentalViewModel.endRental(idcar,idBorn)
        rentalViewModel.msg.observe(this, Observer { response ->
            if (response.isSuccessful) {
                alerteMsg()
            }
        })
    }
    @SuppressLint("ResourceType")
    private fun alerteMsg() {  val builder = AlertDialog.Builder(this)
        builder.setTitle(R.string.SucdialogTitle)
        builder.setMessage("Vous etre arrive à la borne destination,Rendre la véhicule")
        builder.setIconAttribute(R.drawable.ic_baseline_done_outline_24)

        builder.setPositiveButton("Ok"){dialogInterface, which ->


        }
        builder.setNeutralButton("Cancel"){dialogInterface , which ->
        }
        val alertDialog: AlertDialog = builder.create()
        alertDialog.setCancelable(false)
        alertDialog.show()
    }

    private fun countDown() {
        val countDownTimer = object : CountDownTimer(1584700200, 1000) {
            override fun onTick(p0: Long) {
                val millis: Long = p0
                val hms = String.format(
                    "%02d:%02d:%02d:%02d",
                    TimeUnit.HOURS.toDays(TimeUnit.MILLISECONDS.toDays(millis)),
                    (TimeUnit.MILLISECONDS.toHours(millis) - TimeUnit.DAYS.toHours(
                        TimeUnit.MILLISECONDS.toDays(
                            millis
                        )
                    )),
                    (TimeUnit.MILLISECONDS.toMinutes(millis) -
                            TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis))),
                    (TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(
                        TimeUnit.MILLISECONDS.toMinutes(millis)
                    ))
                )

                System.out.println("Time : " + hms)
                time_id.setText(hms);//set text
            }

            override fun onFinish() {
                /*clearing all fields and displaying countdown finished message          */
                fin_loc.setText("Votre Location est expiré");
                System.out.println("Time up")
            }
        }
        countDownTimer.start()
    }


    //start getting location

    public override fun onStart() {
        super.onStart()
        if (!checkPermissions()) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                requestPermissions()
            }
        }
        else {
            getLastLocation()
        }
    }
    private fun getLastLocation() {
        if (ActivityCompat.checkSelfPermission(
                        this,
                        Manifest.permission.ACCESS_FINE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                        this,
                        Manifest.permission.ACCESS_COARSE_LOCATION
                ) != PackageManager.PERMISSION_GRANTED
        ) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return
        }
        fusedLocationClient?.lastLocation!!.addOnCompleteListener(this) { task ->
            if (task.isSuccessful && task.result != null) {
                lastLocation = task.result
                position.setText( latitudeLabel + ": " + (lastLocation)!!.latitude +","+
                        longitudeLabel + ": " + (lastLocation)!!.longitude)
            }
            else {
                Log.w(TAG, "getLastLocation:exception", task.exception)
                showMessage("No location detected. Make sure location is enabled on the device.")
            }
        }
    }

    private fun showMessage(string: String) {

            Toast.makeText(this@EndLocationActivity, string, Toast.LENGTH_LONG).show()

    }
    private fun showSnackbar(
            mainTextStringId: String, actionStringId: String,
            listener: View.OnClickListener
    ) {
        Toast.makeText(this@EndLocationActivity, mainTextStringId, Toast.LENGTH_LONG).show()
    }
    private fun checkPermissions(): Boolean {
        val permissionState = ActivityCompat.checkSelfPermission(
                this,
                Manifest.permission.ACCESS_COARSE_LOCATION
        )
        return permissionState == PackageManager.PERMISSION_GRANTED
    }
    private fun startLocationPermissionRequest() {
        ActivityCompat.requestPermissions(
                this@EndLocationActivity,
                arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION),
                REQUEST_PERMISSIONS_REQUEST_CODE
        )
    }
    private fun requestPermissions() {
        val shouldProvideRationale = ActivityCompat.shouldShowRequestPermissionRationale(
                this,
                Manifest.permission.ACCESS_COARSE_LOCATION
        )
        if (shouldProvideRationale) {
            Log.i(TAG, "Displaying permission rationale to provide additional context.")
            showSnackbar("Location permission is needed for core functionality", "Okay",
                    View.OnClickListener {
                        startLocationPermissionRequest()
                    })
        }
        else {
            Log.i(TAG, "Requesting permission")
            startLocationPermissionRequest()
        }
    }
    override fun onRequestPermissionsResult(
            requestCode: Int, permissions: Array<String>,
            grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        Log.i(TAG, "onRequestPermissionResult")
        if (requestCode == REQUEST_PERMISSIONS_REQUEST_CODE) {
            when {
                grantResults.isEmpty() -> {
                    // If user interaction was interrupted, the permission request is cancelled and you
                    // receive empty arrays.
                    Log.i(TAG, "User interaction was cancelled.")
                }
                grantResults[0] == PackageManager.PERMISSION_GRANTED -> {
                    // Permission granted.
                    getLastLocation()
                }
                else -> {
                    showSnackbar("Permission was denied", "Settings",
                            View.OnClickListener {
                                // Build intent that displays the App settings screen.
                                val intent = Intent()
                                intent.action = Settings.ACTION_APPLICATION_DETAILS_SETTINGS
                                val uri = Uri.fromParts(
                                        "package",
                                        Build.DISPLAY, null
                                )
                                intent.data = uri
                                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                                startActivity(intent)
                            }
                    )
                }
            }
        }
    }
    companion object {
        private val TAG = "LocationProvider"
        private val REQUEST_PERMISSIONS_REQUEST_CODE = 34
    }

}