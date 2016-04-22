package com.example.ahmed_inf.louage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Register extends AppCompatActivity {
    EditText t1 ,t2 ;
    String user_log , user_pass ;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        t1= (EditText) findViewById(R.id.t1);
        t2= (EditText) findViewById(R.id.t2);
        b1 = (Button) findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                userReg(view);
            }
        });

    }
    public void userReg(View view){
        user_log  = t1.getText().toString();
        user_pass = t2.getText().toString();
        String method = "registrer" ;
        BackgroundTask BackgroundTask = new BackgroundTask(this);
        BackgroundTask.execute(user_log,method,user_pass);
        finish();


    }
    public void userLogin (View view)
    {startActivity(new Intent(this, Register.class));   }


}