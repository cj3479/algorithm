import java.lang.Thread.sleep
import java.util.concurrent.atomic.AtomicReference

class TestSpinLock {
    var sign = AtomicReference<Thread>()
    fun lock() {
        while (!sign.compareAndSet(null, Thread.currentThread())) {

        }
    }

    fun unlock() {
        sign.compareAndSet(null, Thread.currentThread())
    }

}

fun main(args: Array<String>) {
    println(Runtime.getRuntime().availableProcessors());
    var spinLock = TestSpinLock()
    var thread2 = Thread() {
        run {
            synchronized(spinLock){
//                spinLock.lock()
                println("thread2")
//                spinLock.unlock()
            }
        }
    }
    var thread1 = Thread() {
        run {
            synchronized(spinLock){
//                spinLock.lock()
                println("thread1")
                Thread.sleep(5000)
                println("thread2.status=${thread2.state}")
                Thread.sleep(1000)
                println("thread2.status${thread2.state}")
//                spinLock.unlock()
            }
        }
    }
//    thread1.start()
//    thread2.start()
    for(i in 0..16){
        var thread = Thread() {
            run {
//                var m:Long=0
                println("thread start...time${System.currentTimeMillis()}")
//                sleep(1000)
//                Thread.sleep(15000)
                while (true){
//                    for (i in 0..10000000000){
//                        m+=i
//                    }
                }
//                println("thread end...")
            }
        }
        thread.priority = Thread.MIN_PRIORITY
        thread.start()
    }
//    Thread.sleep(2000)
    println("thread1 hhhhh....time${System.currentTimeMillis()}")
//    var thread = Thread() {
//        run {
//            var m=0;
//            var time1 = System.currentTimeMillis()
//            println("thread1 start....time$time1")
////            Thread.sleep(1000)
//            for (i in 0..2000000000){
//                m+=i
//            }
//            println("thread1 end......duration = ${System.currentTimeMillis()-time1}")
//        }
//    }
//    thread.start()

}