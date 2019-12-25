class employees
{
    var Name:String?=""
    var Age:Int=0
    var Gender:String?
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
        var empgender: String? = readLine()
        print("enter the employee height:")
        var empheight:Int=Integer.valueOf(readLine())
        print("enter the employee weight:")
        var empweight:Int=Integer.valueOf(readLine())
        print("enter that he/she is in employee(or)intern:")
        var empop:String?= readLine()
        v.add(employees(empnam,empage,empgender,empweight,empheight,empop))
    }
    print("how many choice do you want to test?")
    var test1:Int=Integer.valueOf(readLine())
    for(j in 0..test1-1)
    {
        print("enter the number between 1 <= num <= 7")
        var choice: Int = Integer.valueOf(readLine())
        when (choice) {
            1 -> {
                v.sortBy { it.Name }
                for (i in v) {
                    println(i.Name + " " + i.Age + " " + i.Gender + " " + i.weight + " " + i.Height + " " + i.Option)

                }
            }
            2 -> {
                v.sortBy { it.Age }
                for (i in v) {
                    println(i.Name + " " + i.Age + " " + i.Gender + " " + i.weight + " " + i.Height + " " + i.Option)

                }
            }
            3 ->{
                v.sortBy { it.Gender }
                for (i in v) {
                    println(i.Name + " " + i.Age + " " + i.Gender + " " + i.weight + " " + i.Height + " " + i.Option)

                }
            }
            4 -> {
                v.sortByDescending { it.weight }
                for (i in v) {
                    println(i.Name + " " + i.Age + " " + i.Gender + " " + i.weight + " " + i.Height + " " + i.Option)

                }
            }
            5 -> {
                v.sortBy { it.Height }
                for (i in v) {
                    println(i.Name + " " + i.Age + " " + i.Gender + " " + i.weight + " " + i.Height + " " + i.Option)

                }
            }
            6->{
               //var x= v.filter { it.Option=="intern" }
                for (i in v) {
                    if(i.Option=="intern") {
                        println(i.Name + " " + i.Age + " " + i.Gender + " " + i.weight + " " + i.Height + " " + i.Option)
                    }
                }
            }
            7->{
                for (i in v) {
                    if(i.Option=="employee") {
                        println(i.Name + " " + i.Age + " " + i.Gender + " " + i.weight + " " + i.Height + " " + i.Option)
                    }
                }
            }
        }
    }
}
