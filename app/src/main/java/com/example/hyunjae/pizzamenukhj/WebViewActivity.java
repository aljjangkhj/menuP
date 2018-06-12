package com.example.hyunjae.pizzamenukhj;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends Activity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.webview);

        mWebView = (WebView)findViewById(R.id.webview);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });

        String pizzamenu = getIntent().getStringExtra("이벤트");
        if(("피자헛").equals(pizzamenu)){
            mWebView.loadUrl("https://pizzahut.co.kr/event/eventList");
        }else if(("도미노").equals(pizzamenu)){
            mWebView.loadUrl("https://web.dominos.co.kr/event/list?gubun=E0200");
        }else if(("미스터피자").equals(pizzamenu)){
            mWebView.loadUrl("http://www.mrpizza.co.kr/event/event_on");
        }else if(("피자알볼로").equals(pizzamenu)){
            mWebView.loadUrl("https://www.pizzaalvolo.co.kr/promotion/event_list.asp");
        }else if(("피자스쿨").equals(pizzamenu)){
            mWebView.loadUrl("https://pizzaschool.net/category/events/");
        }else if(("에땅").equals(pizzamenu)){
            mWebView.loadUrl("https://www.pizzaetang.com/event/eventIng_list.asp");
        }else if(("7번가").equals(pizzamenu)){
            mWebView.loadUrl("http://www.7thpizza.com/?folder=event&page=01&type=ing");
        }else if(("피치").equals(pizzamenu)){
            mWebView.loadUrl("http://pncg.co.kr/page/sub4_2_list.html");
        }/*else if(("임실").equals(pizzamenu)){
            mWebView.loadUrl("http://www.mrpizza.co.kr/event/event_on");
        }*/
    }
}
