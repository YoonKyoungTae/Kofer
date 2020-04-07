package dev.androidblog.kofer

import android.content.Context
import android.content.SharedPreferences

object Kofer {

    lateinit var pref: SharedPreferences

    public fun init(
        context: Context,
        preferencesName: String = context.packageName,
        mode: Int = Context.MODE_PRIVATE
    ) {
        pref = context.applicationContext.getSharedPreferences(preferencesName, mode)
    }

    public fun getString(key: String, default: String): String? {
        return pref.getString(key, default)
    }

    public fun getInt(key: String, default: Int): Int? {
        return pref.getInt(key, default)
    }

    public fun getLong(key: String, default: Long): Long? {
        return pref.getLong(key, default)
    }

    public fun getFloat(key: String, default: Float): Float? {
        return pref.getFloat(key, default)
    }

    public fun getBoolean(key: String, default: Boolean): Boolean? {
        return pref.getBoolean(key, default)
    }

}

public fun Kofer.edit(commit: Boolean = false, p1: KoferEditor.() -> Unit) {
    val editor = KoferEditor(pref.edit())
    p1(editor)
    if (commit) {
        editor.commit()
    } else {
        editor.apply()
    }
}
