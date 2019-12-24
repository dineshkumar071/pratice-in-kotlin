class clg
{
    var clgname:String?=""
    inner class dept
    {
        var deptname:String?=""
        var task:String?=""
        fun insert(daptname :String?,task1 : String?)
        {
            deptname=daptname
            task=task1
        }
        fun display()
        {
            println(deptname)
            println(task)
        }
    }
    fun insert(clname:String?)
    {
        clgname=clname
    }
    fun display()
    {
        println(clgname)
    }
}
fun main(args :Array<String>)
{
    var ob1=clg()
    var ob2=clg().dept()
    println("enter the college name")
    var clgname:String?=readLine()
    println("enter the the department name")
    var deptname:String?=readLine()
    println("enter the task")
    var task:String?=readLine()
    /*ob1.insert(clgname)
    ob1.display()
    ob2.insert(deptname,task)
    ob2.display()*/
    clg().dept().insert("cse","pratical")
    clg().dept().display()
}


