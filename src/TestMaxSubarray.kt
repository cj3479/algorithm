import java.util.*
import kotlin.math.max
import kotlin.math.min

//https://leetcode-cn.com/problems/maximum-product-subarray/
fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    var num = scanner.nextInt()
    var datas = IntArray(num)
    for (i in 0 until num) {
        datas[i] = scanner.nextInt()
    }
    print(maxProduct(datas))
}
fun  maxProduct(nums: IntArray):Int {
    var max = Integer.MIN_VALUE
    var imax = 1
    var imin = 1
    for(i in 0 until nums.size){
        if(nums[i] < 0){
            var tmp = imax;
            imax = imin
            imin = tmp
        }
        imax = max(imax*nums[i], nums[i]);
        imin = min(imin*nums[i], nums[i]);

        max = max(max, imax);
    }
    return max;
}
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