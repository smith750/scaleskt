package com.necessarysense.scales

class Key(val baseNote: NoteName) {
    private val ionian =
        sequenceOf(true, false, true, false, true, true, false, true, false, true, false, true)
    private val dorian = sequenceOf(true, false, true, true, false, true, false, true, false, true, true, false)
    private val phrygian = sequenceOf(true, true, false, true, false, true, false, true, true, false, true, false)
    private val lydian = sequenceOf(true, false, true, false, true, false, true, true, false, true, false, true)
    private val mixolydian = sequenceOf(true, false, true, false, true, true, false, true, false, true, true, false)
    private val aeolian = sequenceOf(true, false, true, true, false, true, false, true, true, false, true, false)
    private val locrian = sequenceOf(true, true, false, true, false, true, true, false, true, false, true, false)

    fun ionianOf(): Mode = Scale.scaleOf(baseNote, ionian)

    fun dorianOf(): Mode = Scale.scaleOf(baseNote, dorian)

    fun phrygianOf(): Mode = Scale.scaleOf(baseNote, phrygian)

    fun lydianOf(): Mode = Scale.scaleOf(baseNote, lydian)

    fun mixolydianOf(): Mode = Scale.scaleOf(baseNote, mixolydian)

    fun aeolianOf(): Mode = Scale.scaleOf(baseNote, aeolian)

    fun locrianOf(): Mode = Scale.scaleOf(baseNote, locrian)
}
