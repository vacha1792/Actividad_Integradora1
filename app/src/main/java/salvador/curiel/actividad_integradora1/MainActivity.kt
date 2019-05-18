package salvador.curiel.actividad_integradora1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.time.Duration

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener {
            val user :String = textUsuario.text.trim().toString()
            val pass :String = textPass.text.trim().toString()

            if(user.equals("Erik") && pass.equals("1234")){
                toast(
                    "Datos Correctos!", Toast.LENGTH_LONG
                )
                val intent = Intent(applicationContext, Inicio::class.java)
                intent.putExtra("usuario", textUsuario.text.trim().toString())
                startActivity(intent)

            } else{
                toast(
                    "Datos Incorrectos!!", Toast.LENGTH_LONG
                )
            }
        }
    }

    fun toast(mensaje: String, duration: Int = Toast.LENGTH_LONG){
        Toast.makeText(this, mensaje, duration).show()
    }
}
