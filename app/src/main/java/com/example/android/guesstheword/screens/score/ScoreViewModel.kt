package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore:Int) : ViewModel() {
    //final score
    var score = finalScore

    init {
        Log.i("ScoreViewMode", "Final score if $finalScore")
    }

}