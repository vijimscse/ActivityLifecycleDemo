package com.learn.activitylifecycledemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG = "Main"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "on Create")

        start_second_activity.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
        //Calling finish(), directly calls onDestroy()
      //  finish()
    }

    override fun onStart() {
        super.onStart()

        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG,  "on pause")
    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG, "on Stop")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d(TAG, "on restart")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, "on destroy")
    }
}
