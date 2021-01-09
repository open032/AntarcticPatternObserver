package lex.neuron.ipatternobserver

import android.util.Log

data class Man(val name: String) : PenguinInDanger {
    private val TAG = "TAG"

    /**
     * man initially in coordinates x = 0   y = 0
     */
    override fun getCoordinates(x: Int, y: Int) {
        if (x <= 250){
            Log.d(TAG, "Hey Man! Penguin on his back in x = $x    y = $y")
        }
    }
}