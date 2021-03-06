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
    outPutComplexMinCoins(chips)
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

fun outPutComplexMinCoins(chips: IntArray) {
//    var oddNum = 0
//    var evenNum = 0
    var curRepeatTimes = 0
//    var curNeedCoins = 0
    var preNeedCoins = 0
//    var nextRepeatTimes = 0
    var previousRepeatTimes = 0
    var minCoins = -1
    var curChip = chips[0]
    var preChip = chips[0]
//    var hasSetPreviousRepeatTimes = false
//    var firstElmentRepeatTimes = 0
    for (i in 0 until chips.size) {
        println("chips[i]=${chips[i]}, curChip=$curChip preChip=$preChip")
        if (curChip - preChip == 1) {
            preNeedCoins++
        }
        when {
            (chips[i] - curChip == 0) -> {
                curRepeatTimes++
            }
//            (chips[i] - curChip == 1) -> {
//                preChip = curChip
//                curChip = chips[i]
//                previousRepeatTimes = curRepeatTimes
//                curNeedCoins++
//                preNeedCoins = curNeedCoins
////                nextRepeatTimes++
////                curRepeatTimes++
//            }
            else -> {
                //                previousRepeatTimes = curRepeatTimes
//                hasSetPreviousRepeatTimes = false
//                preNeedCoins = previousRepeatTimes
//                println("curChip=$curChip minCoins=$minCoins,curNeedCoins=$curNeedCoins")
//                minCoins = if (minCoins == -1) curNeedCoins else minCoins
//                minCoins = min(preNeedCoins, minCoins)
//                if (minCoins == 0) {
//                    println("0")
//                    return
//                }
                if (chips[i] - preChip > 1) {
                    minCoins = if (minCoins == -1) preNeedCoins else minCoins
                    println("preNeedCoins=$preNeedCoins, minCoins=$minCoins")
                    minCoins = min(preNeedCoins, minCoins)
                    if (minCoins == 0) {
                        println("0")
                        return
                    }
                    preNeedCoins = if (curChip - preChip == 1) previousRepeatTimes else 0
                }
                previousRepeatTimes = curRepeatTimes
                curRepeatTimes = 0
                curRepeatTimes++
//                curNeedCoins = 0
//                if (chips[i] - curChip == 1) {
//                    curNeedCoins = previousRepeatTimes
//                    println("previousRepeatTimes=$previousRepeatTimes curChip=$curChip")
//                }
                preChip = curChip
                curChip = chips[i]
                println("previousRepeatTimes=$previousRepeatTimes, curRepeatTimes=$curRepeatTimes")
//                preNeedCoins = curNeedCoins

//                if (minCoins == -1) {
//                    minCoins = curNeedCoins
//                }
//                curChip = chips[i]
//                if (chips[i + 1] - curChip == 1) {
//                    curNeedCoins++
//                }
            }
        }
    }
    preNeedCoins = when (curChip - preChip) {
        1 -> previousRepeatTimes
        else -> 0
    }
    minCoins = min(preNeedCoins, minCoins)
    println(minCoins)
//    for (i in chips) {
////        if (i % 2 == 0) {
////            evenNum++
////        } else {
////            oddNum++
////        }
//    }
//    if (evenNum == 0 || oddNum == 0) {
//        println("0")
//    } else {
//        println(min(evenNum, oddNum))
//    }
}