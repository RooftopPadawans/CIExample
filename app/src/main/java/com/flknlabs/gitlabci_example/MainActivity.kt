package com.flknlabs.gitlabci_example

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a=1

        Toast.makeText(this, "Testing toast", Toast.LENGTH_SHORT).show()
    }
}
