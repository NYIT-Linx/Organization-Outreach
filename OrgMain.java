package com.example.organizationoutreach;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageButton;
import android.os.Bundle;

import android.content.Intent;

import android.view.View;


import android.os.Bundle;
public class OrgMain extends AppCompatActivity {

    private ImageButton frats;
    private ImageButton clubs;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_org_main);

       frats = (ImageButton) findViewById(R.id.fratssoro);

        frats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(OrgMain.this, frats.class);
                startActivity(intentLoadNewActivity);
            }
        });

        clubs = (ImageButton) findViewById(R.id.clubs);

        clubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLoadNewActivity = new Intent(OrgMain.this, clubs.class);
                startActivity(intentLoadNewActivity);
            }
        });



    }
}