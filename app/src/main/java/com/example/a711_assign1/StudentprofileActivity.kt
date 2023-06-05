package com.example.a711_assign1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class StudentprofileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_studentprofile)

        //Get the value from an intent object
        val name=intent.getStringExtra("Name")
        val address =intent.getStringExtra("Address")
        val profession =intent.getStringExtra("Profession")
        val dream_job =intent.getStringExtra("Dream Job")
        val fav_food =intent.getStringExtra("Favourite Food")

        //Assign value to text view object
        val textView26 = findViewById<TextView>(R.id.textView26)
        textView26.text = name
//    name_string.setText(name.toString())

        val textView27 = findViewById<TextView>(R.id.textView27)
//    profile_address .setText(address.toString())
        textView27.text = address

        val textView28 = findViewById<TextView>(R.id.textView28)
//    profile_profession.setText(profession.toString())
        textView28.text = profession

        val textView29 = findViewById<TextView>(R.id.textView29)
//    profile_dream_job .setText(dream_job.toString())
        textView29.text= dream_job

        val textView30 = findViewById<TextView>(R.id.textView30)
//    profile_fav_food.setText(fav_food.toString())
        textView30.text = fav_food
    }

}
