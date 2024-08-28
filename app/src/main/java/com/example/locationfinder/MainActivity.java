package com.example.locationfinder;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText usr, pswd1;
    Button login;

    Button sign;
    TextView txt;
    int counter = 3;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usr = findViewById(R.id.U);
        pswd1 = findViewById(R.id.P);
        sign= (Button)findViewById(R.id.button2);
        login = findViewById(R.id.button);
        txt = findViewById(R.id.textView3);

        String reusername = getIntent().getStringExtra("username");
        String repassword = getIntent().getStringExtra("password");

        login.setOnClickListener(view -> {
            String username1 = usr.getText().toString();
            String password1 = pswd1.getText().toString();
            if (reusername.equals(username1) && repassword.equals(password1)) {
                Intent intent = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(intent);
                txt.setVisibility(View.VISIBLE);
                txt.setBackgroundColor(Color.RED);
                counter--;
                txt.setText(Integer.toString(counter));
            } else {
                Toast.makeText(MainActivity.this, "Invalid Credentials",
                        Toast.LENGTH_LONG).show();
                txt.setVisibility(View.VISIBLE);
                txt.setBackgroundColor(Color.RED);
                counter--;
                txt.setText(Integer.toString(counter));
            }
            if (counter == 0) {
                Toast.makeText(MainActivity.this, "FAILED LOGIN ATTEMPTS",
                        Toast.LENGTH_LONG).show();
                login.setEnabled(false);
            }
        });

        sign.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
        });
    }
}