package kr.co.js.issuetracker.ui.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.js.issuetracker.MainActivity
import kr.co.js.issuetracker.common.click
import kr.co.js.issuetracker.databinding.ActivityLoginBinding

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