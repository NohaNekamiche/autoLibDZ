package com.clovertech.autolibdz.activities

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothServerSocket
import android.graphics.PorterDuff
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.clovertech.autolibdz.ui.HomeFragment
import com.clovertech.autolibdz.R
import com.clovertech.autolibdz.activities.auth.fragments.Register1Fragment
import com.clovertech.autolibdz.activities.auth.fragments.Register2Fragment
import com.clovertech.autolibdz.activities.auth.fragments.Register3Fragment
import kotlinx.android.synthetic.main.bottom_bar_layout.*
import kotlinx.android.synthetic.main.bottom_sheet_presistant_park.*
import java.util.*

val bluetoothAdapter: BluetoothAdapter? = BluetoothAdapter.getDefaultAdapter()

class HomeActivity : AppCompatActivity() {

    private val layouts : ArrayList<LinearLayout> = ArrayList()
    private val images : ArrayList<ImageView> = ArrayList()
    private val fragments : ArrayList<Fragment> = ArrayList()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        init()
        supportFragmentManager.beginTransaction().replace(R.id.fragments_container, fragments[0]).commit()

        for (i in layouts.indices) {
            layouts[i].setOnClickListener {
                editTint(i)
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.fragments_container, fragments[i])
                    .commit()
            }
        }


    }

    public fun closeConnection(mmServerSocket: BluetoothServerSocket?) {
        mmServerSocket?.close()
    }


    private fun init() {
        fragments.add(HomeFragment())
        fragments.add(Register1Fragment())
        fragments.add(Register2Fragment())
        fragments.add(Register3Fragment())
    }

    private fun editTint(pos: Int) {
        images.get(pos).setColorFilter(
            ContextCompat.getColor(this@HomeActivity, R.color.yello),
            PorterDuff.Mode.SRC_IN
        )
        for (i in images.indices) {
            if (i != pos) {
                images.get(i).setColorFilter(
                    ContextCompat.getColor(this@HomeActivity, R.color.dark_grey),
                    PorterDuff.Mode.SRC_IN
                )
            }
        }
    }
}

