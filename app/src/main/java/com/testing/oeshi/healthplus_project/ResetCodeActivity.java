package com.testing.oeshi.healthplus_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ResetCodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_code);
    }

    public void back(View view){
        Intent intent = new Intent(this, ForgotPasswordActivity.class);
        startActivity(intent);
    }

    public void verify(View view){
        Intent intent = new Intent(this, ResetPasswordActivity.class);
        startActivity(intent);
    }

//    public void onClick(View view){
//        Intent intent = new Intent(this,)
//    }
}
