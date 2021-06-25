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

public class Chat extends Fragment {

    RecyclerView recyclerview;
    List<ChatModel> userlist;
    ChatAdapter adapter;

    public Chat Chat() {
        Chat chat=new Chat();
        return chat;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_chat, container, false);
        userlist =new ArrayList<>();
        userlist.add(new ChatModel(R.drawable.srk1,"Bilal Nadeem","My name is Khan ","1:33AM","_____________________________________________________________________________________________________________________________________________"));
        userlist.add(new ChatModel(R.drawable.srk3,"Jab tk ha jan","and i am not a terroist!","8:33PM","_____________________________________________________________________________________________________________________________________________"));
        userlist.add(new ChatModel(R.drawable.srk2,"Don","Are you done with the project? ","5:27AM","_____________________________________________________________________________________________________________________________________________"));
        userlist.add(new ChatModel(R.drawable.srk3,"Huzaifa","Don ko pkrna mushkil hi nahi na mumkin ha!","1:41AM","_____________________________________________________________________________________________________________________________________________"));
        userlist.add(new ChatModel(R.drawable.srk3,"Iqra","Kal Ho na ho!","3:52AM","_____________________________________________________________________________________________________________________________________________"));
        userlist.add(new ChatModel(R.drawable.srk1,"Muneeb","Jab Harry Met Sajal","7:38AM","_____________________________________________________________________________________________________________________________________________"));
        userlist.add(new ChatModel(R.drawable.srk2,"Danish","Kuch Kuch hota ha!","1:41PM","_____________________________________________________________________________________________________________________________________________"));
        userlist.add(new ChatModel(R.drawable.srk3,"Usama","Kabi Alvida na kehna","3:52AM","_____________________________________________________________________________________________________________________________________________"));
        userlist.add(new ChatModel(R.drawable.srk3,"Maham","bary bary shehron main","7:38PM","_____________________________________________________________________________________________________________________________________________"));
        userlist.add(new ChatModel(R.drawable.srk1,"Ayesha","choti choti batain hoti rehti hain","1:41AM","_____________________________________________________________________________________________________________________________________________"));
        userlist.add(new ChatModel(R.drawable.srk2,"Spogmai","Seniorita!","3:52AM","_____________________________________________________________________________________________________________________________________________"));
        userlist.add(new ChatModel(R.drawable.srk3,"Anas","Kiska hai ya tum ko intezar","7:38AM","_____________________________________________________________________________________________________________________________________________"));
        userlist.add(new ChatModel(R.drawable.srk3,"Haad","Main hun na ;)","1:41PM","_____________________________________________________________________________________________________________________________________________"));

        recyclerview= view.findViewById(R.id.recyclerviewfrag);
        recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new ChatAdapter(userlist);
        recyclerview.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        return view;
    }
}