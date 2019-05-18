package salvador.curiel.actividad_integradora1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_resultado_indice_mc.*

class ResultadoIndiceMC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_indice_mc)
        val imc = intent.extras.get("Resultado")
        text_imc.text = "Tu indice de masa corporal es de: $imc"

        


    }
}
