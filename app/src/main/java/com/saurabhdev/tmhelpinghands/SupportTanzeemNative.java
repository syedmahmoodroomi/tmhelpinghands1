package com.saurabhdev.tmhelpinghands;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class SupportTanzeemNative extends AppCompatActivity {
    Button btndonation,btnkhums,btnsaqah,btnfitrah,btnimamzamin,btnrukum,btnmembership,btnmagpays,btnsponsorship,btnnadarfund,btnisalesawab,btntameerat,btnmuballigfund,
            btnjameat,btnijarah,btneshopay,btnjoinhands,btnmytxns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_support_tanzeem_native);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        btndonation =(Button) findViewById(R.id.btndonation);
        btnkhums =(Button) findViewById(R.id.btnkhums);
        btnsaqah =(Button) findViewById(R.id.btnsaqah);
        btnfitrah =(Button) findViewById(R.id.btnfitrah);
        btnimamzamin =(Button) findViewById(R.id.btnimamzamin);
        btnrukum =(Button) findViewById(R.id.btnrukum);
        btnmembership =(Button) findViewById(R.id.btnmembership);
        btnmagpays =(Button) findViewById(R.id.btnmagpays);
        btnsponsorship =(Button) findViewById(R.id.btnsponsorship);
        btnnadarfund =(Button) findViewById(R.id.btnnadarfund);
        btnisalesawab =(Button) findViewById(R.id.btnisalesawab);
        btntameerat =(Button) findViewById(R.id.btntameerat);
        btnmuballigfund =(Button) findViewById(R.id.btnmuballigfund);
        btnjameat =(Button) findViewById(R.id.btnjameat);
        btnijarah =(Button) findViewById(R.id.btnijarah);
        btneshopay =(Button) findViewById(R.id.btneshopay);
        btnjoinhands =(Button) findViewById(R.id.btnjoinhands);
        btnmytxns =(Button) findViewById(R.id.btnmytxns);

        btndonation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opendonations();
            }
        });
        btnkhums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openkhums();
            }
        });
        btnsaqah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensadqah();
            }
        });
        btnfitrah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfitrah();
            }
        });
        btnimamzamin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openimamzamin();
            }
        });
        btnrukum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openrukum();
            }
        });
        btnmembership.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmembership();
            }
        });
        btnmagpays.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmagazine();
            }
        });
        btnsponsorship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensponsorship();
            }
        });
        btnnadarfund.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opennadarfund();
            }
        });
        btnisalesawab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openisalesawab();
            }
        });
        btntameerat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opentameeraat();
            }
        });
        btnmuballigfund.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmuballigramzaan();
            }
        });
        btnjameat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openjameat();
            }
        });
        btnijarah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openijarah();
            }
        });
        btneshopay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openeshopay();
            }
        });
        btnjoinhands.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openjoinhands();
            }
        });
        btnmytxns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openmytxns();
            }
        });

    }
    private void opendonations(){
        Intent intent = new Intent(this,DonationTestPaytm.class);
        startActivity(intent);
    }
    private void openkhums(){
        Intent intent = new Intent(this,Khums.class);
        startActivity(intent);
    }
    private void opensadqah(){
        Intent intent = new Intent(this,Sadqah.class);
        startActivity(intent);
    }
    private void openfitrah(){
        Intent intent = new Intent(this,Fitrah.class);
        startActivity(intent);
    }
    private void openimamzamin(){
        Intent intent = new Intent(this,ImamZamin.class);
        startActivity(intent);
    }
    private void openrukum(){
        Intent intent = new Intent(this,RukumESharaee.class);
        startActivity(intent);
    }
    private void openmembership(){
        Intent intent = new Intent(this,Membership.class);
        startActivity(intent);
    }
    private void openmagazine(){
        Intent intent = new Intent(this,MagazineSubsciption.class);
        startActivity(intent);
    }
    private void opensponsorship(){
        Intent intent = new Intent(this,Sponsorships.class);
        startActivity(intent);
    }
    private void opennadarfund(){
        Intent intent = new Intent(this,NadarFund.class);
        startActivity(intent);
    }
    private void openisalesawab(){
        Intent intent = new Intent(this,IsaleSawab.class);
        startActivity(intent);
    }
    private void opentameeraat(){
        Intent intent = new Intent(this,TameeraatFund.class);
        startActivity(intent);
    }
    private void openmuballigramzaan(){
        Intent intent = new Intent(this,RamdhaanMuharramMuballigFund.class);
        startActivity(intent);
    }
    private void openjameat(){
        Intent intent = new Intent(this,Jameat.class);
        startActivity(intent);
    }
    private void openijarah(){
        Intent intent = new Intent(this,IjarahServices.class);
        startActivity(intent);
    }
    private void openeshopay(){
        Intent intent = new Intent(this,EshopPayment.class);
        startActivity(intent);
    }
    private void openjoinhands(){
        Intent intent = new Intent(this,JoinHandsWithUs.class);
        startActivity(intent);
    }
    private void openmytxns(){
        Intent intent = new Intent(this,MyTransactions.class);
        startActivity(intent);
    }
}