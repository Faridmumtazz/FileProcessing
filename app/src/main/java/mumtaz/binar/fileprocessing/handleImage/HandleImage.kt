package mumtaz.binar.fileprocessing.handleImage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_handle_image.*
import mumtaz.binar.fileprocessing.R

class HandleImage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_handle_image)

        btn_pick.setOnClickListener {
            pickImageFromGallery()
        }
    }

    fun pickImageFromGallery(){
        val inten = Intent(Intent.ACTION_PICK)
        inten.type = "image/*"

        startActivityForResult(inten, 100)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == 100 && resultCode === RESULT_OK){
            viewImage.setImageURI(data?.data)
        }
    }
}