package com.example.ahmed_inf.louage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Voyagee extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voyagee);

     /*   Spinner mobile = (Spinner) findViewById(R.id.spinnerdepart);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.Gestion_Louage, android.R.layout.simple_spinner_item);
        mobile.setAdapter(adapter);

        Spinner mobile1 =(Spinner) findViewById(R.id.spinnerarrive);
        ArrayAdapter adapter1 = ArrayAdapter.createFromResource(this, R.array.Gestion_Louage, android.R.layout.simple_spinner_item);
        mobile1.setAdapter(adapter1);

        Spinner mobile2 =(Spinner) findViewById(R.id.spinnerheure);
        ArrayAdapter adapter2 = ArrayAdapter.createFromResource(this, R.array.Time, android.R.layout.simple_spinner_item);
        mobile2.setAdapter(adapter2);

        Spinner mobile3 =(Spinner) findViewById(R.id.spinnerminute);
        ArrayAdapter adapter3 = ArrayAdapter.createFromResource(this, R.array.Time, android.R.layout.simple_spinner_item);
        mobile3.setAdapter(adapter3);

        Button btButton = (Button)findViewById(R.id.btnvalider);
     /*  btValid.setOnClickListener(new View.OnClickListener() {

});*/

    }
}
