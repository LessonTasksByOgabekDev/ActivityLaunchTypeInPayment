package dev.ogabek.payment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StatusActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_status)

        initViews()

    }

    private fun initViews() {
        val success = findViewById<Button>(R.id.btn_succes)
        success.setOnClickListener {
            openMainActivity()
        }
        val failure = findViewById<Button>(R.id.btn_failure)
        failure.setOnClickListener {
            finish()
        }
    }

    private fun openMainActivity() {
        startActivity(Intent(this, MainActivity::class.java))
    }

}