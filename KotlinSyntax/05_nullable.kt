 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */



fun search(names:List<String>, name:String):String?{
    for(currentName in names){
        if(currentName == name){
            return name
        }
    }
    return null
}

fun printlnLength(value:String){
    println(value.length)
}

fun main() {

    val list = listOf("a","b","v","g")
    val searchValue = "v"
    
    
    val result:String? = search(list, searchValue) 
    if(result == null){
        println("We have an error")
    }else {
			printlnLength(result!!)        
    }

    // another solution
    val result2:String = search(list, searchValue) ?: ""
    println(result2)
    
}