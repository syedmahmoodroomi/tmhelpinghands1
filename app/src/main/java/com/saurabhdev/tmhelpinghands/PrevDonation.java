package com.saurabhdev.tmhelpinghands;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class PrevDonation extends AppCompatActivity {
    //TextView donar_name,donate_amount,donar_email,donar_cell,donar_address,donar_whatasap,telegram1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prev_donation);

        Intent intent = getIntent();

        String name = intent.getStringExtra(DonationTestPaytm.EXTRA_NAME);
        String address = intent.getStringExtra(DonationTestPaytm.EXTRA_ADDRESS);
        String email = intent.getStringExtra(DonationTestPaytm.EXTRA_EMAIL);
        String amount = intent.getStringExtra(DonationTestPaytm.EXTRA_AMOUNT);
        String cell = intent.getStringExtra(DonationTestPaytm.EXTRA_CELL);
        String whatsapp = intent.getStringExtra(DonationTestPaytm.EXTRA_WHATSAPP);
        String telegram = intent.getStringExtra(DonationTestPaytm.EXTRA_TELEGRAM);

        TextView donar_name=(TextView) findViewById(R.id.donar_name);
        TextView donar_address=(TextView) findViewById(R.id.donar_address);
        TextView donar_cell=(TextView) findViewById(R.id.donar_cell);
        TextView donar_email=(TextView) findViewById(R.id.donar_email);
        TextView telegram1=(TextView) findViewById(R.id.telegram);
        TextView donate_amount=(TextView) findViewById(R.id.donate_amount);
        TextView donar_whatasap=(TextView) findViewById(R.id.donar_whatasap);

        donar_name.setText(name);
        donar_address.setText(address);
        donar_cell.setText("" +cell);
        donar_whatasap.setText("" +whatsapp);
        telegram1.setText("" +telegram);
        donar_email.setText(email);
        donate_amount.setText(""+amount);
    }
}