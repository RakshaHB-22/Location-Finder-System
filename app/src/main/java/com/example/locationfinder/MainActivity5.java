package com.example.locationfinder;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        b1=findViewById(R.id.button8);
        b2=findViewById(R.id.button9);
        b3=findViewById(R.id.button10);
        b4=findViewById(R.id.button11);
        b5=findViewById(R.id.button12);
        b6=findViewById(R.id.button13);

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

    private void openMap4() {
        Uri uri = Uri.parse("geo:0 ,0?q=Sri Chamarajendra Hospital");
        Intent intent= new Intent(Intent.ACTION_VIEW,uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void openMap5() {
        Uri uri = Uri.parse("geo:0 ,0?q=MISSION HOSPITAL");
        Intent intent= new Intent(Intent.ACTION_VIEW,uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);

    }

    private void openMap3() {
        Uri uri = Uri.parse("geo:0 ,0?q=Sdm Hospital Hassan");
        Intent intent= new Intent(Intent.ACTION_VIEW,uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void openMap2() {
        Uri uri = Uri.parse("geo:0 ,0?q=Sparsh Hospital Hassan");
        Intent intent= new Intent(Intent.ACTION_VIEW,uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);

    }

    private void openMap1() {
        Uri uri = Uri.parse("geo:0 ,0?q=Janapriya Hospital");
        Intent intent= new Intent(Intent.ACTION_VIEW,uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void openMap() {
        Uri uri = Uri.parse("geo:0 ,0?q=Tanya Speciality Hospital");
        Intent intent= new Intent(Intent.ACTION_VIEW,uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }



}