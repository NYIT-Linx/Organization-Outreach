package com.example.organizationoutreach;

import android.os.Bundle;
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

    }
}