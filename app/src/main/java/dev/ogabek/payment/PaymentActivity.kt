package dev.ogabek.payment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        initViews()

    }

    private fun initViews() {
        val pay = findViewById<Button>(R.id.btn_pay)
        pay.setOnClickListener {
            openConfirmActivity()
        }
    }

    private fun openConfirmActivity() {
        startActivity(Intent(this, ConfirmActivity::class.java))
    }

}