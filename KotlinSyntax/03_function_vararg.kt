/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

fun sum(v1:Int, v2:Int):Int{
    return v1+v2
}
fun sum(values:List<Int>):Int{
    var result = 0
    for(item in values){
        result = result + item
    }
    return result
}
 fun sum(vararg values:Int):Int{
     var result = 0
     values.forEach{ item -> result += item}
     return result
 }

fun main() {
    println(sum(4,5))
    println(sum(listOf()))
    println(sum(1,3,6))
}