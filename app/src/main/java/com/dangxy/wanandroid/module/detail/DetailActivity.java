package com.dangxy.wanandroid.module.detail;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.numberprogressbar.NumberProgressBar;
import com.dangxy.wanandroid.R;
import com.dangxy.wanandroid.base.BaseActivity;

import butterknife.BindView;
import butterknife.OnClick;
/**
 * @description  描述
 * @author  dangxy99
 * @date   2018/1/13
 */
public class DetailActivity extends BaseActivity {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.iv_back)
    ImageView ivBack;
    @BindView(R.id.progressBar)
    NumberProgressBar progressBar;
    @BindView(R.id.wv_url)
    WebView wvUrl;
    private String url;


    @Override
    protected void initView() {
        url = getIntent().getStringExtra("url");
        WebSettings webSettings = wvUrl.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setAppCacheEnabled(true);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        webSettings.setBuiltInZoomControls(false);
        webSettings.setJavaScriptEnabled(true);
        wvUrl.loadUrl(url);

        WebChromeClient webChromeClient = new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {
                super.onProgressChanged(view, newProgress);
                progressBar.setProgress(newProgress);
                if (newProgress == 100) {
                    progressBar.setVisibility(View.INVISIBLE);
                } else {
                    progressBar.setVisibility(View.VISIBLE);
                }
            }
            @Override
            public void onReceivedTitle(WebView view, String title) {
                super.onReceivedTitle(view, title);
                if (title.equals("")) {
                    tvTitle.setText("详情");
                } else {
                    tvTitle.setText(title);
                }
            }
        };
        wvUrl.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                wvUrl.loadUrl(url);
                return true;
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
            }
        });




        wvUrl.setWebChromeClient(webChromeClient);
    }


    @Override
    protected int attachLayoutRes() {
        return R.layout.activity_detail;
    }

    @OnClick(R.id.iv_back)
    public void onViewClicked() {
        finish();
    }
}
