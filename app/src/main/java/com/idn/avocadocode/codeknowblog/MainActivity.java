package com.idn.avocadocode.codeknowblog;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blog_activity);

        WebView mWebView = (WebView) findViewById(R.id.webViewasli);

        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //loads the url
        mWebView.loadUrl("https://codeknow.wordpress.com");

        //cancels all hyperlinks
        mWebView.setWebViewClient(new WebViewClient() {
                                      public boolean shouldOverrideUrlLoading(WebView view, String url) {
                                          return false;
                                      }
                                  }
        );



    }
}