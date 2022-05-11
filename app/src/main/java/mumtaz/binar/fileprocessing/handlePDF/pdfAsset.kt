package mumtaz.binar.fileprocessing.handlePDF

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_pdf_asset.*
import mumtaz.binar.fileprocessing.R

class pdfAsset : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf_asset)

        showPdfFromAssets(getPdfName())
    }

    fun showPdfFromAssets(pdfName: String){
        pdfasset.fromAsset(pdfName)
            .defaultPage(0)
            .load()
    }
    fun getPdfName():String{
        return "kotlin-media-kit.pdf"
    }
}