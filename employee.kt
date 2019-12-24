class employees
{
    var Name:String?=""
    var Age:Int=0
    var Gender:String?=""
    var weight:Int=0
    var Height:Int=0
    var Option:String?=""
    constructor(name1:String?,Age1:Int,gender1:String?,weight1:Int,height1:Int,option1:String?)
    {
        this.Name=name1
        this.Age=Age1
        this.Gender=gender1
        this.Height=height1
        this.weight=weight1
        this.Option=option1
    }
}
var v=ArrayList<employees>()
fun main(args:Array<String>)
{
    print("enter the no of records:")
    var records:Int=Integer.valueOf(readLine())
    for(i in 0..records-1)
    {
        print("enter the employee name:")
        var empnam:String?= readLine()
        print("enter the employee age:")
        var empage:Int=Integer.valueOf(readLine())
        print("enter the employee gender:")
        var empgender:String?=readLine()
        print("enter the employee height:")
        var empheight:Int=Integer.valueOf(readLine())
        print("enter the employee weight:")
        var empweight:Int=Integer.valueOf(readLine())
        print("enter that he/she is in employee(or)intern:")
        var empop:String?= readLine()
        v.add(employees(empnam,empage,empgender,empweight,empheight,empop))
    }
    v.sortBy { it.Name }
    for(i in v)
    {
        println(i.Name + " " + i.Age + " " + i.Gender + " " + i.weight + " " + i.Height+ " " + i.Option)

    }
}
