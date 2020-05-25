package com.example.mywechat;


import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class weixinFragment extends Fragment {

    private RecyclerView recyclerView;
    private List<String> list;
    private Context context;
    private adapter adapter;

    public weixinFragment() {
        // Required empty public constructor
    }

    private void init(){
        recyclerView= recyclerView.findViewById(R.id.recyclerview);
        list=new ArrayList<String>();
        context=this.context;

        list.add("计算机图形学");
        list.add("web程序设计");
        list.add("Linux");
        list.add("算法设计");
        list.add("数据库原理");
        list.add("高等数学");
        list.add("大学英语");
        list.add("数字逻辑");
        list.add("Java");
        list.add("计算机组成原理");


        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(context);
        linearLayoutManager.setOrientation(linearLayoutManager.VERTICAL);
        adapter=new adapter(context,list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //init();
        return inflater.inflate(R.layout.tab01, container, false);
    }
}
