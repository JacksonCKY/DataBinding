package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val myContact: Contact = Contact("sett","1234" )
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.contact = myContact

        binding.buttonDone.setOnClickListener {
            changeContact(it)
        }
    }

    private fun changeContact(it: View){
        binding.apply {
            contact?.name = editTextName.text.toString()
            contact?.phone = editTextAge.text.toString()
            this.invalidateAll()
        }
    }
}
