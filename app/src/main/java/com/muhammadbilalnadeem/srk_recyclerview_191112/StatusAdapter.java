package com.muhammadbilalnadeem.srk_recyclerview_191112;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StatusAdapter extends RecyclerView.Adapter<StatusAdapter.ViewHolder> {
    private List<StatusModel> list_status;
    public StatusAdapter(List<StatusModel> list_status){
        this .list_status=list_status;
    }

    @NonNull
    @Override
    public StatusAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.status_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StatusAdapter.ViewHolder holder, int position) {
        int imgcststus=list_status.get(position).getStatuspic();
        String Name=list_status.get(position).getName();
        String time=list_status.get(position).getTime();
        String Divider_line=list_status.get(position).getDivider();
        holder.setData(imgcststus,Name,time,Divider_line);
    }

    @Override
    public int getItemCount() {
        return list_status.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView statusimage;
        private TextView textname,texttimming,devider;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textname=itemView.findViewById(R.id.statusname);
            statusimage=itemView.findViewById(R.id.picturestatus);
            texttimming=itemView.findViewById(R.id.statustime);
            devider=itemView.findViewById(R.id.divider);

        }

        public void setData(int imgcststus, String name, String time, String divider_line) {
            statusimage.setImageResource(imgcststus);
            textname.setText(name);
            texttimming.setText(time);
            devider.setText(divider_line);
        }
    }
}
