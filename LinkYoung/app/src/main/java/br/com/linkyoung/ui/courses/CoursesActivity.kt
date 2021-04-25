package br.com.linkyoung.ui.courses

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import br.com.linkyoung.R
import br.com.linkyoung.R.layout.activity_courses
import br.com.linkyoung.ui.classCourse.ClassActivity

class CoursesActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_courses)

       // var button = findViewById<ImageButton>(R.id.buttonAula1)
       // button.setOnClickListener {
            //val segundaTela = Intent(this, ClassActivity::class.java)
            //startActivity(segundaTela)
       // }
    }
}