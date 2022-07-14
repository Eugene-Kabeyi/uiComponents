package com.eugene.uicomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myImage: ImageView = findViewById(R.id.imageView3)
        val checkRugby: CheckBox = findViewById(R.id.checkBox2)
        val checkFootball: CheckBox = findViewById(R.id.checkBox3)
        val toggleWifi: ToggleButton = findViewById(R.id.toggleButton)
        val switchTheme: Switch = findViewById(R.id.switchTheme)
        val groupGender: RadioGroup = findViewById(R.id.groupGender)


        var original = true
        myImage.setOnClickListener {
            if (original) {
                myImage.setImageResource(R.drawable.boom)
                original = false
            } else {
                myImage.setImageResource(R.drawable.home)
                original = true

            }
        }

        checkFootball.setOnCheckedChangeListener { checkbox, ischecked ->
            if (ischecked) {
                Toast.makeText(this, "Football Selected", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Football not Selected", Toast.LENGTH_SHORT).show()
            }
        }

        checkRugby.setOnCheckedChangeListener { checkbox1, ischecked1 ->
            if (ischecked1) {
                Toast.makeText(this, "Rugby Selected", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Rugby not Selected", Toast.LENGTH_SHORT).show()
            }
        }

        toggleWifi.setOnCheckedChangeListener { toggleButton, isTurnedOn ->
            if (isTurnedOn) {
                Toast.makeText(this, "Wifi on", Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(this, "Wifi off", Toast.LENGTH_SHORT).show()
            }
        }

        switchTheme.setOnCheckedChangeListener { compoundButton, ischecked ->
            if (ischecked) {
                Toast.makeText(this, "Dark Theme on", Toast.LENGTH_SHORT).show()

            } else {
                Toast.makeText(this, "Dark Theme off", Toast.LENGTH_SHORT).show()
            }
        }

        groupGender.setOnCheckedChangeListener { radioGroup, id ->
            if (id == R.id.radioButtonMale) {
                Toast.makeText(this, "Male Selected", Toast.LENGTH_SHORT).show()
            } else if (id == R.id.radioButtonFemale) {
                Toast.makeText(this, "Female Selected", Toast.LENGTH_SHORT).show()
            } else if (id == R.id.radioButtonOther) {
                Toast.makeText(this, "Other selected", Toast.LENGTH_SHORT).show()
            }

        }
    }
}

