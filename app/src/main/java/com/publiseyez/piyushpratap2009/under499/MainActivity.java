package com.publiseyez.piyushpratap2009.under499;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webpage;
    ProgressDialog pd;
    private float xCor;
    Intent web_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CookieManager cm = CookieManager.getInstance();
        cm.setAcceptCookie(true);

        webpage=(WebView)findViewById(R.id.webpage);
        pd = new ProgressDialog(MainActivity.this);
        pd.setMessage("loading");


        web_url=getIntent();

        webpage.setWebChromeClient(new WebChromeClient());
        webpage.getSettings().setLoadWithOverviewMode(true);
        webpage.getSettings().setUseWideViewPort(true);
        webpage.getSettings().setSupportZoom(true);
        webpage.getSettings().setBuiltInZoomControls(true);
        webpage.getSettings().setAllowFileAccess(true);
        webpage.getSettings().setPluginState(WebSettings.PluginState.ON);
        webpage.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webpage.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        webpage.getSettings().setJavaScriptEnabled(true);
        webpage.getSettings().setDefaultZoom(WebSettings.ZoomDensity.FAR);
        webpage.setBackgroundColor(Color.TRANSPARENT);
        webpage.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_INSET);
        webpage.setWebViewClient(new WebViewClient() {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            pd.show();
            invalidateOptionsMenu();
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            webpage.loadUrl(url);
            return true;
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            invalidateOptionsMenu();
            pd.dismiss();
        }

        @Override
        public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            super.onReceivedError(view, request, error);
            invalidateOptionsMenu();
        }
    });
        webpage.clearCache(true);
        webpage.clearHistory();
        webpage.getSettings().setJavaScriptEnabled(true);
        webpage.setHorizontalScrollBarEnabled(false);

        webpage.setOnTouchListener(new View.OnTouchListener() {
        public boolean onTouch(View v, MotionEvent event) {

            if (event.getPointerCount() > 1) {
                //Multi touch detected
                return true;
            }

            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN: { xCor = event.getX(); } break; //save the x
                case MotionEvent.ACTION_MOVE:
                case MotionEvent.ACTION_CANCEL:
                case MotionEvent.ACTION_UP: { // set x so that it doesn't move
                    event.setLocation(xCor, event.getY()); } break;
            }
            return false;
        }
    });

        webpage.loadUrl(web_url.getStringExtra("url"));

}
}
