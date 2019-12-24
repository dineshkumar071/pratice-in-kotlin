class rectangle
{
    var length:Int=0
    var breadth:Int=0
    fun area():Int
    {
       return length * breadth
    }
}
fun main(args:Array<String>)
{
    fun rectangle.perimeter():Int
    {
        return(2*(length+breadth))
    }
    var ob=rectangle()
    ob.length=3
    ob.breadth=2
    println(ob.area())
    println(ob.perimeter())
}
