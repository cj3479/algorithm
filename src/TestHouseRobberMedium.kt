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
    robMedium(datas)
}

fun robMedium(nums: IntArray): Int {
    var previousMax0 = 0;
    var pPreviousMax0 = 0
    var curMax0 = 0
    var previousMax1 = 0;
    var pPreviousMax1 = 0
    var curMax1 = 0
    var length = nums.size
    if (length == 1) {
        return nums[0]
    }
    for (i in 0 until length) {
        if (i < length - 1) {
            curMax0 = max(previousMax0, pPreviousMax0 + nums[i])
            pPreviousMax0 = previousMax0
            previousMax0 = curMax0
        }
        if (i > 0) {
            curMax1 = max(previousMax1, pPreviousMax1 + nums[i])
            pPreviousMax1 = previousMax1
            previousMax1 = curMax1
        }
    }
    return max(curMax0, curMax1)
}

