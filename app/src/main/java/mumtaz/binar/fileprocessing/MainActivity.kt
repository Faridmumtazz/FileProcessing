package mumtaz.binar.fileprocessing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import mumtaz.binar.fileprocessing.handleImage.HandleImage
import mumtaz.binar.fileprocessing.handlePDF.HandlePDF
import mumtaz.binar.fileprocessing.handlePDF.pdfAsset
import mumtaz.binar.fileprocessing.handleVideo.HandlingVideoPlayer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        handlepdf.setOnClickListener {
            startActivity(Intent(this, HandlePDF::class.java))
        }

        handlevideo.setOnClickListener {
            startActivity(Intent(this,HandlingVideoPlayer::class.java))
        }

        handleimage.setOnClickListener {
            startActivity(Intent(this,HandleImage::class.java))
        }


    }
}