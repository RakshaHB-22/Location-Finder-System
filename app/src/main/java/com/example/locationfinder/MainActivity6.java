package com.example.locationfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {
    Button b1 ,b2, b3, b4, b5, b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        b1=findViewById(R.id.button14);
        b2=findViewById(R.id.button15);
        b3=findViewById(R.id.button16);
        b4=findViewById(R.id.button17);
        b5=findViewById(R.id.button18);
        b6=findViewById(R.id.button19);

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
        Uri uri = Uri.parse("geo:0 ,0?q=Lakshmi Medical Emporium, Shankar Mutt Rd, Krishnaraja Pura, Hassan, Karnataka 573201");
        Intent intent= new Intent(Intent.ACTION_VIEW,uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void openMap1() {
        Uri uri = Uri.parse("geo:0 ,0?q=MedPlus RC Road Hassan, Khata No B41/338, Sas No 393 1st Cross, Race Course Rd, Northern Extension, Hassan, Karnataka 573201");
        Intent intent= new Intent(Intent.ACTION_VIEW,uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void openMap2() {
        Uri uri = Uri.parse("geo:0 ,0?q=apollo pharmacy hassan - 1 shankar mutt road rangoli halla hassan karnataka ");
        Intent intent= new Intent(Intent.ACTION_VIEW,uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);

    }
    private void openMap3() {
        Uri uri = Uri.parse("geo:0 ,0?q=234X+67P Raghavendra Medicals, Kasturi Ba Rd, Rangoli Halla, Hassan, Karnataka 573201");
        Intent intent= new Intent(Intent.ACTION_VIEW,uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }
    private void openMap4() {
        Uri uri = Uri.parse("geo:0 ,0?q=City Drug House, JN Complex, Race Course Rd, beside S.P.Office And Janatha Madyama, Hassan, Karnataka 573201");
        Intent intent= new Intent(Intent.ACTION_VIEW,uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void openMap5() {
        Uri uri = Uri.parse("geo:0 ,0?q=Dhanvantari Medicals");
        Intent intent= new Intent(Intent.ACTION_VIEW,uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);

    }
}