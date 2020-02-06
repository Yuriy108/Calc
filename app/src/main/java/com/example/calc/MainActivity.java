package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button plus;
    Button minus;
    Button mul;
    Button div;
    Button equal;
    TextView result;
    EditText first;
    EditText second;
    String f;
    String s;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus=findViewById(R.id.plus);
        minus=findViewById(R.id.minus);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        result=findViewById(R.id.result);
        first=findViewById(R.id.first);
        second=findViewById(R.id.second);
        f=first.getText().toString();
        s=second.getText().toString();
        View.OnClickListener onClickListener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id=view.getId();
                switch (id) {
                    case R.id.plus:
                        Integer r=Integer.parseInt(f) - Integer.parseInt(s);
                        result.setText(r.toString());
                        break;
                    case R.id.minus:
                         r=(Integer.parseInt(f) - Integer.parseInt(s));
                        result.setText(r.toString());
                        break;
                    case R.id.mul:
                         r=(Integer.parseInt(f) * Integer.parseInt(s));
                        result.setText(r.toString());

                        break;
                    case R.id.div:
                        Double d=Double.parseDouble(f)/Double.parseDouble(s);
                        result.setText(d.toString());
                        break;


                }
            }
        };

        plus.setOnClickListener(onClickListener);
        minus.setOnClickListener(onClickListener);
        mul.setOnClickListener(onClickListener);
        div.setOnClickListener(onClickListener);


    }
}
