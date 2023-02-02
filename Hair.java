package com.example.nofood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Hair extends AppCompatActivity {

    private Button hc1;
    private Button hc2;
    private Button hc3;
    private Button hc4;

    private Button he1;
    private Button he2;
    private Button he3;
    private Button he4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair);

        hc1 = findViewById(R.id.hc1);
        hc2 = findViewById(R.id.hc2);
        hc3 = findViewById(R.id.hc3);
        hc4 = findViewById(R.id.hc4);



        he1 = findViewById(R.id.he1);
        he2 = findViewById(R.id.he2);
        he3 = findViewById(R.id.he3);
        he4 = findViewById(R.id.he4);


        hc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1374321"));
                startActivity(intent);;
            }
        });

        hc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1537671"));
                startActivity(intent);;
            }
        });
        hc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:371534356"));
                startActivity(intent);;
            }
        });
        hc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:83473654321"));
                startActivity(intent);;
            }
        });




        he1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:23teef@gmail.com"));
                startActivity(sendmail);
            }
        });
        he2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:rg42f@gmail.com"));
                startActivity(sendmail);
            }
        });
        he3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:rgwef@gmail.com"));
                startActivity(sendmail);
            }
        });
        he4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:253ff@gmail.com"));
                startActivity(sendmail);
            }
        });
    }
}