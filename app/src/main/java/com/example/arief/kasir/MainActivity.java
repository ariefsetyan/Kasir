package com.example.arief.kasir;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    AppCompatEditText user, pass;
    RelativeLayout relativeLayout;
    TextInputLayout userLayout, passLayout;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.login);
        user = (AppCompatEditText)findViewById(R.id.username);
        userLayout = (TextInputLayout)findViewById(R.id.username_TextInputlayout);
        pass = (AppCompatEditText)findViewById(R.id.password);
        passLayout = (TextInputLayout)findViewById(R.id.password_TextInputlayout);
        relativeLayout = (RelativeLayout)findViewById(R.id.relativlayout);
        relativeLayout.setOnClickListener(null);

        user.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (user.getText().toString().isEmpty()){
                    userLayout.setErrorEnabled(true);
                    userLayout.setError("Please enter username!");
                }else{
                    userLayout.setErrorEnabled(false);
                }
            }
        });
        user.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (user.getText().toString().isEmpty()){
                    userLayout.setErrorEnabled(true);
                    userLayout.setError("Please enter username!");
                }else{
                    userLayout.setErrorEnabled(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        passLayout.setCounterEnabled(true);
        passLayout.setCounterMaxLength(8);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Home.class);
                startActivity(intent);
            }
        });
    }
}
