package com.saurabhdev.tmhelpinghands;

import android.content.DialogInterface;
import android.content.Intent;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button buttongeth, buttongiveh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        buttongeth = (Button) findViewById(R.id.buttongeth);
        buttongiveh = (Button) findViewById(R.id.buttonsupp);

        buttongeth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGetSupport();
            }
        });
       // buttongeth.setStateListAnimator(null);
        buttongiveh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opengivesupport();
            }
        });
       // buttongiveh.setStateListAnimator(null);
    }

    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are You Sure You Want to Exit?")
                .setNegativeButton("NO", null)
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finishAffinity();
                    }
                }).show();


    }
    public void openGetSupport() {
        Intent intent = new Intent(this, GetSupport.class);
        startActivity(intent);


    }

    public void opengivesupport() {
        Intent intent = new Intent(this, SupportTanzeemNative.class);
        startActivity(intent);
    }
}