package com.example.nofood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class Starters_Activity extends AppCompatActivity {

    private Button ec1;
    private Button ec2;
    private Button ec3;
    private Button ec4;
    private Button ec5;
    private Button ec6;
    private Button ec7;


    private Button ee1;
    private Button ee2;
    private Button ee3;
    private Button ee4;
    private Button ee5;
    private Button ee6;
    private Button ee7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ec1 = findViewById(R.id.ec1);
        ec2 = findViewById(R.id.ec2);
        ec3 = findViewById(R.id.ec3);
        ec4 = findViewById(R.id.ec4);
        ec5 = findViewById(R.id.ec5);
        ec6 = findViewById(R.id.ec6);
        ec7 = findViewById(R.id.ec7);



        ee1 = findViewById(R.id.ee1);
        ee2 = findViewById(R.id.ee2);
        ee3 = findViewById(R.id.ee3);
        ee4 = findViewById(R.id.ee4);
        ee5 = findViewById(R.id.ee5);
        ee6 = findViewById(R.id.ee6);
        ee7 = findViewById(R.id.ee7);


        ee1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:sugqwy@gmail.com"));
                startActivity(sendmail);
            }
        });

        ee2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:3rly@gmail.com"));
                startActivity(sendmail);
            }
        });

        ee3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:34rt4y@gmail.com"));
                startActivity(sendmail);
            }
        });

        ee4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:33wef@gmail.com"));
                startActivity(sendmail);
            }
        });

        ee5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:3rfrbly@gmail.com"));
                startActivity(sendmail);
            }
        });

        ee6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:542tfbly@gmail.com"));
                startActivity(sendmail);
            }
        });

        ee7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:rgrwsgy@gmail.com"));
                startActivity(sendmail);
            }
        });




        ec1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0987654321"));
                startActivity(intent);;
            }
        });

        ec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:5587654321"));
                startActivity(intent);;
            }
        });
        ec3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:387654321"));
                startActivity(intent);;
            }
        });
        ec4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:33654321"));
                startActivity(intent);;
            }
        });
        ec5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:3587654321"));
                startActivity(intent);;
            }
        });
        ec6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:4244321"));
                startActivity(intent);;
            }
        });
        ec7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:387654341"));
                startActivity(intent);;
            }
        });






    }
}