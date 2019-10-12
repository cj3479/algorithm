import java.util.Random
import java.util.Scanner

//https://vjudge.net/contest/325176#problem/A
object TestTennis {
    internal class Node {
        var value: Int = 0
        var next: Node? = null
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        //        if (scanner.hasNext()) {
        //            String str1 = scanner.next();
        //            System.out.println("输入的数据为：" + str1);
        //        }
        var players: IntArray? = null
        var needWinTimes = 0
        if (scanner.hasNextInt()) {
            val numOfPlayers = scanner.nextInt()
            val b = scanner.nextInt()
            players = IntArray(numOfPlayers)
            needWinTimes = b
        }
        for (i in players!!.indices) {
            if (scanner.hasNextInt()) {
                val power = scanner.nextInt()
                players[i] = power
            }
        }
        countPower(players, needWinTimes)
        //        int plays = scanner.nextInt(10);
        //        String firstLine = scanner.nextLine();
        //        String secondLine = scanner.nextLine();
        //        countPower(firstLine, secondLine);
        //        countPower("", "");
    }

    private fun countPower(players: IntArray, needWinTimes: Int) {
        //        System.out.println(firstLine + "  aa=" + secondLine);
        //        long times = Long.valueOf(firstLine.split(" ")[1]);
        //        long times = 100000000000000L;
        //        String playerStr[] = secondLine.split(" ");
        //        String playerStr[] = new String[500];
        //        for (int i = 0; i < 500; i++) {
        //            playerStr[i] = i + "";
        //            System.out.println(playerStr[i]);
        //        }
        val length = players.size
        var firstNode = Node()
        var temp = firstNode
        //        System.out.println("one");
        //        System.out.println("one tim1" + System.currentTimeMillis() / 1000);
        firstNode.value = players[0]
        for (i in 1 until length) {
            val node = Node()
            node.value = players[i]
            temp.next = node
            temp = node
        }
        var lastNode = temp
        var nextNode = firstNode.next
        var count: Long = 0
        var compareTimes: Long = 0
        while (null != nextNode && count < needWinTimes) {
            if (firstNode.value >= nextNode.value) {
                count++
                if (count >= length || compareTimes >= length) {
                    break
                }
                if (nextNode !== lastNode) {
                    lastNode.next = nextNode
                    lastNode = nextNode
                    firstNode.next = nextNode.next
                }
                compareTimes++
            } else {
                count = 0
                count++
                compareTimes++
                lastNode.next = firstNode
                lastNode = firstNode
                firstNode = nextNode
            }
            nextNode = firstNode.next
        }
        println(firstNode.value)
    }
}
