package com.example.summerpractice22

data class Test(
    val name: String,
    var pass: String = ""
) {

}

fun sdsad() { //используется для сравнения
    val test1 = Test("test")
    test1.pass = "pass"
    val test2 = Test("test")
    test2.pass = "pass2"

    val b: Boolean = test1 == test2
}