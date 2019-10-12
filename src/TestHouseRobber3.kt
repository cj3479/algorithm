import java.util.*

//https://leetcode-cn.com/problems/house-robber-iii/
class TreeNode(var value: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)

    var nums = scanner.nextLine().split(" ")
    var root = TreeNode(nums[0].toInt())
    var cur: TreeNode? = root
    var preRight: TreeNode? = root
    var preLeft: TreeNode? = root
    var isLeft = true
    var i = 1

    while (i < nums.size) {
        for(index in i until i*2){
            var cur = TreeNode(nums[i-1].toInt())
            cur.left = TreeNode(nums[i].toInt())
            var right: TreeNode? = null
            i++
            if (i < nums.size) {
                right = TreeNode(nums[i].toInt())
            }
        }
        var left = TreeNode(nums[i].toInt())
        var right: TreeNode? = null
        i++
        if (i < nums.size) {
            right = TreeNode(nums[i].toInt())
        }
        cur = if (isLeft) {
            preRight = right
            preLeft
        } else {
            preLeft = left
            preRight
        }

        if (null == cur) {
            return
        }
        cur.left = left
        cur.right = right
        isLeft = !isLeft
        i++;
    }
    print(root)
}