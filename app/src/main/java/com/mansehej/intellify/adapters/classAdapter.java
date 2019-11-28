package com.mansehej.intellify.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.mansehej.intellify.R;
import com.mansehej.intellify.model.classData;

import java.util.ArrayList;

public class classAdapter extends RecyclerView.Adapter<classAdapter.classViewHolder> {

    Context context;
    ArrayList<classData> obj;

    public classAdapter(Context context, ArrayList<classData> obj) {
        this.context = context;
        this.obj = obj;
    }

    @NonNull
    @Override
    public classViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.class_item, parent, false);
        return new classViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull classViewHolder holder, int position) {
        holder.tvName.setText(obj.get(position).getclassName().toString());
        holder.attended.setText("Attended " + obj.get(position).getPresent() + " out of " + obj.get(position).getTotalLectures() + " classes.");
    }

    @Override
    public int getItemCount() {
        return obj.size();
    }

    public class classViewHolder extends RecyclerView.ViewHolder{

        TextView tvName;
        TextView attended;
        public classViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            attended = itemView.findViewById(R.id.tvAttended);
        }
    }
}
