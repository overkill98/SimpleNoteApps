package com.muzadev.asistenpemrogramanaplikasimobile.view;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.muzadev.asistenpemrogramanaplikasimobile.R;
import com.muzadev.asistenpemrogramanaplikasimobile.database.AppDatabase;
import com.muzadev.asistenpemrogramanaplikasimobile.database.NoteDao;
import com.muzadev.asistenpemrogramanaplikasimobile.model.Note;

public class TodoActivity extends AppCompatActivity {
    // Deklarasi objek
    private EditText etTodoContent, etTodoTitle;
    private Button btnSave;
    private NoteDao noteDao;

    private NoteDao noteDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);

        etTodoContent = findViewById(R.id.etTodoContent);
        etTodoTitle = findViewById(R.id.etTodoTitle);
        btnSave = findViewById(R.id.btnSave);

        // TODO inisialisasi noteDao
        noteDao = AppDatabase.getInstance().noteDao;

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveTodo();
            }
        });
    }

    private void saveTodo() {
        String title = etTodoTitle.getText().toString();
        String content = etTodoContent.getText().toString();
        Note note = new Note(content, title);
        CreateTodoAsync createTodoAsync = new CreateTodoAsync();
        createTodoAsync.execute(note);
    }

    private class CreateTodoAsync extends AsyncTask<Note, Void, Void> {
        @Override
        protected Void doInBackground(Note... notes) {
            noteDao.createNote(notes[0]);
            return null;
        }
    }

    //TODO buat asyncTask untuk menyimpan note ke database
}
