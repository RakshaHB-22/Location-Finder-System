package com.example.locationfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity8 extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        b1 = findViewById(R.id.button26);
        b2 = findViewById(R.id.button27);
        b3 = findViewById(R.id.button28);
        b4 = findViewById(R.id.button29);
        b5 = findViewById(R.id.button30);
        b6 = findViewById(R.id.button31);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap1();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap2();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap3();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap4();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap5();
            }
        });
    }

    private void openMap() {
        Uri uri = Uri.parse("geo:0 ,0?q=Sanman Hotel ಸನ್ಮಾನ್ ಹೊಟೇಲ್, 23, Old Bus Stand Rd, Ammeer Mohalla, Hassan, Karnataka 573201");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void openMap1() {
        Uri uri = Uri.parse("geo:0 ,0?q=2454+38M Parijata Restaurant, High School Field Rd, Rangoli Halla, Hassan, Karnataka 573201");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void openMap2() {
        Uri uri = Uri.parse("geo:0 ,0?q=Suvarna Gate, No. 97, Bangalore - Mangalore Rd, Ammeer Mohalla, Hassan, Karnataka 573201");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);

    }

    private void openMap3() {
        Uri uri = Uri.parse("geo:0 ,0?q=Hotel Shruthi Veg, bus stand, Behind city, Kasturi Ba Rd, Hassan, Karnataka 573201");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void openMap4() {
        Uri uri = Uri.parse("geo:0 ,0?q=Panjurli Grand Veg, Race Course Rd, Rangoli Halla, Hassan, Karnataka 573201");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void openMap5() {
        Uri uri = Uri.parse("geo:0 ,0?q=2442+JRH Parivar Restaurant, Rangoli Halla, Hassan, Karnataka 573201");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }
}