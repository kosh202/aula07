package com.example.aula07

import android.app.AlertDialog
import android.content.Context

fun alert(title: String, msg: String, cxt: Context) {
    AlertDialog.Builder(cxt)
        .setTitle(title)
        .setMessage(msg)
        .setPositiveButton("ok", null)
        .create()
        .show()
}