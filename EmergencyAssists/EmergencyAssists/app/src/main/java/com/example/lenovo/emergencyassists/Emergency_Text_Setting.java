package com.example.lenovo.emergencyassists;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Emergency_Text_Setting extends AppCompatActivity {
    EditText E1;
    Button b1;
    String s1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency__text__setting);
        E1 = (EditText)findViewById(R.id.editText);
        b1 = (Button) findViewById(R.id.button);
    }

    public void saveText(View v){
        s1 = E1.getText().toString();
        E1.setText(s1);
    }
}
