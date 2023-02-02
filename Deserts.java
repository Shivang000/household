package com.example.nofood;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Deserts extends AppCompatActivity {

    private Button plc1;
    private Button plc2;
    private Button plc3;
    private Button plc4;
    private Button plc5;


    private Button ple1;
    private Button ple2;
    private Button ple3;
    private Button ple4;
    private Button ple5;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deserts);

        plc1 = findViewById(R.id.plc1);
        plc2 = findViewById(R.id.plc2);
        plc3 = findViewById(R.id.plc3);
        plc4 = findViewById(R.id.plc4);
        plc5 = findViewById(R.id.plc5);



        ple1 = findViewById(R.id.ple1);
        ple2 = findViewById(R.id.ple2);
        ple3 = findViewById(R.id.ple3);
        ple4 = findViewById(R.id.ple4);
        ple5 = findViewById(R.id.ple5);




        ple1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:ty4tly@gmail.com"));
                startActivity(sendmail);
            }
        });
        ple2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:26grgly@gmail.com"));
                startActivity(sendmail);
            }
        });
        ple3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:sg3757y@gmail.com"));
                startActivity(sendmail);
            }
        });
        ple4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:dfhaely@gmail.com"));
                startActivity(sendmail);
            }
        });
        ple5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:s2846ly@gmail.com"));
                startActivity(sendmail);
            }
        });






        plc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:939739654321"));
                startActivity(intent);;
            }
        });
        plc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:559739789"));
                startActivity(intent);;
            }
        });
        plc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:3977654321"));
                startActivity(intent);;
            }
        });
        plc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:3939654321"));
                startActivity(intent);;
            }
        });
        plc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:9954321"));
                startActivity(intent);;
            }
        });

    }
}
