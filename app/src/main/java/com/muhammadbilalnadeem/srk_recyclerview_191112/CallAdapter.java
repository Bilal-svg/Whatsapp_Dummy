package com.muhammadbilalnadeem.srk_recyclerview_191112;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CallAdapter extends RecyclerView.Adapter<CallAdapter.ViewHolder> {
        private List<CallModel> list;
    public CallAdapter(List<CallModel> list)
    {this .list=list;}
    @NonNull
    @Override
    public CallAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.call_design,parent,false);
        return new CallAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CallAdapter.ViewHolder holder, int position) {

        int imgresource=list.get(position).getDpimage();
        int imgcall=list.get(position).getCallicon();
        int imgcallrecieve=list.get(position).getCallrecieveicon();
        String Name=list.get(position).getName();
        String time=list.get(position).getTime();
        String Divider_line=list.get(position).getDivider();
        holder.setData(imgresource,imgcall,imgcallrecieve,Name,time,Divider_line);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView dpimage,call,callrec;
        private TextView textname,texttimming,devider;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            dpimage=itemView.findViewById(R.id.picturecall);
            textname=itemView.findViewById(R.id.txtname);
            call=itemView.findViewById(R.id.callicon);
            callrec=itemView.findViewById(R.id.callsent);
            texttimming=itemView.findViewById(R.id.txttiming);
            devider=itemView.findViewById(R.id.divider);
        }

        public void setData(int imgresource, int imgcall, int imgcallrecieve, String name, String time, String divider_line) {

            dpimage.setImageResource(imgresource);
            call.setImageResource(imgcall);
            callrec.setImageResource(imgcallrecieve);
            textname.setText(name);
            texttimming.setText(time);
            devider.setText(divider_line);
        }
    }
}
