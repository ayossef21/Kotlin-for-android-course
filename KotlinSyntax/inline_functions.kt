fun main() {
 //Inline function
    val sum = {v1:Int, v2:Int -> v1+v2}
    val sub = {v1:Int, v2:Int -> v1-v2}
    val multiply = {v1:Int, v2:Int -> v1 * v2}
    val divide = {v1:Int, v2:Int -> 
        if(v2 == 0){
            println("Error")
            0
        }else {
            v1/v2
        }
    }
    println(sum(5,50))
    println(sum(5,2))
    println(divide(4,2))
}