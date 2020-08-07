package com.saurabhdev.tmhelpinghands;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class CommunityServices extends AppCompatActivity {
    Button btnmedicalhelp,btnscholarship2,btnlifenecess,btndaughtermarriage,btncareercouncelling2,btnfamilycounselling2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community_services);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();


        btnmedicalhelp = (Button) findViewById(R.id.btnmedicalhelp);
        btnmedicalhelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbtnmedicalhelp();
            }
        });
        btnscholarship2 =(Button) findViewById(R.id.btnscholarship2);
        btnscholarship2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbtnscholarship2();
            }
        });
        btnlifenecess = (Button) findViewById(R.id.btnlifenecess);
        btnlifenecess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbtnlifenecess();
            }
        });
        btndaughtermarriage = (Button) findViewById(R.id.btndaughtermarriage);
        btndaughtermarriage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbtndaughtermarriage();
            }
        });
        btncareercouncelling2 = (Button) findViewById(R.id.btncareercouncelling2);
        btncareercouncelling2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbtncareercouncelling2();
            }
        });
        btnfamilycounselling2 = (Button) findViewById(R.id.btnfamilycounselling2);
        btnfamilycounselling2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openbtnfamilycounselling2();
            }
        });
    }
    public void openbtnmedicalhelp(){
        Intent intent = new Intent (this,MedicalHelp.class);
        startActivity(intent);
    }
    public void openbtnscholarship2(){
        Intent intent = new Intent (this,Scholarships.class);
        startActivity(intent);
    }
    public void openbtnlifenecess(){
        Intent intent = new Intent (this,LifeNeccessities.class);
        startActivity(intent);
    }
    public void openbtndaughtermarriage(){
        Intent intent = new Intent (this,DaughterMarriage.class);
        startActivity(intent);
    }
    public void openbtncareercouncelling2(){
        Intent intent = new Intent (this,CareerCounselling.class);
        startActivity(intent);
    }
    public void openbtnfamilycounselling2(){
        Intent intent = new Intent (this,FamilyCounselling.class);
        startActivity(intent);
    }


}