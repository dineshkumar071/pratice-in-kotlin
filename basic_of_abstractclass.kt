abstract class employee(val name: String ,val experience: Int)
{
    abstract var salary :Double
    abstract fun dob(date:String)
    fun employeedetails()
    {
        println(name)
        println(experience)
        println(salary)
    }
}
class engineer(name:String ,experience:Int):employee(name,experience)
{
    override var salary =50000.00
    override fun dob(date:String)
    {
        println(date)
    }
}
fun main(args: Array<String>)
{
    val ob=engineer("shree",2)
    ob.employeedetails()
    ob.dob("9/5/1999")
}
