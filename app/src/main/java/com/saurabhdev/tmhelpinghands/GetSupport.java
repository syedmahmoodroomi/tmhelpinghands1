package com.saurabhdev.tmhelpinghands;

import android.content.Intent;
import android.net.Uri;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class GetSupport extends AppCompatActivity {
    Button button_edu,button_cult,button_aza,button_awar,button_tabl,button_eco,button_comm,button_eshop;
   // Uri uri = Uri.parse("http://www.google.com");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_get_support);
        button_edu = (Button) findViewById(R.id.buttonedu);
        button_cult = (Button) findViewById(R.id.buttoncult);
        button_aza = (Button) findViewById(R.id.buttonaza);
        button_awar = (Button) findViewById(R.id.buttonawar);
        button_tabl = (Button) findViewById(R.id.buttontabl);
        button_eco =(Button) findViewById(R.id.buttonecon);
        button_comm = (Button) findViewById(R.id.buttoncomm);
        button_eshop = (Button) findViewById(R.id.buttoneshop1);

        button_edu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openeducationsec();
            }
        });
        button_cult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencultsec();
            }
        });
        button_aza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openazadarisec();
            }
        });
        button_awar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openawarsec();
            }
        });
        button_eco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openeconomic();
            }
        });
        button_comm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCommunity();
            }
        });
        button_eshop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              openeshop();
            }
        });
        button_tabl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opentableegh();
            }
        });
    }
    public void openeducationsec() {
        Intent intent = new Intent(this, EducationSection.class);
        startActivity(intent);
    }
    public void opencultsec() {
        Intent intent = new Intent(this, CultureSection.class);
        startActivity(intent);
    }
    public void openazadarisec() {
        Intent intent = new Intent(this, AzadariSection.class);
        startActivity(intent);
    }
    public void openawarsec() {
        Intent intent = new Intent(this, SocialAwarness.class);
        startActivity(intent);
    }
    public void openeconomic() {
        Intent intent = new Intent(this, SocialEconomic.class);
        startActivity(intent);
    }
    public void openCommunity() {
        Intent intent = new Intent(this, CommunityServices.class);
        startActivity(intent);
    }
    public void openeshop() {
        Uri uri = Uri.parse("http://tanzeemulmakatib.org/islamic-shop/"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void opentableegh() {
        Intent intent = new Intent(this, TableeghSection.class);
        startActivity(intent);
    }

}