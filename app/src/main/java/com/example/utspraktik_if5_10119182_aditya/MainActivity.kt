package com.example.utspraktik_if5_10119182_aditya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var inp_nama = findViewById(R.id.inp_nama) as EditText
        var inp_nik = findViewById(R.id.inp_nik) as EditText
        var inp_tgl = findViewById(R.id.inp_tgl) as EditText
        var inp_ttl = findViewById(R.id.inp_ttl) as EditText

    }

    }
