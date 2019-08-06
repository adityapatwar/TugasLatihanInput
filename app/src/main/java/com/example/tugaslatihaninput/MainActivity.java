package com.example.tugaslatihaninput;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText input1;
    private EditText input2;
    private EditText hasil;
    private Button Jumlahkan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);
        initUI ();
        initEvent ();


    }

    private void initUI(){
        input1 = findViewById (R.id.textInput1);
        input2 = findViewById (R.id.textInput2);
        hasil = findViewById (R.id.textoOtput);
        Jumlahkan = findViewById (R.id.btnJumlahkan);
    }

    private void hitungJumlah(){
        int angka1 = Integer.parseInt(input1.getText ().toString ());
        int angka2 = Integer.parseInt(input2.getText ().toString ());
        int total = angka1 + angka2;
        hasil.setText (total+"");

    }

    private void initEvent(){
        Jumlahkan.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                hitungJumlah ();
            }
        });

    }


}
