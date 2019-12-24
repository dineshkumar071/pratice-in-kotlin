fun main(args:Array<String>)
{
    print("enter the no of elements in list:")
    var ele:Int=Integer.valueOf(readLine())
    var li= mutableListOf<Int>()
    for (i in 0..ele-1)
    {
        var element:Int=Integer.valueOf(readLine())
        li.add(element)
    }
   var li1=li.distinct()
    print(li1)
}
