package com.example.nofood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Painter extends AppCompatActivity {

    private Button pc1;
    private Button pc2;
    private Button pc3;
    private Button pc4;
    private Button pc5;


    private Button pe1;
    private Button pe2;
    private Button pe3;
    private Button pe4;
    private Button pe5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painter);

        pc1 = findViewById(R.id.pc1);
        pc2 = findViewById(R.id.pc2);
        pc3 = findViewById(R.id.pc3);
        pc4 = findViewById(R.id.pc4);
        pc5 = findViewById(R.id.pc5);


        pe1 = findViewById(R.id.pe1);
        pe2 = findViewById(R.id.pe2);
        pe3 = findViewById(R.id.pe3);
        pe4 = findViewById(R.id.pe4);
        pe5 = findViewById(R.id.pe5);



        pc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:953543581"));
                startActivity(intent);;
            }
        });

        pc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9573954341"));
                startActivity(intent);;
            }
        });

        pc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:95554341"));
                startActivity(intent);;
            }
        });

        pc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9754341"));
                startActivity(intent);;
            }
        });

        pc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:3135654341"));
                startActivity(intent);;
            }
        });







        pe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:13eft4y@gmail.com"));
                startActivity(sendmail);
            }
        });

        pe2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:523efsd@gmail.com"));
                startActivity(sendmail);
            }
        });
        pe3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:gwrgy@gmail.com"));
                startActivity(sendmail);
            }
        });
        pe4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:gsfg4y@gmail.com"));
                startActivity(sendmail);
            }
        });
        pe5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:fgsdgt4y@gmail.com"));
                startActivity(sendmail);
            }
        });


    }
}