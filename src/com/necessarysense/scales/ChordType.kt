package com.necessarysense.scales

enum class ChordType(vararg val includedNotes: Int) {
    FIFTH(0, 2, 4),
    SEVENTH(0, 2, 4, 6),
    NINTH(0, 2, 4, 6, 8),
    ADD_NINTH(0, 2, 4, 8);

    fun noteCount(): Int = includedNotes.size
}
