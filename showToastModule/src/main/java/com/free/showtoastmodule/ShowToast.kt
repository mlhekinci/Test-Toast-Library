package com.free.showtoastmodule

import android.content.Context
import android.widget.Toast

object ShowToast{

    fun showToast(c: Context, m: String){
        Toast.makeText(c, m, Toast.LENGTH_LONG).show()
    }

}