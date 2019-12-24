class registration(email:String?,pwd:String?,age:Int,gender:String?)
{
    var email_id:String?=email
        get()
        {
            return field!!.toLowerCase()
        }
    var password:String? =pwd
        set(value)
        {
            field=if(value!!.length>6) value else throw IllegalArgumentException("password is too small")
        }
    var age:Int=age
        set(value)
        {
            field=if(value>18) value else throw IllegalArgumentException("age is less than 18 ,here not allowed")
        }
    var gender:String? =gender
        set(value)
        {
            field=if(value =="M") value else throw IllegalArgumentException("user sould be male")
        }
}
fun main(args: Array<String>)
{
    println("enter the mail id")
    var email_id:String?=readLine()
    println("enter the password")
    var password:String?=readLine()
    println("enter the age")
    var age:Int=Integer.valueOf(readLine())
    println("enter the gender")
    var gender:String?= readLine()
    var ob=registration(email_id,password,age,gender)
    println("the email_id is: ${ob.email_id}")
    println("the age is : ${ob.age}")
    println("the password is:${ob.password}")
    println("the gender is:${ob.gender}")
}
