package com.necessarysense.scales

fun <T> Sequence<T>.repeat() = sequence { while (true) yieldAll(this@repeat) }
