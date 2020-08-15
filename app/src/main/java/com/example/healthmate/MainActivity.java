package com.example.healthmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button healthCareButton,dietTipsButton,medicineReminderButton,informationButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Health Mate");
        healthCareButton = (Button)findViewById(R.id.healthCareId);
        dietTipsButton = (Button)findViewById(R.id.dietChartId);
        medicineReminderButton = (Button)findViewById(R.id.medicineReminderId);
        informationButton =   (Button)findViewById(R.id.InformationId);
        healthCareButton.setOnClickListener(this);
        dietTipsButton.setOnClickListener(this);
        medicineReminderButton.setOnClickListener(this);
        informationButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.healthCareId)
        {
            Intent intent = new Intent(getApplicationContext(), healthCareActivity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.dietChartId)
        {
            Intent intent = new Intent(getApplicationContext(), dietTipsActivity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.InformationId)
        {
            Intent intent = new Intent(getApplicationContext(), medicineInformationActivity.class);
            startActivity(intent);
        }
    }
}