package com.example.locationfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity13 extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        b1=findViewById(R.id.button49);
        b2=findViewById(R.id.button50);
        b3=findViewById(R.id.button51);
        b4=findViewById(R.id.button52);
        b5=findViewById(R.id.button53);
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
        Uri uri = Uri.parse("geo:0 ,0?q=Masters PU College, Hoysalanagar Main Rd, Krishnaraja Pura, Hassan, Karnataka, India");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void openMap2() {
        Uri uri = Uri.parse("geo:0 ,0?q=2467+6VW N. D. R. K. First Grade College, Udayagiri, Hassan, Karnataka 573201");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void openMap3() {
        Uri uri = Uri.parse("geo:0 ,0?q=Brilliant PU College & Brilliant Public School, Near, Ring Rd, Hemavathi Nagar, Hassan, Karnataka, India");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);

    }

    private void openMap4() {
        Uri uri = Uri.parse("geo:0 ,0?q=studentspucollege, vivekanagar, Ring Rd, Hassan, Karnataka 573201");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }
    private void openMap5() {
        Uri uri = Uri.parse("geo:0 ,0?q=SUJALA PRE-UNIVERSITY COLLEGE, Northern Extension Apoorva Hotel Road, Karnataka 573201");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }
}
