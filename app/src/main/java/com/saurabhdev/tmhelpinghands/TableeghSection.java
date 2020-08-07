package com.saurabhdev.tmhelpinghands;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class TableeghSection extends AppCompatActivity {
    Button btnworkshp,btntraincmp,btnmagzine1,btnboolets,btndaura,btnconf23;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tableegh_section);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        btnworkshp = (Button) findViewById(R.id.btnworkshp);
        btntraincmp = (Button) findViewById(R.id.btntraincmp);
        btnmagzine1 = (Button) findViewById(R.id.btnmagzine1);
        btnboolets = (Button) findViewById(R.id.btnboolets);
        btndaura = (Button) findViewById(R.id.btndaura);
        btnconf23 = (Button) findViewById(R.id.btnconf23);
       // tanzeembtn = (Button) findViewById(R.id.tanzeembtn);

       /* tanzeembtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhome();
            }
        });*/

        btnworkshp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnworkshp();
            }
        });
        btntraincmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btntraincmp();
            }
        });
        btnmagzine1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnmagzine1();
            }
        });
        btnboolets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnboolets();
            }
        });
        btndaura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btndaura();
            }
        });
        btnconf23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnconf23();
            }
        });
    }
    public void btnconf23(){
        Intent intent = new Intent (this,ConferenceSeminars.class);
        startActivity(intent);
    }
    public void btndaura(){
        Intent intent = new Intent (this,TableegiDaura.class);
        startActivity(intent);
    }
    public void btnboolets(){
        Intent intent =new Intent(this,BooksndBooklets.class);
        startActivity(intent);
    }
    public void btnmagzine1(){
        Intent intent =new Intent(this,MagazineSubs.class);
        startActivity(intent);
    }
    public void btntraincmp(){
        Intent intent =new Intent(this,TrainingCamps.class);
        startActivity(intent);
    }
    public void btnworkshp(){
        Intent intent =new Intent(this,Workshop.class);
        startActivity(intent);
    }
    /*public void openhome(){
        Intent intent =new Intent(this,MainActivity.class);
        startActivity(intent);
    }*/

}