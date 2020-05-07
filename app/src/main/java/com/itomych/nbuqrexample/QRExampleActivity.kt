package com.itomych.nbuqrexample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.itomych.qr_sample.QrManager

class QRExampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qr_example)

        val qrManagerInfo = QrManager().getQrManagerInfo()
        Log.d("qr_sample", qrManagerInfo)
    }
}