public object TestKTStatic {
    @get:JvmName("isName")
    var name = "dddd"
    var age = "10"
    fun testBB() {
        println("testBB")
    }

    fun testBB(a: Int) {
        if (a == 10) {
            println("testBB")
        }
        println("testBB")
    }

    @Throws(Exception::class)
    fun testCC() {
        println("testCC")
//        var aa: StringBuffer? = null
//        aa!!
//        var dddd = String(aa!!)
        var bb: StringBuffer = StringBuffer("fdff")
//        bb!!
//        var d= String(bb!!)
//        var ee= bb?.let { String(it) }
//        TestJavaCallKT.testException()
        var testJavaCallKT: TestJavaCallKT? = TestJavaCallKT.getJavaCallKT(10);
        var value1: String = testJavaCallKT?.valueStr
        var dd = TestJavaCallKT.getValueStr(value1)
        println("value1 $value1  isNul=${value1 == null}")
        var value: Int = testJavaCallKT?.value!!
        println("value $value")
    }

    fun testAA(a: String, b: Int): TestKTStatic {
        println("a=$a b=$b")
//        TestKTStatic.testCC()
//        return "fff"
        var dd = TestKTStatic.apply { }
        return dd
    }

    @JvmStatic
    fun main(args: Array<String>) {
        var aa = "testRun".run {
            println("this = ${this.length}")
            "ddddd"
            TestKTStatic.testAA(b = 10, a = "dddd")
        }
        println(aa)
        TestKTStatic.name
        testCC()
    }


}
