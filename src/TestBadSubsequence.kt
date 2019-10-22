import java.util.*

//https://vjudge.net/contest/334776#problem/A
fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    var num = scanner.nextLine()
    var data = scanner.nextLine()
    printIsBad1(data)
}

fun printIsBad(input: String) {
    if (input.length % 2 != 0) {
        print("No")
        return
    }
    val stack = Stack<Char>()
    for (s in input) {
        if (s == ')') {
            if (stack.size > 0) {
                if (stack.peek() == '(') {
                    stack.pop()
                } else {
                    //连续两次")"，不成立
                    print("No")
                    return
                }
            } else {
                stack.push(s)
            }
        } else {
            stack.push(s)
        }
    }
    if (stack.empty() || (stack.size == 2 && stack[0] != stack[1])) {
        print("Yes")
    } else {
        print("No")
    }
}

fun printIsBad1(input: String) {
    if (input.length % 2 != 0) {
        print("No")
        return
    }
    var leftCount = 0
    for (s in input) {
        if (s == '(') {
            leftCount++
        } else {
            leftCount--
            if (leftCount == -2) {
                print("No")
                return
            }
        }
    }
    if (leftCount <= 1) {
        print("Yes")
    } else {
        print("No")
    }
}