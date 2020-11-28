package com.example.organizationoutreach;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class clubs extends AppCompatActivity {

    ListView listViewc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clubs);

        listViewc = findViewById(R.id.listViewc);
        ArrayList<club> clubarrayList = new ArrayList<>();

        clubarrayList.add(new club(R.drawable.acm,"Association for Computer Machinery", "ACM"));
        clubarrayList.add(new club(R.drawable.deltaep,"American Institute of Architecture Students", ""));
        clubarrayList.add(new club(R.drawable.digamma,"American Society of of Mechanical Engineers", ""));
        clubarrayList.add(new club(R.drawable.kappaphi,"American Medical Student Association", "AMSA"));
        clubarrayList.add(new club(R.drawable.sigmarho,"Health Professions Club", "HPC"));

        clubAdapter clubAdapter = new clubAdapter(this,R.layout.list_row2,clubarrayList);

        listViewc.setAdapter(clubAdapter);

        listViewc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(clubs.this, ACM.class);
                    startActivity(intent);
                }
            }
        });

    }
}