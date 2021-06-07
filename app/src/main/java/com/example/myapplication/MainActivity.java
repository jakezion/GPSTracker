package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gps_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

//    public void onClick_button_submit(View view) {
//        EditText editText_dateOfBirth = (EditText) findViewById(R.id.editText_dateOfBirth);
//        String dob = editText_dateOfBirth.getText().toString();
//        // Check date of birth for validity here...
//        boolean validDOB = false;  // Switch to test code.
//
//
//    }
//    if(!validName)
//
//    {
//        Toast.makeText(this, "Invalid name. Please enter full name", Toast.LENGTH_SHORT).show();
//        editText_name.selectAll();
//        editText_name.requestFocus();
//    }


}
