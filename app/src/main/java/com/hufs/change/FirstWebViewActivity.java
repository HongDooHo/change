package com.hufs.change;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;


public class FirstWebViewActivity extends AppCompatActivity {

    private WebView w;
    private WebSettings ws;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.promotion);

        w = (WebView) findViewById(R.id.promote);
        ws = w.getSettings();
        ws.setJavaScriptEnabled(true);//자바스크립트 허용
        ws.setSupportMultipleWindows(false);//새창 띄우기 허용x
        ws.setJavaScriptCanOpenWindowsAutomatically(false);//js 새창 x
        ws.setLoadWithOverviewMode(true);//메타태그
        ws.setUseWideViewPort(true);//화면맞추기
        ws.setSupportZoom(false);//줌기능
        ws.setBuiltInZoomControls(false);
        ws.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        ws.setCacheMode(WebSettings.LOAD_NO_CACHE);//캐시허용
        ws.setDomStorageEnabled(true);//로컬저장소 허용

        w.loadUrl("https://change-promotion.netlify.app/");
    }
}
