package com.example.sissy.sissyocta;
/*Nama : Sissy Octavia Shelyna
NIM  : 101164524
KELAS : AKB-IF12
Tanggal Pengerjaan : 02 Mei 2019*/

import android.content.Intent;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

public class splashscreen extends AppCompatActivity {
    private int waktu_loading=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent home=new Intent(splashscreen.this, viewpager.class);
                startActivity(home);
                finish();

            }
        },waktu_loading);
    }
}
