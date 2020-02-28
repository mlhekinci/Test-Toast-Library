package com.free.testtoastlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.free.showtoastmodule.ShowToast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ShowToast.showToast(this, "Hello I`m a Android Library Module")
    }
}
