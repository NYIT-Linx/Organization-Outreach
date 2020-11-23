package com.example.organizationoutreach;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class  frats extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frats);

        listView = findViewById(R.id.listView);

        ArrayList<Org> arrayList = new ArrayList<>();

        arrayList.add(new Org(R.drawable.alphachi,"Aplha Chi Rho", "Male Fraternity"));
        arrayList.add(new Org(R.drawable.deltaep,"Delta Epsilon Psi", "Male Fraternity"));
        arrayList.add(new Org(R.drawable.digamma,"Di Gamma Omega Xi", "Male Fraternity"));
        arrayList.add(new Org(R.drawable.kappaphi,"Kappa Phi Gamma", "female Sorority"));
        arrayList.add(new Org(R.drawable.sigmarho,"Sigma Sigma Rho", "Male Sorority"));

        OrgAdapter orgAdapter = new OrgAdapter(this,R.layout.list_row,arrayList);

        listView.setAdapter(orgAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Intent intent = new Intent(frats.this, alphachi.class);
                    startActivity(intent);
                }
            }
        });

    }
}
