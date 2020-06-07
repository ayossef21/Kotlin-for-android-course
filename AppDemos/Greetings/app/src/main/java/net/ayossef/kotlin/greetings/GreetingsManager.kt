package net.ayossef.kotlin.greetings

class GreetingsManager {
    val list = listOf("Hi","Hello","Welcome","Thanks")
    var currentIndex = -1

    fun nextGreeting():String{
        currentIndex += 1
        if(currentIndex == list.size){
            currentIndex = 0
        }
        return list[currentIndex]
    }
}