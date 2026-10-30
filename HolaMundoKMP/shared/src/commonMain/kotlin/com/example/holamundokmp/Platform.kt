package com.example.holamundokmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform