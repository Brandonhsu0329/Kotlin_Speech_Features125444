package org.merlyn.kotlinspeechfeaturesdemo.ui

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.viewModels
import kotlinx.android.synthetic.main.activity_main.*
import org.merlyn.kotlinspeechfeaturesdemo.R
import org.merlyn.kotlinspeechfeatures.SpeechFeatures

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cardSsc.setOnClickListener {
            Toast.makeText(this, "SSC called. Check logcat.", Toast.LENGTH_LONG).show()
            viewModel.performSsc()
        }

        cardMfcc.setOnClickListener {
            Toast.makeText(this, "MFCC called. Check logcat.", Toast.LENGTH_LONG).show()
            viewModel.performMfcc()
//            Log.d("TAG123", "123")

        }

        cardFbank.setOnClickListener {
            Toast.makeText(this, "FBANK called. Check logcat.", Toast.LENGTH_LONG).show()
            viewModel.performFbank()
        }

        cardLogFbank.setOnClickListener {
            Toast.makeText(this, "LOGFBANK called. Check logcat.", Toast.LENGTH_LONG).show()
            viewModel.performLogfbank()
        }
    }
}