package com.saurabhdev.tmhelpinghands;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

//import android.support.v7.app.AppCompatActivity;

public class PrevDonation extends AppCompatActivity {
    //TextView donar_name,donate_amount,donar_email,donar_cell,donar_address,donar_whatasap,telegram1;

    TextView donate_amount,upivirtualid,name,note;
    ImageView send;
    String TAG ="main";
    final int UPI_PAYMENT = 0;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prev_donation);

        send =(ImageView) findViewById(R.id.send);
        donate_amount = (TextView) findViewById(R.id.donate_amount);
        name =(TextView) findViewById(R.id.donar_name);
        upivirtualid = (TextView) findViewById(R.id.upi_id);
        note = (TextView) findViewById(R.id.donar_address);

                send.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //Getting the values from the EditTexts
                        if (TextUtils.isEmpty(name.getText().toString().trim())){
                            Toast.makeText(PrevDonation.this," Name is invalid", Toast.LENGTH_SHORT).show();
                        }else if (TextUtils.isEmpty(upivirtualid.getText().toString().trim())){
                            Toast.makeText(PrevDonation.this," UPI ID is invalid", Toast.LENGTH_SHORT).show();
                        }else if (TextUtils.isEmpty(note.getText().toString().trim())){
                            Toast.makeText(PrevDonation.this," Note is invalid", Toast.LENGTH_SHORT).show();
                        }else if (TextUtils.isEmpty(donate_amount.getText().toString().trim())){
                            Toast.makeText(PrevDonation.this," Amount is invalid", Toast.LENGTH_SHORT).show();
                        }else{
                            payUsingUpi(name.getText().toString(), upivirtualid.getText().toString(),
                                    note.getText().toString(), donate_amount.getText().toString());
                        }

                    }
                });



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
    void payUsingUpi(  String name,String upiId, String note, String amount) {
        Log.e("main ", "name "+name +"--up--"+upiId+"--"+ note+"--"+amount);
        Uri uri = Uri.parse("upi://pay").buildUpon()
                .appendQueryParameter("pa", upiId)
                .appendQueryParameter("pn", name)
                //.appendQueryParameter("mc", "")
                //.appendQueryParameter("tid", "02125412")
                //.appendQueryParameter("tr", "25584584")
                .appendQueryParameter("tn", note)
                .appendQueryParameter("am", amount)
                .appendQueryParameter("cu", "INR")
                //.appendQueryParameter("refUrl", "blueapp")
                .build();
        Intent upiPayIntent = new Intent(Intent.ACTION_VIEW);
        upiPayIntent.setData(uri);
        // will always show a dialog to user to choose an app
        Intent chooser = Intent.createChooser(upiPayIntent, "Pay with");
        // check if intent resolves
        if(null != chooser.resolveActivity(getPackageManager())) {
            startActivityForResult(chooser, UPI_PAYMENT);
        } else {
            Toast.makeText(PrevDonation.this,"No UPI app found, please install one to continue",Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.e("main ", "response "+resultCode );
        /*
       E/main: response -1
       E/UPI: onActivityResult: txnId=AXI4a3428ee58654a938811812c72c0df45&responseCode=00&Status=SUCCESS&txnRef=922118921612
       E/UPIPAY: upiPaymentDataOperation: txnId=AXI4a3428ee58654a938811812c72c0df45&responseCode=00&Status=SUCCESS&txnRef=922118921612
       E/UPI: payment successfull: 922118921612
         */
        switch (requestCode) {
            case UPI_PAYMENT:
                if ((RESULT_OK == resultCode) || (resultCode == 11)) {
                    if (data != null) {
                        String trxt = data.getStringExtra("response");
                        Log.e("UPI", "onActivityResult: " + trxt);
                        ArrayList<String> dataList = new ArrayList<>();
                        dataList.add(trxt);
                        upiPaymentDataOperation(dataList);
                    } else {
                        Log.e("UPI", "onActivityResult: " + "Return data is null");
                        ArrayList<String> dataList = new ArrayList<>();
                        dataList.add("nothing");
                        upiPaymentDataOperation(dataList);
                    }
                } else {
                    //when user simply back without payment
                    Log.e("UPI", "onActivityResult: " + "Return data is null");
                    ArrayList<String> dataList = new ArrayList<>();
                    dataList.add("nothing");
                    upiPaymentDataOperation(dataList);
                }
                break;
        }
    }
    private void upiPaymentDataOperation(ArrayList<String> data) {
        if (isConnectionAvailable(PrevDonation.this)) {
            String str = data.get(0);
            Log.e("UPIPAY", "upiPaymentDataOperation: "+str);
            String paymentCancel = "";
            if(str == null) str = "discard";
            String status = "";
            String approvalRefNo = "";
            String response[] = str.split("&");
            for (int i = 0; i < response.length; i++) {
                String equalStr[] = response[i].split("=");
                if(equalStr.length >= 2) {
                    if (equalStr[0].toLowerCase().equals("Status".toLowerCase())) {
                        status = equalStr[1].toLowerCase();
                    }
                    else if (equalStr[0].toLowerCase().equals("ApprovalRefNo".toLowerCase()) || equalStr[0].toLowerCase().equals("txnRef".toLowerCase())) {
                        approvalRefNo = equalStr[1];
                    }
                }
                else {
                    paymentCancel = "Payment cancelled by user.";
                }
            }
            if (status.equals("success")) {
                //Code to handle successful transaction here.
                Toast.makeText(PrevDonation.this, "Transaction successful.", Toast.LENGTH_SHORT).show();
                Log.e("UPI", "payment successfull: "+approvalRefNo);
            }
            else if("Payment cancelled by user.".equals(paymentCancel)) {
                Toast.makeText(PrevDonation.this, "Payment cancelled by user.", Toast.LENGTH_SHORT).show();
                Log.e("UPI", "Cancelled by user: "+approvalRefNo);
            }
            else {
                Toast.makeText(PrevDonation.this, "Transaction failed.Please try again", Toast.LENGTH_SHORT).show();
                Log.e("UPI", "failed payment: "+approvalRefNo);
            }
        } else {
            Log.e("UPI", "Internet issue: ");
            Toast.makeText(PrevDonation.this, "Internet connection is not available. Please check and try again", Toast.LENGTH_SHORT).show();
        }
    }
    public static boolean isConnectionAvailable(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null) {
            NetworkInfo netInfo = connectivityManager.getActiveNetworkInfo();
            if (netInfo != null && netInfo.isConnected()
                    && netInfo.isConnectedOrConnecting()
                    && netInfo.isAvailable()) {
                return true;
            }
        }
        return false;
    }
}