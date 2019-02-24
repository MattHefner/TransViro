package com.example.android.transviro;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class Activity_Login_Screen extends AppCompatActivity {

    RelativeLayout group1, group2;
    Handler handler = new Handler();
    Runnable runnable = new Runnable() {

        @Override
        public void run() {
            group1.setVisibility(View.VISIBLE);
            group2.setVisibility(View.VISIBLE);


        }
    };

    public class AsteriskPasswordTransformationMethod extends PasswordTransformationMethod {
        @Override
        public CharSequence getTransformation(CharSequence source, View view) {
            return new PasswordCharSequence(source);
        }

        private class PasswordCharSequence implements CharSequence {
            private CharSequence mSource;
            public PasswordCharSequence(CharSequence source) {
                mSource = source; // Store char sequence
            }
            public char charAt(int index) {
                return '*'; // sets characters entered to *
            }
            public int length() {
                return mSource.length(); // Return default
            }
            public CharSequence subSequence(int start, int end) {
                return mSource.subSequence(start, end); // Return default
            }
        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__login__screen);

        group1 = (RelativeLayout) findViewById(R.id.group1);
        group2 = (RelativeLayout) findViewById(R.id.group2);

        handler.postDelayed(runnable, 2000); // timeout for splash screen

        EditText edittext = (EditText)findViewById(R.id.passEdit);
        edittext.setTransformationMethod(new AsteriskPasswordTransformationMethod());
    }

    public void loginUser(View v){
        Intent startNewActivity = new Intent(this, MainMenu.class);
        startActivity(startNewActivity);
    }

    public void signUp(View v){
        Intent startNewActivity = new Intent(this, SignUp.class);
        startActivity(startNewActivity);
    }
}
