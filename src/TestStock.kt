import java.util.*

//https://vjudge.net/contest/325176#problem/C
class PriorityQueue {
    var firstNode: Node? = null

    class Node(var value: Int) {
        var next: Node? = null
    }

    fun push(value: Int) {
        if (null == firstNode) {
            firstNode = Node(value)
            return
        }
        var tempCurNode = firstNode
        var previous: Node? = null
        while (null != tempCurNode) {
//            println("value=$value tempCurNode.value=${tempCurNode.value}")
            if (value < tempCurNode.value) {
                var temNode = Node(value)
                if (previous != null) {
                    previous.next = temNode
                    temNode.next = tempCurNode
//                    println("tempCurNode.value=${tempCurNode.value} previous.value=${previous.value}")
                } else {
                    temNode.next = firstNode
                    firstNode = temNode
                }
                break
            } else {
                previous = tempCurNode
                tempCurNode = tempCurNode.next
            }
        }
        if (null != previous && tempCurNode == null) {
            previous.next = Node(value)
        }
    }

    fun top(): Int {
        return firstNode!!.value
    }

    fun pop(): Int {
        var top = 0
        if (null != firstNode) {
            top = firstNode!!.value
            firstNode = firstNode!!.next
        }
        return top
    }
}

fun main(args: Array<String>) {

    var days = Scanner(System.`in`).nextInt()
    var queue = PriorityQueue()
//    if (null != queue) {
//    println(queue.firstNode?.value)
//    }
    var scanner = Scanner(System.`in`)
    var total = 0
    for (i in 0 until days) {
        if (scanner.hasNextInt()) {
            var value = scanner.nextInt()
            queue.push(value)
            queue.push(value)
            var minValue = queue.top()
//            println("minValue $minValue")
            total += value - minValue
            queue.pop()
//            println("queue.top() ${queue.top()}")
            if (queue.top() != minValue) {
                println("buy $minValue")
            }
        }
    }
    var tempCurNode = queue.firstNode
    var previous = 0;
    while (null != tempCurNode) {
        previous = if (previous == tempCurNode.value) {
            println("sell $previous")
            0
        } else {
tempCurNode.value
}
tempCurNode = tempCurNode.next
}
}
