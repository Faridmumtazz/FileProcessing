package mumtaz.binar.fileprocessing.handlePDF

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_pdf_web_view.*
import mumtaz.binar.fileprocessing.R

class pdfWebView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf_web_view)

        loadPdfWebView()
    }

    fun loadPdfWebView(){
        viewpdfwebview.webViewClient = WebViewClient()
        viewpdfwebview.settings.setSupportZoom(true)
        viewpdfwebview.settings.javaScriptEnabled = true
        viewpdfwebview.loadUrl("https://drive.google.com/viewerng/viewer?embedded=true&url=" + "https://kotlinlang.org/assets/kotlin-media-kit.pdf")
    }
}