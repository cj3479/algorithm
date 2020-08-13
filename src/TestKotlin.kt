fun String.testExtendFF(aa: String): Int {
    println("String.testExtendFF 222222")
    return 11
}
fun main(args: Array<String>) {
    val a = Array(10) { IntArray(4) }
    var testKotlinA = TestKotlinA()
    if(testKotlinA.aaa==null){
        testKotlinA.aaa="dddd"
    }
    testKotlinA.aaa.length
    testKotlinA.setDeskTop(object: TestKotlinA.DeskTopA(){
        override fun showName() {
        }
    })
}
//fun main(args: Array<String>) {
//    val a = Array(10) { IntArray(4) }
//    println("TestKotlin length = " + a[0].size)
//    val site = object {
//        var name: String = "菜鸟教程"
//        var url: String = "www.runoob.com"
//    }
//    println(site.name)
//    println(site.url)
//    var data1 = DataProviderManager
//    var data2 = DataProviderManager
//    data1.name = "test"
//    print("data1 name = $data2.name")
//    //        Pair<Integer,Integer> saa = new Pair<>(10,10);
//    //        ArrayList<Integer> dd = new ArrayList<>(1000);
//    ////        int a = 10<<2;
//    //        int b = (a == 10) ? a : 111;
//    //        Stack ss = new Stack();
//    //        int n = 10;
//    //        for (int i = n; i > 0; i++) {
//    //
//    //        }
//}
public const val MAX_TASK_SIZE = 2
val MAX_TASK_SIZE_BB = 2
class TestKotlinA() {
    public  val MAX_TASK_SIZE_AA = 2
    var aaa:String="fff"
    var bb = 100
    fun testBB() {
        println("testBB $MAX_TASK_SIZE")
        println("testBB $MAX_TASK_SIZE_BB ${TestKTStatic.name}")
        var aaaa = TestKTStatic.name
        var age = TestKTStatic.age

    }
    fun setDeskTop(deskTop:DeskTopA){

    }
    object DeskTop{
        var url = "www.runoob.com"
        var name = "www.runoob.com"
        fun showName(){
            print{"desk legs $name"} // 错误，不能访问到外部类的方法和变量
        }
    }
    open class DeskTopA{
        var url = "www.runoob.com"
        var name = "www.runoob.com"
        open fun showName(){
            print{"desk legs $name"} // 错误，不能访问到外部类的方法和变量
        }
    }
    companion object {
        @JvmField
        var aa = 100
        var bb = 100
        fun String.testExtendB(aa: String): Int {
            println("String.testExtendBBBBB 222222")
            return 11
        }
        fun testStaticCC() {
            println("testStaticCC")
        }

        @JvmStatic
        fun testEE() {
            println("testEE")
        }
    }
    fun String.testExtendAA(aa: String): Int {
        println("String.testExtend 222222")
        return 11
    }


    fun testQQ(aa: String): Int {
        var dd="ddd"
        dd.testExtendAA("fff");
        println("testFF")
        return 11
    }
//    @JvmStatic
//    fun testDD(){
//        println("testDD")
//    }
//    @JvmStatic
//    fun testEE(){
//        println("testEE")
//    }
}

object TestKotlin {
    private const val MAX_TASK_SIZE_AAA = 2
    val MAX_TASK_SIZE_BB_CC = 2
    var ss =10;
    fun TestKotlin.testExtend(aa: String?): Int {
        aa?.length
        TestKotlinA.testStaticCC()
        TestKotlinA.testEE()
        TestKotlinA.aa
        return 11
    }

     fun String.testExtend(aa: String): Int {
        println("String.testExtend $aa")
        return 11
    }

    fun testFF(aa: String?): Int {
        aa!!.length
        aa?.length
        var dd="ddd"
        dd.testExtend("fff");
        println("testFF")
        return 11
    }

    @JvmStatic
    fun mainww(args: Array<String>) {
        val a = Array(10) { IntArray(4) }
        println("TestKotlin length = " + a[0].size)
        val site = object {
            var name: String = "菜鸟教程"
            var url: String = "www.runoob.com"
        }
        println(site.name)
        println(site.url)
        var data1 = DataProviderManager
        var data2 = DataProviderManager
        data1.name = "test"
        print("data1 name = $data2.name")
        //        Pair<Integer,Integer> saa = new Pair<>(10,10);
        //        ArrayList<Integer> dd = new ArrayList<>(1000);
        ////        int a = 10<<2;
        //        int b = (a == 10) ? a : 111;
        //        Stack ss = new Stack();
        //        int n = 10;
        //        for (int i = n; i > 0; i++) {
        //
        //        }
    }

    fun main(args: Array<String>) {
        val a = Array(10) { IntArray(4) }
        var testKotlinA = TestKotlinA()
        testKotlinA.aaa.length
        testKotlinA.setDeskTop(object: TestKotlinA.DeskTopA(){
            override fun showName() {
            }
        })
    }
}
object DataProviderManager {
    var name: String = "菜鸟教程"
    fun registerDataProvider() {
    }
}