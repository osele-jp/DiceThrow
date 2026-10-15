package edu.temple.dicethrow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DieViewModel: ViewModel() {
    private val currentRoll = MutableLiveData<Int>().apply {
        value = 0
    }

    fun setRoll(roll: Int){
        val currentRoll = roll
    }

    fun getRoll(): LiveData<Int> = currentRoll

}