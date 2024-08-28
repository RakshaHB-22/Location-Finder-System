package com.example.locationfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity10 extends AppCompatActivity {
    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        b1=findViewById(R.id.button38);
        b2=findViewById(R.id.button39);
        b3=findViewById(R.id.button40);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap2();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap3();
            }
        });
    }
    private void openMap() {
        Uri uri = Uri.parse("geo:0 ,0?q=MORE Super Market, MG Rd, Vidhya Nagar, Hassan, Karnataka 573201");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void openMap2() {
        Uri uri = Uri.parse("geo:0 ,0?q=Reliance SMART superstore, 1, Shankar Mutt Rd, Krishnaraja Pura, Hassan, Karnataka 573201");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void openMap3() {
        Uri uri = Uri.parse("geo:0 ,0?q=Nilgiri's, Ground Floor, opp. Adichunchungiri, MG Rd, Hassan, Karnataka 560086");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);

    }
}