package com.necessarysense.scales

class Scale(private val notes: Sequence<NoteName>) {
    @Override
    fun mkString(): String = represent(notes)

    fun chord(chordType: ChordType): String {
        val chordNotes = notes.repeat().zip((0..16).asSequence()).filter { chordType.includedNotes.contains(it.second) }.map { it.first }
        return represent(chordNotes)
    }

    companion object {
        private val notes = sequenceOf(
            NoteName.C,
            NoteName.C_SHARP_D_FLAT,
            NoteName.D,
            NoteName.D_SHARP_E_FLAT,
            NoteName.E,
            NoteName.F,
            NoteName.F_SHARP_G_FLAT,
            NoteName.G,
            NoteName.G_SHARP_A_FLAT,
            NoteName.A,
            NoteName.A_SHARP_B_FLAT,
            NoteName.B
        )

        internal fun findNoteName(key: String): NoteName = notes.repeat().dropWhile { it.sharpRepresentation.toLowerCase() != key.toLowerCase() && it.flatRepresentation.toLowerCase() != key.toLowerCase() }.first()

        internal fun scaleOf(key: NoteName, scaleType: Sequence<Boolean>): Mode {
            return Mode(
                key,
                notes.repeat()
                    .dropWhile { it != key }
                    .zip(scaleType).filter { it.second }
                    .map { it.first }.take(8))
        }

        internal fun represent(representationNotes: Sequence<NoteName>): String {
            val representations = if (representationNotes.contains(NoteName.F_SHARP_G_FLAT)) {
                representationNotes.map { it.sharpRepresentation }
            } else {
                representationNotes.map { it.flatRepresentation }
            }
            return representations.joinToString(", ")
        }
    }
}
