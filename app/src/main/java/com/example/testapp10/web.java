package com.example.testapp10;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.VideoView;

public class web extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

      webView = (WebView)findViewById(R.id.webvie);
      webView.setWebViewClient(new WebViewClient());
      webView.getSettings().setJavaScriptEnabled(true);
      webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
      webView.loadUrl("http://192.168.4.1");

    }
}
