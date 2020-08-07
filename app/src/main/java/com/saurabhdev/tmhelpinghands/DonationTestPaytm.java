package com.saurabhdev.tmhelpinghands;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;

public class DonationTestPaytm extends AppCompatActivity {
    private TextInputEditText donate_amount;
    private TextInputEditText donar_name;
    private TextInputEditText donar_email;
    private TextInputEditText donar_cell;
    private TextInputEditText donar_address;
    private TextInputEditText donar_whatasap;
    private TextInputEditText telegram;

    public static final String EXTRA_NAME = "com.saurabhdev.tmhelpinghands.EXTRA_NAME";
    public static final String EXTRA_AMOUNT = "com.saurabhdev.tmhelpinghands.EXTRA_AMOUNT";
    public static final String EXTRA_CELL = "com.saurabhdev.tmhelpinghands.EXTRA_CELL";
    public static final String EXTRA_WHATSAPP = "com.saurabhdev.tmhelpinghands.EXTRA_WHATSAPP";
    public static final String EXTRA_TELEGRAM = "com.saurabhdev.tmhelpinghands.EXTRA_TELEGRAM";
    public static final String EXTRA_ADDRESS = "com.saurabhdev.tmhelpinghands.EXTRA_ADDRESS";
    public static final String EXTRA_EMAIL = "com.saurabhdev.tmhelpinghands.EXTRA_EMAIL";


    Button donate_now;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donation_test_paytm);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        donate_now = (Button) findViewById(R.id.donate_now);
        donate_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openpreview();
            }
        });
    }
    public void openpreview(){
        donar_name =(TextInputEditText) findViewById(R.id.donar_name);
        String donarname = donar_name.getText().toString();

        donar_email =(TextInputEditText) findViewById(R.id.donar_email);
        String donaremail = donar_email.getText().toString();

        donar_address =(TextInputEditText) findViewById(R.id.donar_address);
        String donaraddress = donar_address.getText().toString();

        donate_amount =(TextInputEditText) findViewById(R.id.donate_amount);
        String donateamount = donate_amount.getText().toString();

        donar_cell =(TextInputEditText) findViewById(R.id.donar_cell);
        String donarcell = donar_cell.getText().toString();

        telegram =(TextInputEditText) findViewById(R.id.telegram);
        String telegram1 = telegram.getText().toString();

        donar_whatasap =(TextInputEditText) findViewById(R.id.donar_whatasap);
        String donarwhatasapp = donar_whatasap.getText().toString();

        Intent intent = new Intent(this,PrevDonation.class);
        intent.putExtra(EXTRA_NAME,donarname);
        intent.putExtra(EXTRA_AMOUNT,donateamount);
        intent.putExtra(EXTRA_EMAIL,donaremail);
        intent.putExtra(EXTRA_CELL,donarcell);
        intent.putExtra(EXTRA_WHATSAPP,donarwhatasapp);
        intent.putExtra(EXTRA_TELEGRAM,telegram1);
        intent.putExtra(EXTRA_ADDRESS,donaraddress);
        startActivity(intent);
    }
}