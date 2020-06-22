package com.diegodevelopero.stopgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    private lateinit var myWebView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myWebView = findViewById<View>(R.id.webview) as WebView

        myWebView.apply {
            // Configure related browser settings
            this.settings.loadsImagesAutomatically = true
            this.settings.javaScriptEnabled = true
            myWebView.scrollBarStyle = View.SCROLLBARS_INSIDE_OVERLAY
            // Configure the client to use when opening URLs
            myWebView.webViewClient = WebViewClient()
            // Load the initial URL
            myWebView.loadUrl("https://stopthegame.herokuapp.com/")
        }
    }
}
