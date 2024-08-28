package com.example.locationfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {
    Button b1, b2, b3, b4, b5, b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        b1 = findViewById(R.id.button21);
        b2 = findViewById(R.id.button22);
        b3 = findViewById(R.id.button23);
        b4 = findViewById(R.id.button20);
        b5 = findViewById(R.id.button24);
        b6 = findViewById(R.id.button25);
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
        Uri uri = Uri.parse("geo:0 ,0?q=State Bank of India HARALAHALLY");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void openMap1() {
        Uri uri = Uri.parse("geo:0 ,0?q=CENTRAL BANK OF INDIA - HASSAN Branch, 77 15 A, MG Rd, near STADIUM, Vidhya Nagar, Hassan, Karnataka 573201");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void openMap2() {
        Uri uri = Uri.parse("geo:0 ,0?q=CANARA BANK - HASSAN MAIN, P.O.NO. 45,NEAR NARASIMHARAJA CIRCLE MALNAD HOUSE,HASSAN H.O, Hassan, Karnataka 573201 ");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);

    }

    private void openMap3() {
        Uri uri = Uri.parse("geo:0 ,0?q=746, Ward No. 31, Union Bank Of India, Krutik Arcade, Bangalore - Mangalore Rd, APMC, Hassan, Karnataka 573201");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void openMap4() {
        Uri uri = Uri.parse("geo:0 ,0?q=2444+CXV Corporation Bank, Krishnaraja Pura, Hassan, Karnataka 573201");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void openMap5() {
        Uri uri = Uri.parse("geo:0 ,0?q=Bank Of Baroda (E Vijaya), Ravindranagar Park, P B No 60,Adi-, Chunchangiri Complex, Hassan, Karnataka 573201");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }
}