package com.axelby.podax.ui;

import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;

import com.axelby.podax.R;

public class AboutActivity extends PodaxActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

        setContentView(R.layout.about);
		WebView webview = (WebView) findViewById(R.id.webview);
		String content = getString(R.string.about_content);
		Log.i("Podax", content);
		String html = "<html><head><style type=\"text/css\">" +
				"a { color: #E59F39 }" +
				"</style></head>" +
				"<body style=\"background:transparent;color:white\">" + content + "</body></html>"; 
		webview.loadData(html, "text/html", "utf-8");
		webview.setBackgroundColor(0x00000000);
	}

}
