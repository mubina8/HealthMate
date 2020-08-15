package com.example.healthmate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class addMedicineActivity extends AppCompatActivity implements View.OnClickListener {
    EditText  drugEditText,companyNameEditText,dosageEditText,medicalConditionEditText,expiryDateEditText,sideEffectsEditText;
    Button saveButton;
    String drug,companyName,dosage,medicalCondition,expiryName,sideEffects;
    FirebaseAuth fAuth;
    FirebaseFirestore fStore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_medicine);
        drugEditText = (EditText)findViewById(R.id.drugId);
        companyNameEditText= (EditText)findViewById(R.id.companyNameId);
        dosageEditText= (EditText)findViewById(R.id.dosageId);
        medicalConditionEditText= (EditText)findViewById(R.id.medicalConditionId);
        expiryDateEditText= (EditText)findViewById(R.id.expiryDateId);
        sideEffectsEditText= (EditText)findViewById(R.id.sideEffectsId);
        saveButton = (Button)findViewById(R.id.saveButtonId);
        saveButton.setOnClickListener(this);
        fAuth = FirebaseAuth.getInstance();
        fStore = FirebaseFirestore.getInstance();
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.saveButtonId)
        {
            drug = drugEditText.getText().toString();
            companyName = companyNameEditText.getText().toString();
            medicalCondition = medicalConditionEditText.getText().toString();
            expiryName = expiryDateEditText.getText().toString();
             dosage = dosageEditText.getText().toString();
            sideEffects = sideEffectsEditText.getText().toString();

          /*  if(drug==null)
            {
                drugEditText.setError("Drug name required");
                drugEditText.requestFocus();
                return;
            }
            if(companyName==null)
            {
                companyNameEditText.setError("Company Name required");
                companyNameEditText.requestFocus();
                return;
            }
            if(medicalCondition==null)
            {
               medicalConditionEditText.setError("Medical Condition required");
                medicalConditionEditText.requestFocus();
                return;
            }
            if(expiryName==null)
            {
                expiryDateEditText.setError("Expiry Date required");
                expiryDateEditText.requestFocus();
                return;
            }
            if(dosage==null)
            {
                dosageEditText.setError("Dosage required");
                dosageEditText.requestFocus();
                return;
            }
            if(sideEffects==null)
            {
                sideEffectsEditText.setError("Side Effects required");
                sideEffectsEditText.requestFocus();
                return;
            }
            else{*/
                DocumentReference documentReference = fStore.collection("MedicineInformation").document("medicine");
                Map<String,Object> medicines = new HashMap<>();
                medicines.put("drug",drug);
                medicines.put("companyName",companyName);
                medicines.put("medicalCondition",medicalCondition);
                medicines.put("expiryName",expiryName);
                medicines.put("dosage",dosage);
                medicines.put("sideEffects",sideEffects);
                documentReference.set(medicines).addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {
                        Toast.makeText(getApplicationContext(),"Medicine Details",Toast.LENGTH_SHORT).show();
                    }
                });

        }
    }
}
