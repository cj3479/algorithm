
import TestKotlin.testExtend
import java.util.*

//import TestKotlinA
fun main(args: Array<String>) {
    var ddd = TestKotlinA()
    ddd.testBB()
    var ss :String= "dsfdf"
    ss.testExtendFF("")
    ss.testExtend("fdf")
    TestKotlin.testFF("ddd");
    val sc = Scanner(System.`in`)
    val input = sc.nextInt()
//    val input = sc.next()
//    var sum = 10
//    for (i in 0..input){
//        sum+=i
//    }
//    println("$sum")
    var sum = sumF(0, input)
    println("$sum")
//    val times = getTimes(input)
//    println("$times")
}

fun sumF(init: Int, max: Int): Int {
    if (init >= max) {
        return max
    }
//    var sum+=sim
    return sumF(init + 1, max) + init
}

fun testNull(i: Int?): Int {
//    println(i.compareTo(3))
    println(i?.compareTo(3))
    println(i!!.compareTo(3))
//    if()
////    var sum+=sim
    return 1
}

fun getTimes(input: String): Int {
    val length = input.length
    var isEdge = true
    for (i in 1 until length) {
        val s = input[i]
        if (s == '1') {
            isEdge = false
        }
    }
    val poewrNum = length - 1
    val times: Int
    isEdge = isEdge and (poewrNum % 2 == 0)
    times = (if (isEdge) 0 else 1) + poewrNum / 2
    return times
}