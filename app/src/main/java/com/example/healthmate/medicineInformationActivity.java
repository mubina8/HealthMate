package com.example.healthmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class medicineInformationActivity extends AppCompatActivity implements View.OnClickListener{
    FloatingActionButton addButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_information);
        this.setTitle("Medicines");
        addButton = (FloatingActionButton)findViewById(R.id.addButtonId);
        addButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.addButtonId)
        {
            Intent intent = new Intent(getApplicationContext(), addMedicineActivity.class);
            startActivity(intent);
        }
    }
}
