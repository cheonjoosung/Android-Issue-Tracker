package kr.co.js.issuetrackerhelper.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.js.issuetrackerhelper.MainActivity
import kr.co.js.issuetrackerhelper.common.click
import kr.co.js.issuetrackerhelper.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.click {
            Intent(applicationContext, MainActivity::class.java).apply {
                startActivity(this)
                finish()
            }
        }
    }
}