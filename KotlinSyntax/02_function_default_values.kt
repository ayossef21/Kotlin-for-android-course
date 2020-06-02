/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun printlnList(list:List<String>, start:String = "print starts here", end:String = "print ends here"){
    println("== $start ==")
    list.forEach{item -> println(item)}
    println("== $end ==")
}

fun main() {
    val names:List<String> = listOf("omar","seba3y","fat7y","sameh")
    val start:String = "100 Wesh"
    val end:String = "Directed by Robert B."
    printlnList(names)
    printlnList(names, start, "Directed by Nagla2 :')")
    
}