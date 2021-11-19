package com.circleci.bazelsample

class Greeter(val who: String) {

    fun greet(): String{
        return "Test: Hello, ${who}!"
    }
}