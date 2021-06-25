package com.muhammadbilalnadeem.srk_recyclerview_191112;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ViewHolder>{
    private List<ChatModel> userlist;

    public ChatAdapter(List<ChatModel> userlist) {
        this .userlist=userlist;
    }
    @NonNull
    @Override
    public ChatAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatAdapter.ViewHolder holder, int position) {
        int imgresource=userlist.get(position).getDpimage();
        String Name=userlist.get(position).getTextName();
        String Message=userlist.get(position).getTextMessage();
        String Time=userlist.get(position).getTextTime();
        String Divider_line=userlist.get(position).getDivider();
        holder.setData(imgresource,Name,Message,Time,Divider_line);

    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView dpimage;
        private TextView textname,textmessage,texttime,devider;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            dpimage=itemView.findViewById(R.id.picture);
            textname=itemView.findViewById(R.id.txtname);
            textmessage=itemView.findViewById(R.id.txtmsg);
            texttime=itemView.findViewById(R.id.txttime);
            devider=itemView.findViewById(R.id.divider);
        }

        public void setData(int imgresource, String name, String message, String time, String divider_line) {
            dpimage.setImageResource(imgresource);
            textname.setText(name);
            textmessage.setText(message);
            texttime.setText(time);
            devider.setText(divider_line);
        }
    }
}
