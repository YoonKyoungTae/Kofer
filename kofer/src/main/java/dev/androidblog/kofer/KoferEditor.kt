package dev.androidblog.kofer

import android.content.SharedPreferences
import android.util.Log

class KoferEditor(private val editor: SharedPreferences.Editor) {

    public fun put(key: String, value: Any, isPrintLog: Boolean = false) {
        if (isPrintLog) {
            Log.d("TAG", value.toString())
        }

        when(value) {
            is String -> {
                editor.putString(key, value)
            }
            is Int -> {
                editor.putInt(key, value)
            }
            is Long -> {
                editor.putLong(key, value)
            }
            is Float -> {
                editor.putFloat(key, value)
            }
            is Boolean -> {
                editor.putBoolean(key, value)
            }
            else -> {}
        }
    }

    public fun remove(key: String) {
        editor.remove(key)
    }

    public fun apply() {
        editor.apply()
    }

    public fun commit() {
        editor.commit()
    }

}