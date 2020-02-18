data class Employee(val id: Int, val email: String, val name: String, val status: String, val empType: String  )

class EmployeeManager{
    val emp1 = Employee(1, "123@email.com", "Jon", "active", "contract")
    val emp2 =  Employee(2, "1rwer23@email.com", "Jan", "active", "full time")
    val emp3 =  Employee(3, "12fwfff3@email.com", "Jen", "active", "contract")
    val emp4 =  Employee(4, "test@email.com", "Jane", "not active", "full time")
    val emp5 =  Employee(5, "theemail@email.com", "James", "active", "contract")
    
    val employeeList = mutableListOf(emp1, emp2, emp3, emp4, emp5)
    
    //add employee instance to employee list
    fun addEmployee(emp: Employee){
        employeeList.add(emp)
    }
    
    //remove employee by name var.
     fun removeEmployee(id: Int){
        employeeList.removeAll{ it.id == id }
    }
    
     fun getEmpEmail(id: Int){
		employeeList.forEach { 
        	if (it.id == id){
                println(it.email)
            }
        }
      }
         
     fun getEmpStatus(id: Int){
		employeeList.forEach { 
        	if (it.id == id){
                println(it.status)
            }
        }
      }
     
     fun getEmpName(id: Int){
        employeeList.forEach { 
        	if (it.id == id){
                println(it.name)
            }
        }
     }
     
       fun getEmpType(id: Int){
        employeeList.forEach { 
        	if (it.id == id){
                println(it.empType)
            }
        }
     }
    
    fun printAll(){
            employeeList.forEach { print(it.name + " ") }
    }
}


fun main() {
    val test = EmployeeManager()
    println(test.printAll())
    
    test.getEmpEmail(1)
    test.getEmpStatus(3)
    test.getEmpName(4)
    test.getEmpType(5)
    
    test.removeEmployee(5)
    test.removeEmployee(4)
    test.removeEmployee(3)
    
    println(test.printAll())
}
