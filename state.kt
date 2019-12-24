fun main(args:Array<String>)
{
    println("enter the map size:")
    var siz:Int=Integer.valueOf(readLine())
    var mp= mutableMapOf<String,MutableList<String>>()
    for(i in 0..siz-1)
    {
        print("enter the state name:")
        var stname:String?=readLine()
        print("how many district under the above state:")
        var dno:Int=Integer.valueOf(readLine())
        var li= mutableListOf<String>()
        for(j in 0..dno-1)
        {
            print("enter the district name:")
            var districtname:String?= readLine()
            if (districtname != null) {
                li.add(districtname)
            }
        }
        if (stname != null) {
            mp.put(stname,li)
        }
    }
    print("enter the state name to be searched:")
    var search:String?=readLine()
    var flag=0
    //var x= mutableListOf<String>()
    for(j in mp)
    {
        if(search==j.key)
        {
            flag=1
            println(j.value)
            break
        }
        else
        {
            flag=0
        }
    }
    if(flag==0)
    {
        println("invalid state name")
    }
    for(i in mp)
    {
       println(i)
    }

}
