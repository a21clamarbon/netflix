package cat.inspedralbes.damvi.m8.pt22.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Activitats_1_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activitats12)

                val textView = findViewById<TextView>(R.id.textView)
                textView.text = "Hola Kotlin"
            }

    }
