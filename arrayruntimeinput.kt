fun main(args : Array<String>)
{
    println("enter the size")
    val num=Integer.valueOf(readLine())
    //print(num)
    var i:Int=0
    var arr=Array<Int>(num){0}
    while(i<num)
    {
        //print("1")
        arr[i]=readLine()!!.toInt()
       // print(arr[i])
        i++
    }
    for(x in 0..num-1)
    {
        println(arr[x])
    }
}
