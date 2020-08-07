package com.saurabhdev.tmhelpinghands;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class SocialAwarness extends AppCompatActivity {
    Button buttonwordshp,btntraing,btnmagsocio,btnbooksnd,btnconf2,btndaura,btnsocialm,btnqa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_awarness);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        buttonwordshp =(Button) findViewById(R.id.buttonwordshp);
        btntraing = (Button) findViewById(R.id.btntraing);
        btnmagsocio = (Button) findViewById(R.id.btnmagsocio);
        btnbooksnd = (Button) findViewById(R.id.btnbooksnd);
        btnconf2 = (Button) findViewById(R.id.btnconf2);
        btndaura =(Button) findViewById(R.id.btndaura);
        btnsocialm = (Button) findViewById(R.id.btnsocialm);
        btnqa = (Button) findViewById(R.id.btnqa);

        buttonwordshp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openworkshop();
            }
        });

        btntraing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentraining();
            }
        });
        btnmagsocio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openmagazine();
            }
        });
        btnbooksnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbookndb();
            }
        });
        btnconf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openconfndsemi();
            }
        });
        btndaura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentableegidaura();
            }
        });
        btnsocialm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                socialmedias();
            }
        });
        btnqa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openqasection();
            }
        });

    }
    public void openworkshop(){
        Intent intent = new Intent(this,Workshop.class);
        startActivity(intent);

    }
    public void opentraining(){
        Intent intent = new Intent (this,TrainingCamps.class);
        startActivity(intent);
    }
    public void openmagazine(){
        Intent intent = new Intent (this,MagazineSubs.class);
        startActivity(intent);
    }
    public void openbookndb(){
        Intent intent = new Intent(this,BooksndBooklets.class);
        startActivity(intent);
    }
    public void openconfndsemi(){
        Intent intent = new Intent (this,ConferenceSeminars.class);
        startActivity(intent);
    }
    public void opentableegidaura(){
        Intent intent = new Intent (this,TableegiDaura.class);
        startActivity(intent);
    }
    public void socialmedias(){
        Intent intent = new Intent (this,SocialMediaServices.class);
        startActivity(intent);
    }
    public void openqasection(){
        Intent intent = new Intent (this,QuestionAnswerSec.class);
        startActivity(intent);
    }


}