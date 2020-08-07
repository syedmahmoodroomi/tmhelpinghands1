package com.saurabhdev.tmhelpinghands;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class SocialEconomic extends AppCompatActivity {
    Button btnscholarship,btnsyllabus,btnworkshop,btntrainingcamps,btncareercouncelling,btnfamilycounselling,btnloanhelp,btndiariescalenders;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_economic);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        btndiariescalenders =(Button) findViewById(R.id.btndiariescalenders);
        btndiariescalenders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbtndiariescalenders();
            }
        });

        btnscholarship= (Button) findViewById(R.id.btnscholarship);
        btnscholarship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbtnscholarship();
            }
        });
        btnsyllabus=(Button) findViewById(R.id.btnsyllabus);
        btnsyllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbtnsyllabus();
            }
        });
        btnworkshop = (Button) findViewById(R.id.btnworkshop);
        btnworkshop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbtnworkshop();
            }
        });
        btntrainingcamps =(Button) findViewById(R.id.btntrainingcamps);
        btntrainingcamps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbtntrainingcamps();
            }
        });
        btncareercouncelling = (Button) findViewById(R.id.btncareercouncelling);
        btncareercouncelling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbtncareercouncelling();
            }
        });
        btnfamilycounselling = (Button) findViewById(R.id.btnfamilycounselling);
        btnfamilycounselling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbtnfamilycounselling();
            }
        });
        btnloanhelp = (Button) findViewById(R.id.btnloanhelp);
        btnloanhelp.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbtnloanhelp();
            }
        }));


    }
    public void openbtnscholarship(){
        Intent intent = new Intent (this,Scholarships.class);
        startActivity(intent);
    }
    public void openbtnsyllabus(){
        Intent intent = new Intent (this,SyllabusForEdu.class);
        startActivity(intent);
    }
    public void openbtnworkshop(){
        Intent intent = new Intent (this,Workshop.class);
        startActivity(intent);
    }
    public void openbtntrainingcamps(){
        Intent intent = new Intent (this,TrainingCamps.class);
        startActivity(intent);
    }
    public void openbtncareercouncelling(){
        Intent intent = new Intent (this,CareerCounselling.class);
        startActivity(intent);
    }
    public void openbtnloanhelp(){
        Intent intent = new Intent (this,LoanNdHelp.class);
        startActivity(intent);
    }
    public void  openbtnfamilycounselling() {
        Intent intent = new Intent(this, FamilyCounselling.class);
        startActivity(intent);
    }
    public void openbtndiariescalenders(){
        Intent intent = new Intent(this, DiariesandCalender.class);
        startActivity(intent);
    }

}