package com.seungdols.kotest

class Calculator() {
    fun add(a: Int, b: Int) = a + b
    fun minus(a: Int, b: Int): Int {
        if (a < 0 || b < 0) {
            throw IllegalArgumentException()
        }
        return a - b
    }
}