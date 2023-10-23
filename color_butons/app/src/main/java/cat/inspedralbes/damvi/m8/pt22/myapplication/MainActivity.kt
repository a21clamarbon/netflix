package cat.inspedralbes.damvi.m8.pt22.myapplication

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.blau)
        val button2: Button = findViewById(R.id.vermell)
        val button3: Button = findViewById(R.id.verd)

        button1.setOnClickListener {
            val intent = Intent(this, Blau::class.java)
            intent.putExtra("color1", Color.BLUE)
            startActivity(intent)

        }

        button2.setOnClickListener {
            val intent = Intent(this, Vermell::class.java)
            intent.putExtra("color2", Color.RED)
            startActivity(intent)
        }

        button3.setOnClickListener {
            val intent = Intent(this, Verd::class.java)
            intent.putExtra("color3", Color.GREEN)
            startActivity(intent)
        }
    }
}

