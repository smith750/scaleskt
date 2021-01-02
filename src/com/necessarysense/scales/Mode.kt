package com.necessarysense.scales

class Mode(val baseNote: NoteName, private val notes: Sequence<NoteName>) {
    @Override
    fun mkString(): String {
        return Scale.represent(notes)
    }

    fun chord(chordName: ChordName, chordType: ChordType = ChordType.FIFTH): Chord {
        val includedNotes = chordType.includedNotes.map { it + chordName.offset }.map { if (it >= 7) it - 7 else it }
        val chordNotes = notes.zip((0..7).asSequence()).repeat().dropWhile { it.second < chordName.offset }
            .filter { includedNotes.contains(it.second) }.take(chordType.noteCount()).map { it.first }
        return Chord(chordNotes, chordName)
    }
}
