package com.example.notapphomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.notapphomework.databinding.ActivityMainBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var database = FirebaseDatabase.getInstance().reference

        // veri ekleme işlemi

        binding.buttonSubmit.setOnClickListener {
            var editTextNotes = binding.editTextNotes.toString()

            database.setValue(Notlar(editTextNotes.toString()))
   }
        var getdata = object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                var sb = StringBuilder()
                for (i in snapshot.children){
                    var notum = i.child("note").getValue()
                    sb.append("${i.key} $notum  \n")

                }
                binding.tvSonuc.setText(sb)
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }

        }
        database.addValueEventListener(getdata)
        database.addListenerForSingleValueEvent(getdata)
    }
}