package com.example.countermvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    //hide mutable state
    private val _count = mutableStateOf(0)

    //expose mutable state
    val count: MutableState<Int> = _count

    fun increment() {
        _count.value += 1
    }

    fun decrement() {
        _count.value -= 1
    }
}