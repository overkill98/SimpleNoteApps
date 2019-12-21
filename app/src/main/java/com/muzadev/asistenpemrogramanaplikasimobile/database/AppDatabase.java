package com.muzadev.asistenpemrogramanaplikasimobile.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.muzadev.asistenpemrogramanaplikasimobile.model.Note;

@Database(
        entities = (Note.class),
        version = 1
)
public abstract class AppDatabase extends RoomDatabase {
    // TODO buat sebuah objek noteaDao dengan sifat abstract.
    public abstract NoteDao noteDao();

    // TODO buat sebuah objek AppDatabase dengan nama INSTANCE dengan sifat abstract.
    private static  AppDatabase INSTANCE;
    // TODO buat method getInstance untuk mengambil objek databasenya.
    public AppDatabase getINSTANCE(Context context){
        if (INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context, AppDatabase.class, "dbnote")
                    .build();
        }
        return INSTANCE;
    }
}
