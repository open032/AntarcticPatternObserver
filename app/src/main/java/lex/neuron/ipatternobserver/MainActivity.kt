package lex.neuron.ipatternobserver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val camera = CameraWithNeuralNetwork()
        camera.addPenguinsAssistant(Man(name = "Черчель"))
        camera.addPenguinsAssistant(Woman(name = "Мадонна"))
        camera.addPenguinsAssistant(Dog(name = "Шарик"))

        camera.penguinFellOnHisBack()

    }
}