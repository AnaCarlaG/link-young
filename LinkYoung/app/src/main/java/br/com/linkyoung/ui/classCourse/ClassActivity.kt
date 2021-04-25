package br.com.linkyoung.ui.classCourse

import android.net.Uri
import android.os.Bundle
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import br.com.linkyoung.R

public class ClassActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class)

        var video = findViewById<VideoView>(R.id.video)
        val videoFile = "android.resource://" + getPackageName() + "/" + R.raw.video1
        video.setVideoURI(Uri.parse(videoFile ))
        video.requestFocus()
        video.start()
    }

}