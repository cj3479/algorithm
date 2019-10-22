import java.util.*
import kotlin.math.min

//https://leetcode-cn.com/problems/min-cost-climbing-stairs/
fun main(args: Array<String>) {
    var strs = Scanner(System.`in`).nextLine().split(",")
    var datas = IntArray(strs.size) { strs[it].toInt() }
    minCostClimbingStairs(datas)
}

fun minCostClimbingStairs(costs: IntArray): Int {
    var ppMinCost = 0
    var pMinCost = 0
    var minCost = 0
    var minCost1 = 0
    for (index in 0 until costs.size) {
        minCost = min(pMinCost, ppMinCost) + costs[index]
        ppMinCost = pMinCost
        minCost1 = min(pMinCost,minCost)
        pMinCost = minCost
    }
    print(minCost1)
    return minCost1
}