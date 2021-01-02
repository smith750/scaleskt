package com.necessarysense.scales

enum class NoteName(val sharpRepresentation: String, val flatRepresentation: String) {
    // sharp: \u266F
    // flat: \u266D
    C("C", "C"),
    C_SHARP_D_FLAT("C♯", "D♭"),
    D("D", "D"),
    D_SHARP_E_FLAT("D♯", "E♭"),
    E("E", "E"),
    F("F", "F"),
    F_SHARP_G_FLAT("F♯", "G♭"),
    G("G", "G"),
    G_SHARP_A_FLAT("G♯", "A♭"),
    A("A", "A"),
    A_SHARP_B_FLAT("A♯", "B♭"),
    B("B", "B")
}
