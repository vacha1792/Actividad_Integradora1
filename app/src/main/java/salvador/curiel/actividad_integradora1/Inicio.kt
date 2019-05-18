package salvador.curiel.actividad_integradora1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_inicio.*

class Inicio : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        val usuario = intent.extras.get("usuario")
        Toast.makeText(applicationContext, "Bienvenido: $usuario", Toast.LENGTH_LONG).show()

        textLeyenda.text = "Bienvenido: $usuario"

        btnCalcular.setOnClickListener {
            val altura : String = textTalla.text.trim().toString()
            val peso : String = textPeso.text.trim().toString()

            var altura2 = (altura.toFloat()*altura.toFloat())
            var calculo = (peso.toFloat() / altura2.toFloat())

            val intent = Intent(applicationContext, ResultadoIndiceMC::class.java)
            intent.putExtra("Resultado", calculo)
            startActivity(intent)
        }
    }
}
