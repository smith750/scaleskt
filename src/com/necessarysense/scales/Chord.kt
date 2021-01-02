package com.necessarysense.scales

class Chord(val notes: Sequence<NoteName>, val chordName: ChordName) {
    fun spell(): String = Scale.represent(notes)
    fun chordKeyName(): String = "Not yet implemted"
}
