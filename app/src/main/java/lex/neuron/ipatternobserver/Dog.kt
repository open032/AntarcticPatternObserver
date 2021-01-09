package lex.neuron.ipatternobserver

import android.util.Log

data class Dog(val name: String) : PenguinInDanger {
    private val TAG = "TAG"

    /**
    The dog always receives a signal that the penguin is in danger.
    He cannot understand the coordinates,
    so he just runs in search of a penguin on her back
     **/
    override fun getCoordinates(x: Int, y: Int) {
        Log.d(TAG, "Шарик искать")
    }
}