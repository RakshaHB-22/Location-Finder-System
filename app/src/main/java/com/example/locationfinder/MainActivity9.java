package com.example.locationfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity9 extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        b1 = findViewById(R.id.button32);
        b2 = findViewById(R.id.button33);
        b3 = findViewById(R.id.button34);
        b4 = findViewById(R.id.button35);
        b5 = findViewById(R.id.button36);
        b6 = findViewById(R.id.button37);
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
        Uri uri = Uri.parse("geo:0 ,0?q=MUJAHID STATIONARY SHOP, Vallabhai Main Rd, Ammeer Mohalla, Hassan, Karnataka 573201");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void openMap1() {
        Uri uri = Uri.parse("geo:0 ,0?q=BALAJI BOOK CENTRE, Shankar Mutt Road, Krishnaraja Pura, Hassan, Karnataka");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void openMap2() {
        Uri uri = Uri.parse("geo:0 ,0?q=Shop No 407, JAI HANUMAN BOOK CENTRE ABHISHEK, Kuvenpu Nagar, Hassan, Karnataka 573201");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);

    }

    private void openMap3() {
        Uri uri = Uri.parse("geo:0 ,0?q=2474+3CQ Om Shri Stationary, MG Rd, Ravindra Nagar, Vidhya Nagar, Hassan, Karnataka 573201");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void openMap4() {
        Uri uri = Uri.parse("geo:0 ,0?q=Paramesh Enterprises, Maharaja Park, near Hassan, Karnataka 573201");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void openMap5() {
        Uri uri = Uri.parse("geo:0 ,0?q=students gallery, Vijay Nagar, Hassan, Karnataka 573217");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }
}