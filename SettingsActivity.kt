package com.liquidboard.ime.ui

import android.app.Activity
import android.os.Bundle
import android.view.Gravity
import android.view.inputmethod.InputMethodManager
import android.content.Context
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class SettingsActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
        }
        layout.addView(TextView(this).apply {
            text = "LiquidBoard Glass AI\\n\\nEnable the keyboard in your Android keyboard settings, then select LiquidBoard when typing."
            textSize = 18f
            gravity = Gravity.CENTER
        })
        layout.addView(Button(this).apply {
            text = "Open keyboard settings"
            setOnClickListener {
                startActivity(android.content.Intent(android.provider.Settings.ACTION_INPUT_METHOD_SETTINGS))
            }
        })
        setContentView(layout)
    }
}
