package com.andromojo.testdatabase;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.holder> {
    ArrayList<Student> students;

    public CustomAdapter(ArrayList<Student> students) {
        this.students = students;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.student_row, parent, false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        holder.tv.setText(students.get(position).getStudentName());
        holder.tv2.setText(String.valueOf(students.get(position).getID()));
    }

    @Override
    public int getItemCount() {
        return students.size();
    }


    class holder extends RecyclerView.ViewHolder {
        TextView tv, tv2;

        public holder(@NonNull View itemView) {
            super(itemView);
            tv = (TextView) itemView.findViewById(R.id.t1);
            tv2 = (TextView) itemView.findViewById(R.id.t2);
        }
    }


}