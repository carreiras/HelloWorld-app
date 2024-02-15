package carreiras.com.github.helloworldandroid

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Definindo o conteúdo da tela
        setContentView(R.layout.activity_main)
    }
}