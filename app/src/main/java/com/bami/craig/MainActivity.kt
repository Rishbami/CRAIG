package com.bami.craig

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonView = findViewById<Button>(R.id.psonite)
        buttonView.setOnClickListener{
            val uri = Uri.parse("https://soundcloud.com/psonite")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }

        val robsonButton = findViewById<Button>(R.id.newcastle)
        robsonButton.setOnClickListener{
            val uri = Uri.parse("https://nufc.co.uk/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }


}