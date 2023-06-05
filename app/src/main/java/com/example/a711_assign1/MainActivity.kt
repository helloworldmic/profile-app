package com.example.a711_assign1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


fun Button_Click(v: View) {
    if (v.id == R.id.button1) {
        //creating an intent object using both activities
        val i = Intent(this@MainActivity, StudentprofileActivity::class.java)

        //java reference object for edit text control
        val edit_text11 = findViewById<EditText>(R.id.editText11)
        val edit_text12 = findViewById<EditText>(R.id.editText12)
        val edit_text13 = findViewById<EditText>(R.id.editText13)
        val edit_text14 = findViewById<EditText>(R.id.editText14)
        val edit_text15 = findViewById<EditText>(R.id.editText15)

        //getting value from edit text and assign to string message
        val name_string: String = edit_text11.text.toString()
        val address_string: String = edit_text12.text.toString()
        val profession_string: String = edit_text13.text.toString()
        val dream_job_string: String = edit_text14.text.toString()
        val fav_food_string: String = edit_text15.text.toString()


        //assigning value into intent object using key and values pairs.
        i.putExtra("Name", name_string)
        i.putExtra("Address", address_string)
        i.putExtra("Profession", profession_string)
        i.putExtra("Dream Job", dream_job_string)
        i.putExtra("Favourite Food", fav_food_string)
        //starting sub activity
        startActivity(i)
    }
}
}