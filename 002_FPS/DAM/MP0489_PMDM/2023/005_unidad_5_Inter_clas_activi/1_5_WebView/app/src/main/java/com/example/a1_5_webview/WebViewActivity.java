package com.example.a1_5_webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        webView=(WebView) findViewById(R.id.webView);
        Bundle bundle=getIntent().getExtras();
        String url=bundle.getString("direccion");
        webView.loadUrl("http://"+url);

    }
}