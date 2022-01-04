package dev.ogabek.payment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ConfirmActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm)

        initViews()

    }

    private fun initViews() {
        val confirm = findViewById<Button>(R.id.btn_confirm)
        confirm.setOnClickListener {
            openStatusActivity()
        }
    }

    private fun openStatusActivity() {
        startActivity(Intent(this, StatusActivity::class.java))
    }

}