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
import java.util.ListIterator;


public class Call extends Fragment {
    RecyclerView recyclerviewcall;
    List<CallModel> list_calls;
    CallAdapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_call, container, false);
        list_calls =new ArrayList<>();

        list_calls.add(new CallModel(R.drawable.srk1,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_call_received_24,"Today,1:50 PM","Bilal Nadeem","_____________________________________________________________________________________________________________________________________________"));
        list_calls.add(new CallModel(R.drawable.srk2,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_call_made_24,"Yesterday,2:50 PM","Danish","_____________________________________________________________________________________________________________________________________________"));
        list_calls.add(new CallModel(R.drawable.srk3,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_call_received_24,"Today,3:50 PM","Usama","_____________________________________________________________________________________________________________________________________________"));
        list_calls.add(new CallModel(R.drawable.srk2,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_call_made_24,"Yesterday,7:50 PM","Huzaifa","_____________________________________________________________________________________________________________________________________________"));
        list_calls.add(new CallModel(R.drawable.srk1,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_call_received_24,"Today,9:50 PM","Iqra","_____________________________________________________________________________________________________________________________________________"));
        list_calls.add(new CallModel(R.drawable.srk2,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_call_made_24,"Today,2:50 PM","Maham","_____________________________________________________________________________________________________________________________________________"));
        list_calls.add(new CallModel(R.drawable.srk3,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_call_received_24,"Yesterday,1:50 PM","Hafsa","_____________________________________________________________________________________________________________________________________________"));
        list_calls.add(new CallModel(R.drawable.srk2,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_call_made_24,"Today,1:50 PM","Muneeb","_____________________________________________________________________________________________________________________________________________"));
        list_calls.add(new CallModel(R.drawable.srk1,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_call_received_24,"Yesterday,2:50 PM","Ayesha","_____________________________________________________________________________________________________________________________________________"));
        list_calls.add(new CallModel(R.drawable.srk2,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_call_made_24,"Today,5:50 PM","Tahir","_____________________________________________________________________________________________________________________________________________"));
        list_calls.add(new CallModel(R.drawable.srk3,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_call_received_24,"Yesterday,3:50 PM","Farhad","_____________________________________________________________________________________________________________________________________________"));
        list_calls.add(new CallModel(R.drawable.srk3,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_call_made_24,"Today,8:50 PM","Anas","_____________________________________________________________________________________________________________________________________________"));
        list_calls.add(new CallModel(R.drawable.srk1,R.drawable.ic_baseline_call_24,R.drawable.ic_baseline_call_received_24,"Today,1:50 PM","Haad","_____________________________________________________________________________________________________________________________________________"));
        recyclerviewcall= view.findViewById(R.id.recyclerfragcall);
        recyclerviewcall.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter= new CallAdapter(list_calls);
        recyclerviewcall.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        return view;
    }
}