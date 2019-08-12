package com.hitanshudhawan.jsondsl.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.hitanshudhawan.jsondsl.json
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.text = json {
            "name" to "Hitanshu"
            "age" to 22
            "male" to true
        }.toString(2)
    }
}
