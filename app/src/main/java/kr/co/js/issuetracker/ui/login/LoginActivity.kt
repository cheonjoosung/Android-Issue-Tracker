package kr.co.js.issuetracker.ui.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import kr.co.js.issuetracker.MainActivity
import kr.co.js.issuetracker.R
import kr.co.js.issuetracker.common.click
import kr.co.js.issuetracker.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    val loginViewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.click {

            val url = binding.etUrl.text.toString()
            val id = binding.etId.text.toString()
            val pw = binding.etPw.text.toString()

            if (url.isEmpty()) {
                Toast.makeText(this, getString(R.string.login_info_error, "URL"), Toast.LENGTH_SHORT).show()
                return@click
            }

            if (id.isEmpty()) {
                Toast.makeText(this, getString(R.string.login_info_error, "ID"), Toast.LENGTH_SHORT).show()
                return@click
            }

            if (pw.isEmpty()) {
                Toast.makeText(this, getString(R.string.login_info_error, "PW"), Toast.LENGTH_SHORT).show()
                return@click
            }

            Intent(applicationContext, MainActivity::class.java).apply {
                startActivity(this)
                finish()
            }
        }
    }
}