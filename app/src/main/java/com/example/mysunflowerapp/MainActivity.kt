package com.example.mysunflowerapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText

const val TEXTO = "Actividad 2"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.boton_cambio)
        button.setOnClickListener {
            if(button.text != "Soy Azul") {
                button.setBackgroundColor(Color.parseColor("#6495ED"))
                button.setText("Soy Azul")
            } else {
                button.setBackgroundColor(Color.parseColor("#FF0000"))
                button.setText("Soy Rojo")
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.sunflower_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.inventario -> {
                abrirInventario()
                true
            }
            R.id.ayuda -> {
                mostrarAyuda()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun changeActivity(view: View) {

        val editText = findViewById<EditText>(R.id.campo_de_texto)
        val mensaje = editText.text.toString()
        val intent = Intent(this, ActividadDos::class.java).apply {
            putExtra(TEXTO, mensaje)
        }
        startActivity(intent)
    }

    fun verInventario(view: View) {
        val intent = Intent(this, ActividadInventario::class.java).apply { }
        startActivity(intent)
    }

    fun abrirInventario() {
        val intent = Intent(this, ActividadInventario::class.java).apply { }
        startActivity(intent)
    }

    fun mostrarAyuda() {

    }
}