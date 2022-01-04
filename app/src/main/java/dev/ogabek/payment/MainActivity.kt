package dev.ogabek.payment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var result:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

    }

    private fun initViews() {
        val payment = findViewById<Button>(R.id.btn_payment)
        payment.setOnClickListener {
            openPaymentActivity()
        }
        result = findViewById<TextView>(R.id.tv_result)
    }

    private fun openPaymentActivity() {
        startActivity(Intent(this, PaymentActivity::class.java))
    }

}