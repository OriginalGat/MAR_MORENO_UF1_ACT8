package com.example.actividad8uf1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.CheckBox
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lengua = findViewById<CheckBox>(R.id.checkBox)
        val quimica = findViewById<CheckBox>(R.id.checkBox3)
        val historia = findViewById<CheckBox>(R.id.checkBox5)
        val grupo = findViewById<RadioGroup>(R.id.radioGroup)
        val botonMatricular = findViewById<Button>(R.id.button)

        botonMatricular.setOnClickListener {
            val selectedMateries = StringBuilder(" ")
            if (lengua.isChecked) selectedMateries.append("Lengua, ")
            if (quimica.isChecked) selectedMateries.append("Química, ")
            if (historia.isChecked) selectedMateries.append("Historia, ")

            val selectedTornId = grupo.checkedRadioButtonId

            val selectedTorn = when (selectedTornId) {
                R.id.radioButton -> "Mañana"
                R.id.radioButton3 -> "Tarde"
                else -> "Ningún turno seleccionado"
            }
            val resultMessage = "$selectedMateries\n $selectedTorn"
            Toast.makeText(this, resultMessage, Toast.LENGTH_LONG).show()


        }
    }
}