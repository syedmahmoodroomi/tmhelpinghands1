package com.saurabhdev.tmhelpinghands;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class CultureSection extends AppCompatActivity {
    Button buttontabrr,buttonmubzak,buttonwork,buttontraining,buttonlibs,buttongifts,buttondecor,buttondiary,buttonmagz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culture_section);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        buttontabrr =(Button)findViewById(R.id.buttontabrr);
        buttonmubzak =(Button)findViewById(R.id.buttonmubzak);
        buttonwork =(Button)findViewById(R.id.buttonwork);
        buttontraining = (Button)findViewById(R.id.buttontraining);
        buttonlibs =(Button)findViewById(R.id.buttonlibas);
        buttongifts = (Button)findViewById(R.id.buttongift);
        buttondecor = (Button)findViewById(R.id.buttondecor);
        buttondiary =(Button)findViewById(R.id.buttondiary);
        buttonmagz = (Button)findViewById(R.id.buttonmag2);

        buttontabrr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentabrr();
            }
        });
        buttonmubzak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmubzak();
            }
        });
        buttonwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openwork();
            }
        });
        buttontraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentraining();
            }
        });
        buttonlibs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openlibas();
            }
        });
        buttongifts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengifts();
            }
        });
        buttondecor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendecor();
            }
        });
        buttondiary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opendiaries();
            }
        });
        buttonmagz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmag();
            }
        });

    }
    public void opentabrr(){
        Intent intent =new Intent(this,Tabrrukat.class);
        startActivity(intent);
    }
    public void openmubzak(){
        Intent intent =new Intent(this, MuballigZakirForRamzaan.class);
        startActivity(intent);
    }
    public void openwork(){
        Intent intent =new Intent(this,Workshop.class);
        startActivity(intent);
    }
    public void opentraining(){
        Intent intent =new Intent(this,TrainingCamps.class);
        startActivity(intent);
    }
    public void openlibas(){
        Intent intent =new Intent(this,IslamicLibas.class);
        startActivity(intent);
    }
    public void opengifts(){
        Intent intent =new Intent(this,IslamicGifts.class);
        startActivity(intent);
    }
    public void opendecor(){
        Intent intent =new Intent(this, IslamicDecoration.class);
        startActivity(intent);
    }
    public void opendiaries(){
        Intent intent =new Intent(this, DiariesandCalender.class);
        startActivity(intent);
    }
    public void openmag(){
        Intent intent =new Intent(this, MagazineSubs.class);
        startActivity(intent);
    }

}