package com.saurabhdev.tmhelpinghands;

import android.content.Intent;
//import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class AzadariSection extends AppCompatActivity {
    Button buttonmubramzan,buttonconfsem,buttonmajlis,buttonmahfil,buttontabbr3,buttonbooks,buttonmag3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azadari_section);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        buttonmubramzan = (Button) findViewById(R.id.buttontmubramzaan);
        buttonconfsem = (Button)findViewById(R.id.buttonconfsem);
        buttonmajlis = (Button)findViewById(R.id.buttonmajlis);
        buttonmahfil = (Button)findViewById(R.id.buttonmahfil);
        buttontabbr3 = (Button)findViewById(R.id.buttontbbr2);
        buttonbooks = (Button)findViewById(R.id.buttonbooks);
        buttonmag3 = (Button)findViewById(R.id.buttonmag3);

        buttonmubramzan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmuballigforramzaan();
            }
        });
        buttonconfsem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openconferencendsmin();
            }
        });
        buttonmajlis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmajlis();
            }
        });
        buttonmahfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmehfil();
            }
        });
        buttontabbr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentbrr2();
            }
        });
        buttonbooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbooksnsb();
            }
        });
        buttonmag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmagazine();
            }
        });

    }
    public void opentbrr2(){
        Intent intent = new Intent(this,Tabrrukat.class);
        startActivity(intent);

    }
    public void openmuballigforramzaan(){
        Intent intent = new Intent (this,MuballigZakirForRamzaan.class);
        startActivity(intent);
    }
    public void openconferencendsmin(){
        Intent intent = new Intent(this,ConferenceSeminars.class);
        startActivity(intent);
    }
    public void openmajlis(){
        Intent intent = new Intent (this, ZakirShairMajlis.class);
        startActivity(intent);
    }
    public void openmehfil(){
        Intent intent = new Intent (this,ZakirShairMehfil.class);
        startActivity(intent);
    }
    public void openbooksnsb(){
        Intent intent = new Intent(this,BooksndBooklets.class);
        startActivity(intent);
    }
    public void openmagazine(){
        Intent intent = new Intent(this,MagazineSubs.class);
        startActivity(intent);
    }



}