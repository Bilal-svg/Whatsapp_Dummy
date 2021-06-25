package com.muhammadbilalnadeem.srk_recyclerview_191112;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class Status extends Fragment {
    RecyclerView recyclerviewstatus;
    List<StatusModel> status;
    StatusAdapter adapter;

    public Status Status() {
        Status status=new Status();
        return status;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_status, container, false);
        status =new ArrayList<>();
        status.add(new StatusModel(R.drawable.srk1,"29 minutes ago","Bilal Nadeem","_____________________________________________________________________________________________________________________________________________"));
        status.add(new StatusModel(R.drawable.srk2,"2 minutes ago","Muneeb","_____________________________________________________________________________________________________________________________________________"));
        status.add(new StatusModel(R.drawable.srk3,"7 minutes ago","Ayesha","_____________________________________________________________________________________________________________________________________________"));
        status.add(new StatusModel(R.drawable.srk1,"18 minutes ago","Iqra","_____________________________________________________________________________________________________________________________________________"));
        status.add(new StatusModel(R.drawable.srk1,"12 minutes ago","Usama","_____________________________________________________________________________________________________________________________________________"));
        status.add(new StatusModel(R.drawable.srk2,"49 minutes ago","Tahir","_____________________________________________________________________________________________________________________________________________"));
        status.add(new StatusModel(R.drawable.srk3,"26 minutes ago","Anas","_____________________________________________________________________________________________________________________________________________"));
        status.add(new StatusModel(R.drawable.srk3,"12 minutes ago","Spogmai","_____________________________________________________________________________________________________________________________________________"));
        status.add(new StatusModel(R.drawable.srk1,"19 minutes ago","Danish","_____________________________________________________________________________________________________________________________________________"));
        status.add(new StatusModel(R.drawable.srk2,"4 minutes ago","Farhan","_____________________________________________________________________________________________________________________________________________"));
        status.add(new StatusModel(R.drawable.srk3,"3 minutes ago","Alina","_____________________________________________________________________________________________________________________________________________"));
        status.add(new StatusModel(R.drawable.srk1,"19 minutes ago","Monam","_____________________________________________________________________________________________________________________________________________"));
        status.add(new StatusModel(R.drawable.srk1,"12 minutes ago","Sanam","_____________________________________________________________________________________________________________________________________________"));
        status.add(new StatusModel(R.drawable.srk2,"55 minutes ago","Moazzam","_____________________________________________________________________________________________________________________________________________"));
        status.add(new StatusModel(R.drawable.srk3,"38 minutes ago","Ateeq","_____________________________________________________________________________________________________________________________________________"));


        recyclerviewstatus= view.findViewById(R.id.recyclerfragstatus);
        recyclerviewstatus.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter= new StatusAdapter(status);
        recyclerviewstatus.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        return  view;
    }
}