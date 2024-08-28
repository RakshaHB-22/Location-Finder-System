package com.example.locationfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity14 extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main14);
        b1=findViewById(R.id.button54);
        b2=findViewById(R.id.button55);
        b3=findViewById(R.id.button57);
        b4=findViewById(R.id.button58);
        b5=findViewById(R.id.button59);
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
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap4();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap5();
            }
        });

    }
    private void openMap() {
        Uri uri = Uri.parse("geo:0 ,0?q=Central Commerce College, Salagame Road, opposite to Sai Mandir, Hassan");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void openMap2() {
        Uri uri = Uri.parse("geo:0 ,0?q=Students Commerce PU College, 60 Feet Rd, Gowri Koppalu, Vivekanagara, Hassan, Karnataka 573201");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void openMap3() {
        Uri uri = Uri.parse("geo:0 ,0?q=St.Joseph's PU College, Hassan, St. Joseph's School Road, Saraswatipuram, Salagame Rd, Hassan, Karnataka 573201");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);

    }

    private void openMap4() {
        Uri uri = Uri.parse("geo:0 ,0?q=239V+FX5 St.Philomena Primary and High School, N.R Circle, Holenarasipura Road, Karnataka 573201");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }
    private void openMap5() {
        Uri uri = Uri.parse("geo:0 ,0?q=APJ ACADEMY, 4th Cross, Krishnaraja Pura, Hassan, Karnataka 573201");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }
}

