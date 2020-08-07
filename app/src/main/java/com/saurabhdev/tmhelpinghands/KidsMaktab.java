package com.saurabhdev.tmhelpinghands;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class KidsMaktab extends AppCompatActivity {
    Button rulesurdu,ruleshindi,rulesenglish;
    ImageView ilhakformmaktab,mahanareport,getadmissionMaktab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kids_maktab);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        rulesurdu = (Button) findViewById(R.id.rulesurdu);
        rulesurdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rulesurdu();
            }
        });
        ruleshindi =(Button) findViewById(R.id.ruleshindi);
        ruleshindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ruleshindi();
            }
        });
        rulesenglish = (Button) findViewById(R.id.rulesenglish);
        rulesenglish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rulesenglish();
            }
        });

        ilhakformmaktab = (ImageView) findViewById(R.id.ilhakformmaktab);
        ilhakformmaktab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ilhakformmaktab();
            }
        });
        mahanareport =(ImageView) findViewById(R.id.mahanareport);
        mahanareport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mahanareport();
            }
        });
        getadmissionMaktab =(ImageView) findViewById(R.id.getadmissionMaktab);
        getadmissionMaktab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getadmissionMaktab();
            }
        });

    }
    public void rulesurdu(){
        Uri uri = Uri.parse("https://www.tanzeemulmakatib.org/wp-content/uploads/QWAYED-W-ZAWBIT-URDU.pdf");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void ruleshindi(){
        Uri uri = Uri.parse("https://www.tanzeemulmakatib.org/wp-content/uploads/QWAYED-W-ZWABIT-HINDI.pdf");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void rulesenglish(){
        Uri uri = Uri.parse("https://www.tanzeemulmakatib.org/wp-content/uploads/QWAYED-W-ZWABIT-ENGLISH.pdf");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void ilhakformmaktab(){
        Uri uri = Uri.parse("https://www.tanzeemulmakatib.org/wp-content/uploads/Ilhaaq-maktab.pdf");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void mahanareport(){
        Uri uri = Uri.parse("https://www.tanzeemulmakatib.org/wp-content/uploads/form-6a-Naqsha.pdf");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void getadmissionMaktab(){
        Uri uri = Uri.parse("https://www.tanzeemulmakatib.org/wp-content/uploads/form-6a-Naqsha.pdf");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}