package com.example.ahmed_inf.louage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SpinnerExample extends AppCompatActivity {
    private String array_spinner[];
    private String array_spinner1[];
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.voyage);

        array_spinner=new String[5];
        array_spinner[0]="Tunis";
        array_spinner[1]="Bizerte";
        array_spinner[2]="Nabeul";
        array_spinner[3]="Sousse";
        array_spinner[4]="Gafsa";

        array_spinner1=new String[6];
        array_spinner1[0]="00";
        array_spinner1[1]="01";
        array_spinner1[2]="02";
        array_spinner1[3]="03";
        array_spinner1[4]="04";
        array_spinner1[4]="05";

        Spinner s = (Spinner) findViewById(R.id.spinnerarrive);
        ArrayAdapter adapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item, array_spinner);
        s.setAdapter(adapter);

        Spinner s1 = (Spinner) findViewById(R.id.spinnerdepart);
        ArrayAdapter adapter1 = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item, array_spinner);
        s1.setAdapter(adapter);

        Spinner s2 = (Spinner) findViewById(R.id.spinnerheure);
        ArrayAdapter adapter2 = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item, array_spinner1);
        s2.setAdapter(adapter);

        Spinner s3 = (Spinner) findViewById(R.id.spinnerminute);
        ArrayAdapter adapter3 = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item, array_spinner1);
        s3.setAdapter(adapter);


    }
}