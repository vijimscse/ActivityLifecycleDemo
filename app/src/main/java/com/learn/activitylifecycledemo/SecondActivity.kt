package com.learn.activitylifecycledemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class SecondActivity : AppCompatActivity() {

    companion object {
        const val TAG = "Second"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        Log.d(TAG, "Create")
    }

    override fun onStart() {
        super.onStart()

        Log.d(TAG, "Start")
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG, "Resume")
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG,  "Pause")
    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG, "Stop")
    }

    override fun onRestart() {
        super.onRestart()

        Log.d(TAG, "Restart")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, "Destroy")
    }
}
