package com.appforge.generated;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
public class MainActivity extends Activity {
 @SuppressLint("SetJavaScriptEnabled") @Override public void onCreate(Bundle state) {
  super.onCreate(state); WebView web = new WebView(this); WebSettings settings = web.getSettings();
  settings.setJavaScriptEnabled(true); settings.setDomStorageEnabled(true); web.setWebViewClient(new WebViewClient());
  web.loadUrl(BuildConfig.WEBSITE_URL); setContentView(web);
 }
 @Override public void onBackPressed() { WebView web=(WebView)((android.view.ViewGroup)findViewById(android.R.id.content)).getChildAt(0); if(web.canGoBack()) web.goBack(); else super.onBackPressed(); }
}
