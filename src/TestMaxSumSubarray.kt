import java.util.*
import kotlin.math.max
import kotlin.math.min

//https://leetcode-cn.com/problems/maximum-subarray/
fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    var num = scanner.nextInt()
    var datas = IntArray(num)
    for (i in 0 until num) {
        datas[i] = scanner.nextInt()
    }
    print(maxSum(datas))
}

fun maxSum(nums: IntArray): Int {
    var max = nums[0]
    var sum = 0
    var index = 0
    if(nums.size==1){
        return max
    }
    while (index < nums.size) {
        if (sum + nums[index] < nums[index]) {
            sum = nums[index]
        } else {
            sum += nums[index]
        }
        index++
        max = kotlin.math.max(sum, max)
    }
    return max
}
//        for (i in 0 until nums.size) {
//            if (sum + nums[i] < 0) {
//                if (i + 1 < nums.size) {
//                    sum = nums[i++]
//                }
//            } else {
//                sum += nums[i]
//            }
//            max = kotlin.math.max(sum, max)
//        }
//    return max
//    val f = IntArray(nums.size)
//    var max = nums[0]
//
//    for (x in 0 until  nums.size) {
//        if (x == 0 || f[x - 1] < 0) {
//            f[x] = nums[x]
//        } else {
//            f[x] = f[x - 1] + nums[x]
//        }
//
//        max = max(max, f[x])
//    }
//
//    return max
//    var fakeMaxSum = Int.MIN_VALUE
//    var previousMaxSum = 0
//    var previousValue = 0
//    var preSectionMax = 0
//    var max = Int.MIN_VALUE
//    var sumNe = 0
//    for (i in nums) {
//        if (i < 0) {
//            fakeMaxSum = max(fakeMaxSum, i)
//            sumNe = if (previousValue < 0) {
//                sumNe + i
//            } else {
//                preSectionMax = fakeMaxSum
//                i
//            }
//        } else {
//            if (previousValue < 0) {
//                previousMaxSum = 0
//            }
//            fakeMaxSum = if (preSectionMax + sumNe > 0) {
//                var temp = preSectionMax
//                preSectionMax = 0
//                previousMaxSum + i + temp + sumNe
//            } else {
//                previousMaxSum + i
//            }
//            previousMaxSum = fakeMaxSum
//        }
//        previousValue = i
//        max = max(fakeMaxSum, max)
//    }
//
//    return max
//fun maxSubArray(nums: IntArray): Int {
//    var storeMinN = -Int.MAX_VALUE;
//    var storeMaxP = 1;
//    var storeMax = 1;
//    var previousMax = 1
//    var fakeMax = 1
//    var tempMax = -Int.MAX_VALUE
//    var i = 0
//    var size = nums.size
//    while (i < size) {
////        fakeMax = if (i > 1) {
////            max(nums[i - 2] * previousMax * nums[i], max(previousMax * nums[i], nums[i]))
////        } else {
////            max(previousMax * nums[i], nums[i])
////        }
//        fakeMax = max(previousMax, max(previousMax * nums[i], nums[i]))
//        if (fakeMax == previousMax) {
//            if (tempMax < previousMax) {
//                tempMax = previousMax
//            }
//            previousMax = 1
//        }
////        fakeMax *= previousMax * nums[i]
//        if (fakeMax < previousMax && i > 0) {
//            if (tempMax < previousMax) {
//                tempMax = previousMax
//            }
//            fakeMax = if (i == size - 1) tempMax else 1
//        }
//        previousMax = fakeMax
//        i++
//    }
//    return max(fakeMax, tempMax)
//}