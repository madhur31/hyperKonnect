package com.example.madhurarora.shopsup;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    AppBarLayout appBar;
    CollapsingToolbarLayout toolbarLayout;
    RelativeLayout linearLayout;
    ArrayList<String> spinnerItem;
    ArrayAdapter<String> spinnerAdapter;
    Spinner quantitySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.actionbar_toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("Starbucks");
        quantitySpinner = (Spinner) findViewById(R.id.spinnernumber);

        spinnerItem = new ArrayList<>();
        spinnerItem.add("1");

        spinnerAdapter = new ArrayAdapter<String>(this, R.layout.spinner_item, spinnerItem);
        spinnerAdapter.setDropDownViewResource(R.layout.spinner_dropdownitem);

        quantitySpinner.setAdapter(spinnerAdapter);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main_menu, menu);

        return true;
    }
}
