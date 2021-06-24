package com.example.s5e6

data class Word(
    val id: String,
    var value: String,
    var audio: String,
    var video: String,
    var pic : String
){
    override fun toString(): String {
        return this.id.toString()
    }
}