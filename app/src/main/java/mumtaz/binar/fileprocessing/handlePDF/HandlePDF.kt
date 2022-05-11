package mumtaz.binar.fileprocessing.handlePDF

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_handle_pdf.*
import mumtaz.binar.fileprocessing.R

class HandlePDF : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_handle_pdf)

        hpdf_webview.setOnClickListener {
            startActivity(Intent(this, pdfWebView::class.java))
        }
        hpdf_asset.setOnClickListener {
            startActivity(Intent(this, pdfAsset::class.java))
        }

        hpdf_storage.setOnClickListener {
            startActivity(Intent(this, PdfStorage::class.java))
        }
        hpdf_internet.setOnClickListener {
            startActivity(Intent(this, PdfInternet::class.java))
        }
    }
}