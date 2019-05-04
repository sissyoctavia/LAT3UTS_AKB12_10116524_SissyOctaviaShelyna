package com.example.sissy.sissyocta;
/*Nama : Sissy Octavia Shelyna
NIM  : 101164524
KELAS : AKB-IF12
Tanggal Pengerjaan : 02 Mei 2019*/

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

public class fragmentdaily extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<dailymodel> imageModelArrayList;
    private dailyadapter adapter;

    private int[] myImageList = new int[]{R.drawable.iconfinder_sleeping_well_4042278, R.drawable.iconfinder_eat_healthy_4042260, R.drawable.iconfinder_education_131979};
    private String[] myImageNameList = new String[]{"sleeping", "eating", "studying"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmentdaily, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler);

        imageModelArrayList = dailylist();
        adapter = new dailyadapter(this.getContext(),imageModelArrayList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext(), LinearLayoutManager.VERTICAL, false));
        return view;
    }

    private ArrayList<dailymodel> dailylist() {

        ArrayList<dailymodel> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            dailymodel fruitModel = new dailymodel();
            fruitModel.setName(myImageNameList[i]);
            fruitModel.setImage_drawable(myImageList[i]);
            list.add(fruitModel);
        }

        return list;
    }
}
