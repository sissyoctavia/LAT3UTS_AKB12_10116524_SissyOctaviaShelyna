package com.example.sissy.sissyocta;
/*Nama : Sissy Octavia Shelyna
NIM  : 101164524
KELAS : AKB-IF12
Tanggal Pengerjaan : 02 Mei 2019*/

import android.support.v4.app.Fragment;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
public class dialog extends DialogFragment {
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog, container, false);
        int versionCode = BuildConfig.VERSION_CODE;
        String versionName = BuildConfig.VERSION_NAME;
        TextView txtversion = (TextView) view.findViewById(R.id.txtVersi1);
        txtversion.setText(versionName);
        return view;
    }
}