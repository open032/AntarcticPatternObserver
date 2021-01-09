package lex.neuron.ipatternobserver

import android.util.Log

data class Woman(val name: String) : PenguinInDanger {
    private val TAG = "TAG"

    /**
     * woman initially in coordinates x = 500  y = 0
     */
    override fun getCoordinates(x: Int, y: Int) {
        if (x > 250)
            Log.d(TAG, "Woman Penguin need help, on his back in x = $x    y = $y")
    }
}