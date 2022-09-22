package com.example.passwordmatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView label;
    EditText password1;
    EditText password2;
    String password1Str;
    String password2Str;
    Boolean match = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        check = (Button) findViewById(R.id.button);
        label = (TextView) findViewById(R.id.label);


//        check.setOnClickListener (new View.OnClickListener() {
//
//            @Override
//            public void onClick(View view) {
//                helloWorld.setVisibility(View.VISIBLE);
//            }
//        });
    }

    public void passwordMatch(View v){
        password1 = (EditText) findViewById(R.id.password1);
        password2 = (EditText) findViewById(R.id.password2);
        password1Str = password1.getText().toString();
        password2Str = password2.getText().toString();

        if(PasswordMatch.match(password1Str, password2Str)){
            label.setTextColor(getResources().getColor(R.color.green));
            label.setText("THANK YOU");
        }else{
            label.setTextColor(getResources().getColor(R.color.red));
            label.setText("PASSWORDS MUST MATCH");
        }

        match = true;
    }
}