package com.example.healthmate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dashboardActivity extends AppCompatActivity implements View.OnClickListener{
     Button healthCareButton,dietTipsButton,medicineReminderButton,informationButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
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
            Intent intent = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.dietChartId)
        {
            Intent intent = new Intent(getApplicationContext(),dietTipsActivity.class);
            startActivity(intent);
        }
        if(v.getId()==R.id.InformationId)
        {

        }
    }
}
