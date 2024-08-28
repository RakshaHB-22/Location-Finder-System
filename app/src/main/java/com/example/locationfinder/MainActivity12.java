package com.example.locationfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity12 extends AppCompatActivity {
    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        b1=findViewById(R.id.button45);
        b2=findViewById(R.id.button46);
        b3=findViewById(R.id.button47);
        b4=findViewById(R.id.button48);
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

    }
    private void openMap() {
        Uri uri = Uri.parse("geo:0 ,0?q=Navkis College of Engineering, KIADB, Thimmanahally Industrial Area, Kandali, NH75, Hassan, Karnataka 573217");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void openMap2() {
        Uri uri = Uri.parse("geo:0 ,0?q=Malnad College of Engineering, No 21, Salagame Rd, Rangoli Halla, Hassan, Karnataka 573202");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void openMap3() {
        Uri uri = Uri.parse("geo:0 ,0?q=Government Engineering College, Hassan, Dairy Circle, Katihalli, Hassan, Karnataka 573202");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);

    }

    private void openMap4() {
        Uri uri = Uri.parse("geo:0 ,0?q=Rajeev Insitute Of Technology, Plot 1-D, Growth Center, Industrial Area, B-M Bypass Road, Hassan, Karnataka 573201");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }
}