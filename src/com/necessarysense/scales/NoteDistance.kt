package com.necessarysense.scales

import java.lang.IllegalArgumentException

enum class NoteDistance(val halfstepCount: Int) {
    PERFECT_UNISON(0),
    MINOR_SECOND(1),
    MAJOR_SECOND(2),
    MINOR_THIRD(3),
    MAJOR_THIRD(4),
    PERFECT_FOURTH(5),
    AUGMENTED_FOURTH(6),
    PERFECT_FIFTH(7),
    MINOR_SIXTH(8),
    MAJOR_SIXTH(9),
    MINOR_SEVENTH(10),
    MAJOR_SEVENTH(11),
    PERFECT_OCTAVE(12);

    fun distance(halfStepCount: Int): NoteDistance = when(halfStepCount % 12) {
        0 -> PERFECT_UNISON
        1 -> MINOR_SECOND
        2 -> MAJOR_SECOND
        3 -> MINOR_THIRD
        4 -> MAJOR_THIRD
        5 -> PERFECT_FOURTH
        6 -> AUGMENTED_FOURTH
        7 -> PERFECT_FIFTH
        8 -> MINOR_SIXTH
        9 -> MAJOR_SIXTH
        10 -> MINOR_SEVENTH
        11 -> MAJOR_SEVENTH
        else -> throw IllegalArgumentException("No distance for ${halfStepCount}")
    }
}