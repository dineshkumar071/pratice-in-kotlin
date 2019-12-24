fun main(args:Array<String>)
{
    println("enter the map size:")
    var siz:Int=Integer.valueOf(readLine())
    var mp= mutableMapOf<String,String>()
    for(i in 0..siz-1)
    {
        print("enter the id:")
        var data1:String?=readLine()
        print("enter the name:")
        var data2:String?=readLine()
        if (data1 != null) {
            if (data2 != null) {
                mp.put(data1,data2)
            }
        }
    }
    print("enter the id to be searched:")
    var search:String?=readLine()
    var flag=0
    var x:String=""
    for(i in mp)
    {
       if(search==i.key)
       {
           flag=1
           x=i.value
           break
       }
        else
          flag=0
    }
    if(flag==0)
        println("this id is not found!!")
    else
        println(x)
}
