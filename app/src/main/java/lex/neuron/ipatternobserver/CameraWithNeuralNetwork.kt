package lex.neuron.ipatternobserver

import android.os.Handler
import android.os.Looper
import kotlin.random.Random

class CameraWithNeuralNetwork {
    var x = 0
    var y = 0
    private var assistants: MutableList<PenguinInDanger> = ArrayList()

    fun addPenguinsAssistant(assistant: PenguinInDanger) {
        assistants.add(assistant)
    }

    fun penguinFellOnHisBack() {
        x = Random.nextInt(500)
        y = Random.nextInt(500)

        assistants.forEach {
            it.getCoordinates(x = x, y = y)
        }
        Handler(Looper.getMainLooper()).postDelayed({
            penguinFellOnHisBack()
        }, 3000)
    }
}