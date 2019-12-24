fun main(args:Array<String>)
{
    println("enter the no of elements in the list")
    var elements:Int=Integer.valueOf(readLine())
    var arr=ArrayList<Int>()
    for(i in 0..elements-1)
    {
        //println("hi")
        var ele=Integer.valueOf(readLine())
        arr.add(ele)
    }
    var asc=arr.sorted()
    var des= arr.sortedDescending()
    print("ascending order is:")
    println(asc)
    print("descending order is:")
    println(des)
}
