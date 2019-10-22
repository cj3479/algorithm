import java.util.*
import kotlin.math.max

//https://vjudge.net/contest/334776#problem/A
fun main(args: Array<String>) {
//    var tests = ArrayList<Int>()
//    var tests = IntArray((1 shl 29)){1}
////    for (i in 0 until (1 shl 27)){
////        tests.add(i)
////    }
////    println(tests.size)
//    println(System.currentTimeMillis())
////    tests.removeAt((tests.size-1))
//    var index = tests.size-1
//    var numMoved = tests.size - index - 1
//    if (numMoved > 0)
//        System.arraycopy(
//            tests, index + 1, tests, index,
//            numMoved
//        )
//    println(System.currentTimeMillis())
////    tests.removeAt(10)
//    index = 0
//    numMoved = tests.size - index - 1
//    if (numMoved > 0)
//        System.arraycopy(
//            tests, index + 1, tests, index,
//            numMoved
//        )
//    println(System.currentTimeMillis())
//    var max: Int = (1 shl 31) - 1;
//    println(max)
//    println(max + 1)
//    println(max + 2)
//    println((max + 3)-100)
//    println(max*10)
//    println((1 shl 33))
//    println((-1 shl 33))
////    println(Int.to)
//    var tests = IntArray(5) { 1 }
//    tests.get(0)
//    var tests1: Int? = 0;
//    tests1 = tests.size * 100000
//    println(tests1)
//    println(tests.size * 200000)
//    print(System.currentTimeMillis())
    var scanner = Scanner(System.`in`)
    var nums = scanner.nextInt()
//    var data = IntArray(nums)
    val data = Array(nums) { IntArray(2) }
    for (i in 0 until nums) {
        data[i][0] = scanner.nextInt()
        data[i][1] = i + 1
    }
    printShooting(data)
}

fun printShooting(args: Array<IntArray>) {
    var sumMin = 0
    var sb = StringBuffer()
    for (i in 0 until args.size) {
        for (m in args.size - 1 downTo i) {
            if (m > 0 && args[m][0] > args[m - 1][0]) {
                var temp = args[m][0]
                args[m][0] = args[m - 1][0]
                args[m - 1][0] = temp
                var temp1 = args[m][1]
                args[m][1] = args[m - 1][1]
                args[m - 1][1] = temp1
            }
        }
        sumMin += args[i][0] * i + 1
        sb.append(args[i][1]).append(" ")
    }
    println(sumMin)
    println(sb)
//    for (i in args) {
//        print("$i ")
//    }

}