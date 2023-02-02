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

public class Maincourse_Activity extends AppCompatActivity {
    private Button cc1;
    private Button cc2;
    private Button cc3;
    private Button cc4;
    private Button cc5;
    private Button cc6;

    private Button ce1;
    private Button ce2;
    private Button ce3;
    private Button ce4;
    private Button ce5;
    private Button ce6;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maincourse);

        cc1 = findViewById(R.id.cc1);
        cc2 = findViewById(R.id.cc2);
        cc3 = findViewById(R.id.cc3);
        cc4 = findViewById(R.id.cc4);
        cc5 = findViewById(R.id.cc5);
        cc6 = findViewById(R.id.cc6);


        ce1 = findViewById(R.id.ce1);
        ce2 = findViewById(R.id.ce2);
        ce3 = findViewById(R.id.ce3);
        ce4 = findViewById(R.id.ce4);
        ce5 = findViewById(R.id.ce5);
        ce6 = findViewById(R.id.ce6);




        cc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:166777654321"));
                startActivity(intent);;
            }
        });
        cc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:516654321"));
                startActivity(intent);;
            }
        });
        cc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:53164321"));
                startActivity(intent);;
            }
        });
        cc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:616654321"));
                startActivity(intent);;
            }
        });
        cc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:45154321"));
                startActivity(intent);;
            }
        });
        cc6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:1247654321"));
                startActivity(intent);;
            }
        });





        ce1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:swqff@gmail.com"));
                startActivity(sendmail);
            }
        });
        ce2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:s2ly@gmail.com"));
                startActivity(sendmail);
            }
        });
        ce3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:325fely@gmail.com"));
                startActivity(sendmail);
            }
        });
        ce4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:ewttwy@gmail.com"));
                startActivity(sendmail);
            }
        });
        ce5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:erely@gmail.com"));
                startActivity(sendmail);
            }
        });
        ce6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:sgbsdgy@gmail.com"));
                startActivity(sendmail);
            }
        });



    }


}
