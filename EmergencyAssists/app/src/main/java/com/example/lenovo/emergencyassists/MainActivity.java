package com.example.lenovo.emergencyassists;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //t1 = (TextView) findViewById(R.id.textView2);
    }

    public void Switchable(View view){
        Intent intent = new Intent(MainActivity.this, Emergency_Text_Setting.class);
        startActivity(intent);

    }

    public void documentation(View view){
        Intent intent = new Intent(MainActivity.this, Documentation.class);
        startActivity(intent);
    }


}
