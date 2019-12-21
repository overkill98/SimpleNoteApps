package com.muzadev.asistenpemrogramanaplikasimobile.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

// TODO jadikan class Note sebagai table/entitas

@Entity(tableName = "tbl_note")

public class Note {

    // TODO buat property id

    @PrimaryKey(autoGenerate = true)
    int id;
    String title;
    String content;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}