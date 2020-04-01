package com.karthick.localizationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button androidBtn, iosBtn, windowsBtn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidBtn = findViewById(R.id.android);
        iosBtn = findViewById(R.id.ios);
        windowsBtn = findViewById(R.id.windows);
        textView = findViewById(R.id.textview);

        androidBtn.setOnClickListener(this);
        iosBtn.setOnClickListener(this);
        windowsBtn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.android:
                    textView.setText(getResources().getText(R.string.android_text));
                break;

            case R.id.ios:
                textView.setText(getResources().getText(R.string.ios_text));
                break;

            case R.id.windows:
                textView.setText(getResources().getText(R.string.windows_text));
                break;
        }
    }
}
