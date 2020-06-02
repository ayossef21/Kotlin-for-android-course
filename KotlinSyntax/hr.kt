/**
 * You can edit, run, and share this code. 
 * play.kotlinlang.org 
 */

class Employee{
    var name:String = ""
    var balance:Int = 0
    var days:Int = 0
}
val maxNumberOfDays = 3
fun initData(): List<Employee>{
    var emp1:Employee = Employee()
	emp1.name = "seba3y"
    emp1.balance = 20
    emp1.days = 2
    
    var emp2:Employee = Employee()
    emp2.name = "Omar"
    emp2.balance = 50
    emp2.days = 5
    
    var allEmp:List<Employee> = listOf(emp1,emp2)
    return allEmp
}

fun hrPolicy(allEmp:List<Employee>){
    for(emp in allEmp){
        if(emp.days <= maxNumberOfDays && emp.days <= emp.balance){
            emp.balance = emp.balance - emp.days
            println("${emp.name} you can enjoy your ${emp.days} leave")
        }else {
            println("Sorry ${emp.name}")
        }
    }
}
fun main() {
    var completeList: List<Employee> = initData()   
    println(completeList.get(0).balance)
    hrPolicy(completeList)
    println(completeList.get(0).balance)
    
}