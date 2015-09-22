package com.example.johan.myfragmentexample;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/**
 * A placeholder fragment containing a simple view.
 */
public class WebFragment extends Fragment {

    public WebFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_web, container, false);
        WebView myWebView = (WebView) view.findViewById(R.id.webView1);
        myWebView.loadUrl("http://www.example.com");

        return view;
    }
}
