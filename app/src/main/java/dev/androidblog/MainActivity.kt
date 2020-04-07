package dev.androidblog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.androidblog.kofer.Kofer
import dev.androidblog.kofer.edit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Kofer.init(this)

        Kofer.edit {
            put("key", "value")
            put("key", 123)
            put("key_dg", "ewfewf")
        }

        Kofer.getString("", "")
        Kofer.edit {
            remove("")
        }

    }
}
