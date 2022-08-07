package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView enter = (TextView) findViewById(R.id.enter);
        TextView number = (TextView) findViewById(R.id.number1);
        TextView numberr = (TextView) findViewById(R.id.number22);
        Button calculate = (Button) findViewById(R.id.button5);
        TextView total = (TextView)findViewById(R.id.textView);



        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(number.getText().toString());
                int n2 = Integer.parseInt(numberr.getText().toString());
                int result = n1+n2;
                total.setText(String.valueOf(result));

            }
        });



    }


}

