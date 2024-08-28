package com.example.locationfinder;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Pattern;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        EditText usr , pass;
        Button b1  ;
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        usr= findViewById(R.id.user);
        pass= findViewById(R.id.pass);

        b1= findViewById(R.id.s1);

        b1.setOnClickListener(view -> {
            String un = usr.getText().toString();
            String ps = pass.getText().toString();

            if (un.length()==0)
            {
                usr.setError("Enetr The Username");
                usr.requestFocus();
            }
            else if (ps.length()==0)
            {
                pass.setError("Enter The Password");
                pass.requestFocus();
            }
            else
            {
                if(!isvalidpassword(ps))
                {
                    Toast.makeText(MainActivity2.this,"PassWord Does not match",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Intent i =new Intent (MainActivity2.this, MainActivity.class);
                    i.putExtra("username",un);
                    i.putExtra("password",ps);
                    startActivity(i);
                }
            }
        });
    }
    Pattern lwr = Pattern.compile("^.*[a-z].*$");
    Pattern upr= Pattern.compile("^.*[A-Z].*$");
    Pattern digi= Pattern.compile("^.*[0-9].*$");
    Pattern sp= Pattern.compile("^.*[^A-Za-z0-9].*$");


    public Boolean isvalidpassword(String pass)
    {
        if(pass.length()<8)
        {
            return false;
        }
        if(!lwr.matcher(pass).matches())
        {
            return false;
        }
        if(!upr.matcher(pass).matches())
        {
            return false;
        }
        if(!digi.matcher(pass).matches())
        {
            return false;
        }
        return sp.matcher(pass).matches();
    }
}