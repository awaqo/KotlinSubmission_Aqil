package id.infinitelearning.KotlinSubmission.exercise4

import java.lang.Exception

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    try {
        val tes1 = "Ini inputan String"
        println(tes1)
        val tes2 = "Harusnya String".toInt()
        println(tes2)
    } catch (e: NumberFormatException) {
        println("Number format exception + $e")
    }
}
//done(?)