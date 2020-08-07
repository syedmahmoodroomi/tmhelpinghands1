package com.saurabhdev.tmhelpinghands;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class EducationSection extends AppCompatActivity {
    Button buttonkids,buttonemaktab,buttonisc,buttonmcs,buttonmft,buttonji,buttonjz,buttonsyllabus,buttonmag,buttonreading,buttonengt,btnyouth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education_section);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        buttonkids =(Button) findViewById(R.id.buttonmaktab);
        buttonemaktab = (Button)findViewById(R.id.buttonemaktab);
        buttonisc =(Button)findViewById(R.id.buttonisc);
        buttonmft = (Button)findViewById(R.id.buttonmadasateen);
        buttonmcs = (Button)findViewById(R.id.buttoncumsch);
        buttonji = (Button)findViewById(R.id.buttonji);
        buttonjz = (Button)findViewById(R.id.buttonjz);
        buttonsyllabus = (Button)findViewById(R.id.buttonsyll);
        buttonmag = (Button) findViewById(R.id.buttonmag);
        buttonreading = (Button)findViewById(R.id.buttonreading);
        buttonengt = (Button)findViewById(R.id.buttonengt);
        btnyouth = (Button) findViewById(R.id.btnyouth);

        buttonkids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openkids();
            }
        });
        buttonemaktab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmaktab();
            }
        });
       buttonisc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openisc();
            }
        });
        buttonmft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmft();
            }
        });
        buttonmcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               openmcs();
            }
        });
        buttonji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openji();
            }
        });
        buttonjz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openjz();
            }
        });
        buttonsyllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensyllabus();
            }
        });
        buttonmag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmag();
            }
        });
        buttonreading.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openreading();
            }
        });
        buttonengt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openengt();
            }
        });
        btnyouth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbtnyouth();
            }
        });



    }
    public void openkids() {
        Intent intent = new Intent(this, KidsMaktab.class);
        startActivity(intent);
    }
    public void openmaktab() {
        Intent intent = new Intent(this, EmaktabReg.class);
        startActivity(intent);
    }
    public void openisc() {
        Intent intent = new Intent(this, IscAffiliationForm.class);
        startActivity(intent);
    }
    public void openmft() {
        Intent intent = new Intent(this, MadarsaForTeen.class);
        startActivity(intent);
    }
    public void openmcs() {
        Intent intent = new Intent(this, MaktabCumschool.class);
        startActivity(intent);
    }
    public void openji() {
        Intent intent = new Intent(this, JamiaI.class);
        startActivity(intent);
    }
    public void openjz() {
        Intent intent = new Intent(this, JameatuzZ.class);
        startActivity(intent);
    }
    public void opensyllabus() {
        Intent intent = new Intent(this, SyllabusForEdu.class);
        startActivity(intent);
    }
    public void openmag () {
        Intent intent = new Intent(this, MagazineSubs.class);
        startActivity(intent);
    }
    public void openreading () {
        Intent intent = new Intent(this, BookReading.class);
        startActivity(intent);
    }
    public void openengt () {
        Intent intent = new Intent(this, Engt.class);
        startActivity(intent);
    }
    public void openbtnyouth(){
        Intent intent = new Intent (this,MadarsaForYouth.class);
        startActivity(intent);
    }



}