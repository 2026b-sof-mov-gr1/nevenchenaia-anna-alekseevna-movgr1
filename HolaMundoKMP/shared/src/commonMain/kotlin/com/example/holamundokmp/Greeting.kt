package com.example.holamundokmp

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "¡Hola Mundo desde Kotlin Multiplatform! 🚀\nEstás corriendo en: ${platform.name}."
    }
}