import java.util.*
import kotlin.math.max

//https://leetcode-cn.com/problems/house-robber/comments/
fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    var num = scanner.nextInt()
    var datas = IntArray(num)
    for (i in 0 until num) {
        datas[i] = scanner.nextInt()
    }
    rob(datas)
}

fun rob(nums: IntArray): Int {
    var previousMax = 0;
    var pPreviousMax = 0
    var curMax = 0
    for (i in nums) {
        curMax = max(previousMax, pPreviousMax + i)
        pPreviousMax = previousMax
        previousMax = curMax
    }
    return curMax
}

