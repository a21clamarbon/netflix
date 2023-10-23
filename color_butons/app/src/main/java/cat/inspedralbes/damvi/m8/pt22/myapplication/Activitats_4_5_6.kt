package cat.inspedralbes.damvi.m8.pt22.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import cat.inspedralbes.damvi.m8.pt22.myapplication.R.id.button1

class Activitats_4_5_6 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activitats456)

                val button = findViewById<Button>(button1)
                button.setOnClickListener {
                    Log.d("MiApp", "Botón apretado")
                }

                val button = findViewById<Button>(R.id.button2)
                button.setOnClickListener {
                    val text = "Botón apretado"
                    val duration = Toast.LENGTH_SHORT
                    val toast = Toast.makeText(applicationContext, text, duration)
                    toast.show()
                }
            }
        }

