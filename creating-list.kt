fun main(args:Array<String>)
{
    println("enter the size")
    var sizeofarray:Int=Integer.valueOf(readLine())
    var arr=ArrayList<Int>()
    for(i in 0..sizeofarray-1)
    {
        var ele:Int=Integer.valueOf(readLine())
        arr.add(ele)
    }
    for(i in arr)
    {
        println(i)
    }
}
