package com.android.dnp.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.support.constraint.ConstraintLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button  red, blue, green,yahoo,google;
    ConstraintLayout  conslayout ;
    WebView wb;
    private void wbview() {
        wb = findViewById(R.id.webid1);
        WebViewClient client = new WebViewClient();
        wb.setWebViewClient(client);
        wb.getSettings().setJavaScriptEnabled(true);

    }

    private void yahoo() {
        wb.loadUrl("https://www.yahoo.com/");
    }

    private void google() {
        wb.loadUrl("https://www.google.com/");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        red = (Button) findViewById(R.id.radioButton);
        blue = (Button) findViewById(R.id.radioButton2);
        green = (Button) findViewById(R.id.radioButton3);
        yahoo = (Button) findViewById(R.id.button);
        google = (Button) findViewById(R.id.button2);

        red.setOnClickListener(this);
        blue.setOnClickListener(this);
        green.setOnClickListener(this);
        conslayout= (ConstraintLayout) findViewById(R.id.layoutid);
        yahoo.setOnClickListener(this);
        google.setOnClickListener(this);
        wbview(); ;
    }

       @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.radioButton:
                conslayout.setBackgroundColor(getResources().getColor(R.color.red));

                break;
            case R.id.radioButton2:
                conslayout.setBackgroundColor(getResources().getColor(R.color.blue));

                break;
            case R.id.radioButton3:
                conslayout.setBackgroundColor(getResources().getColor(R.color.green));

                break;

            case R.id.button:
                    yahoo();
                break;
            case R.id.button2:
                    google();
                break;
        }
    }
}
