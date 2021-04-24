package br.com.linkyoung

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
        findViewById<Button>(R.id.buttonVoltar).setOnClickListener {
            finish()
        }
    }
}