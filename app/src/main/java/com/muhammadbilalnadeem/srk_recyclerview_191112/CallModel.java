package com.muhammadbilalnadeem.srk_recyclerview_191112;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CallModel extends RecyclerView.Adapter {

    private int Dpimage;
    private int Callicon;
    private int callrecieveicon;
    private String time;
    private String name;
    private String divider;

    public CallModel(int dpimage, int callicon, int callrecieveicon, String time, String name, String divider) {
        Dpimage = dpimage;
        Callicon = callicon;
        this.callrecieveicon = callrecieveicon;
        this.time = time;
        this.name = name;
        this.divider = divider;
    }




    public void setDpimage(int dpimage) {
        Dpimage = dpimage;
    }

    public void setCallicon(int callicon) {
        Callicon = callicon;
    }

    public void setCallrecieveicon(int callrecieveicon) {
        this.callrecieveicon = callrecieveicon;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDivider(String divider) {
        this.divider = divider;
    }

    public int getDpimage() {
        return Dpimage;
    }

    public int getCallicon() {
        return Callicon;
    }

    public int getCallrecieveicon() {
        return callrecieveicon;
    }

    public String getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public String getDivider() {
        return divider;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
