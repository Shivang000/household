package com.example.nofood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private CardView starters;
    private CardView main_course;
    private CardView deserts;
    private CardView painter;
    private CardView hair;
    private Button contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        starters = findViewById(R.id.card_view_starters);
        main_course = findViewById(R.id.card_view_maincourse);
        deserts = findViewById(R.id.card_view_desert);
        painter = findViewById(R.id.card_view_painter);
        hair = findViewById(R.id.card_view_hair);
        contact = findViewById(R.id.Contactus);


        starters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent starteracivity = new Intent(MainActivity.this, Starters_Activity.class);
                startActivity(starteracivity);
            }
        });

        main_course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainactivity = new Intent(MainActivity.this, Maincourse_Activity.class);
                startActivity(mainactivity);
            }
        });
        deserts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startdesert = new Intent(MainActivity.this, Deserts.class);
                startActivity(startdesert);
            }
        });
        painter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startpainter = new Intent(MainActivity.this, Painter.class);
                startActivity(startpainter);
            }
        });
        hair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent starthair = new Intent(MainActivity.this, Hair.class);
                startActivity(starthair);
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendmail = new Intent(Intent.ACTION_SENDTO);
                sendmail.setData(Uri.parse("mailto:sgbly@gmail.com"));
                startActivity(sendmail);
            }
        });

    }
}