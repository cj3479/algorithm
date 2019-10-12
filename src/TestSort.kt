import java.util.*

class Node(var value: Int) {
    var next: Node? = null
}

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    var num = scanner.nextInt()
    var datas = IntArray(num)
    for (i in 0 until num) {
        datas[i] = scanner.nextInt()
    }
    linkedSort(datas)
}

fun sort(nums: IntArray) {
    var size = nums.size
    for (i in 1 until size) {
        var temp = nums[i]
        for (j in (i - 1) downTo 0) {
            if (temp < nums[j]) {
//                var temp1 = nums[i]
                nums[j + 1] = nums[j]
                nums[j] = temp
            }
        }
    }
    for (i in nums) {
        print("$i,")
    }
}

fun linkedSort(nums: IntArray) {
    var currentNode = Node(nums[0])
    var firstNode = Node(nums[0])
    var tailNode: Node? = null
    var size = nums.size
    for (i in 1 until size) {
        var temp = nums[i]
        var node: Node? = firstNode
        var preNode: Node? = null
//        var tempNode = Node(nums[0])
        var match = false
        for (j in 0 until i) {
            if (null != node) {
                if (temp < node.value) {
                    var tempNode = Node(temp)
                    tempNode.next = node
//                    node.next = tempNode
                    if (null != preNode) {
                        preNode.next = tempNode
                    }
                    if (j == 0) {
                        firstNode = tempNode
                    }
                    match = true
                    break
////                var temp1 = nums[i]
//                nums[j + 1] = nums[j]
//                nums[j] = temp
                } else {
                    preNode = node
                    node = node.next
//                tailNode = Node(nums[i])
//                currentNode.next = tailNode

                }
            }

        }
        if (!match) {
            if(null!=preNode){
                preNode.next = Node(temp)
            }
        }
    }
    var node: Node? = firstNode
    while(node!=null){
        print("${node.value},")
        node = node.next
    }
}