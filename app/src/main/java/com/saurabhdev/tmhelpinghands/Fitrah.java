package com.saurabhdev.tmhelpinghands;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

//import androidx.appcompat.app.AlertDialog;
//import androidx.appcompat.app.AppCompatActivity;

public class Fitrah extends AppCompatActivity {
    WebView webView;
    ProgressBar progressBarWeb;
    ProgressDialog progressDialog;
    RelativeLayout relativeLayout;
    Button btnNoconnection;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_fitrah);
        webView =(WebView) findViewById(R.id.webView);
        progressBarWeb= (ProgressBar) findViewById(R.id.progressBar);
        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading Please Wait...");
        btnNoconnection = (Button) findViewById(R.id.btnNoconnection);
        relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        checkConnection();

        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setAppCacheEnabled(true);
        webView.getSettings().setAllowContentAccess(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.loadUrl("https://tanzeemulmakatib.org/donate/fitrah/");
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
            public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
                webView.loadUrl("file:///android_asset/html/default_error_page.html");
                checkConnection();

            }

        });
        webView.setWebChromeClient(new WebChromeClient(){

            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                progressBarWeb.setVisibility(View.VISIBLE);
                progressBarWeb.setProgress(newProgress);
                progressDialog.show();
                if(newProgress==100){
                    progressBarWeb.setVisibility(View.GONE);
                    progressDialog.dismiss();
                }


                super.onProgressChanged(view, newProgress);
            }
        });
        btnNoconnection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkConnection();
            }
        });

    }

    @Override
    public void onBackPressed() {
        openmainactivity1();
    }

    public void checkConnection(){
        ConnectivityManager connectivityManager = (ConnectivityManager)
                this.getSystemService(Context.CONNECTIVITY_SERVICE);

        assert connectivityManager != null;
        NetworkInfo wifi= connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        NetworkInfo mobileNetwork= connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);

        assert wifi != null;
        if(wifi.isConnected()){
            webView.loadUrl("https://tanzeemulmakatib.org/donate/fitrah/");
            webView.setVisibility(View.VISIBLE);
            relativeLayout.setVisibility(View.GONE);

        }
        else {
            assert mobileNetwork != null;
            if(mobileNetwork.isConnected()){
                webView.loadUrl("https://tanzeemulmakatib.org/donate/fitrah/");
                webView.setVisibility(View.VISIBLE);
                relativeLayout.setVisibility(View.GONE);

            }
            else{
                webView.setVisibility(View.GONE);
                relativeLayout.setVisibility(View.VISIBLE);

            }
        }




    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_previous:
                onBackPressed();
                break;
            case R.id.nav_next:
                if (webView.canGoForward()){
                    webView.goForward();
                }
                break;
            case R.id.nav_reload:
                openActivityMain();
                break;

        }
        return super.onOptionsItemSelected(item);
    }

    private void openActivityMain() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openmainactivity1(){
        Intent intent = new Intent(this, SupportTanzeemNative.class);
        startActivity(intent);
    }
}