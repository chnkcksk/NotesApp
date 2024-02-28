package com.example.notesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.floatingactionbutton.FloatingActionButton

class NoteAddScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_add_screen)

        val saveNoteBtn = findViewById<Button>(R.id.saveNoteBtn)
        saveNoteBtn.setOnClickListener{
            val intent = Intent(this, NotesScreen::class.java)
            startActivity(intent)
        }

    }
}