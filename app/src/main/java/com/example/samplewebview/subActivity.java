package com.example.samplewebview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class subActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        WebView webView = findViewById(R.id.web_view);

        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        Intent intent = getIntent();
        String btn = intent.getStringExtra("btn");
        if(btn.equals("a")){
            webView.loadUrl("http://www.ggoreb.com/game/2048");

        }else  if (btn.equals("b")){
            webView.loadUrl("http://www.ggoreb.com/game/omok");
        }
    }
}
