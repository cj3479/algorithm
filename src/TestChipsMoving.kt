import java.util.*
import kotlin.math.min
//https://vjudge.net/contest/325176#problem/A
fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    var chipsNum = scanner.nextInt()
//    var chips= Array<Int>(10);
//    var chips = arrayOf(3000,3000,500)
    var chips = IntArray(chipsNum)
    for (i in 0 until chipsNum) {
        chips[i] = scanner.nextInt()
    }
    outPutMinCoins(chips)
//    println(chips[0].hashCode())
//    println(chips[1].)
//    println(chips[0]===chips[1])
//    var chip1s = intArrayOf(3000, 3000, 500)
//    println(chip1s[0] === chip1s[1])
//    val a: Int? = 10000
//    val b: Int? = 10000
//    println(a === b) // true，值相等，对象地址相等
//
//    //经过了装箱，创建了两个不同的对象
//    val boxedA: Int? = chip1s[0]
////    val anotherBoxedA: Int? = a
//    val anotherBoxedA: Int? = chip1s[1]
//
//    //虽然经过了装箱，但是值是相等的，都是10000
//    println(boxedA === anotherBoxedA) //  false，值相等，对象地址不一样
//    println(boxedA == anotherBoxedA) // true，值相等
}

fun outPutMinCoins(chips: IntArray) {
    var oddNum = 0
    var evenNum = 0
    for (i in chips) {
        if (i % 2 == 0) {
            evenNum++
        } else {
            oddNum++
        }
    }
    if (evenNum == 0 || oddNum == 0) {
        println("0")
    } else {
        println(min(evenNum,oddNum))
    }
}