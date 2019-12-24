fun main(args:Array<String>)
{
    print("enter the size of list:")
    var siz:Int=Integer.valueOf(readLine())
    var li= mutableListOf<String>()
    for(i in 0..siz-1)
    {
        var ele = readLine()
        ele?.let {
            li.add(ele)
        }
    }

    var li1=li.distinct()
    println(li1)
}
