package com.muzadev.asistenpemrogramanaplikasimobile.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.muzadev.asistenpemrogramanaplikasimobile.R;
import com.muzadev.asistenpemrogramanaplikasimobile.model.Note;

import java.util.ArrayList;
import java.util.List;

public class AdpTodo extends RecyclerView.Adapter<AdpTodo.ViewHolder> {
    private Context context;
    private List<Note> noteList;

    public AdpTodo(Context context) {
        this.context = context;
        noteList = new ArrayList<>();
    }

    public void setData(List<Note> noteList) {
        this.noteList.clear();
        this.noteList.addAll(noteList);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_todo, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindView(noteList.get(position));
    }

    @Override
    public int getItemCount() {
        return noteList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvTodoTitle, tvTodoContent;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTodoTitle = itemView.findViewById(R.id.tvTodoTitle);
            tvTodoContent = itemView.findViewById(R.id.tvTodoContent);
        }

        public void bindView(Note note) {
            tvTodoTitle.setText(note.getTitle());
            tvTodoContent.setText(note.getContent());
        }
    }
}
