package com.muzadev.asistenpemrogramanaplikasimobile.view;

import android.os.AsyncTask;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.muzadev.asistenpemrogramanaplikasimobile.R;
import com.muzadev.asistenpemrogramanaplikasimobile.adapter.AdpTodo;
import com.muzadev.asistenpemrogramanaplikasimobile.database.NoteDao;
import com.muzadev.asistenpemrogramanaplikasimobile.model.Note;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    // TODO Deklarasi Objek
    private RecyclerView rvTodo;
    private AdpTodo adpTodo;
    private NoteDao noteDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO inisialisasikan noteDao

        // TODO uncomment inisialisasi berikut
        /*adpTodo = new AdpTodo(this);
        rvTodo = findViewById(R.id.rvTodo);
        rvTodo.setLayoutManager(new LinearLayoutManager(this));
        rvTodo.addItemDecoration(new DividerItemDecoration(this, RecyclerView.VERTICAL));
        rvTodo.setAdapter(adpTodo);*/
    }

    @Override
    protected void onStart() {
        super.onStart();
        getTodoData();
    }

    private void getTodoData() {
        // TODO Ambil hasil query dary asyncTask menggunakan execption
        // TODO Maskan hasil query ke adapter
    }

    // TODO Tampilkan menu plus

    // TODO Lakukan sesuatu ketika menu diklik

    // TODO buat asyncTask untuk menquery note
//    class ReadTodoAsync extends AsyncTask<Void, Void, List<Note>>{}
}
