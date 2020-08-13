import java.util.concurrent.TimeUnit;

public class TestVolatile extends TestVS {
    private int a = 110;
//    protected int b = 22;
    private TestKotlinA bb = new TestKotlinA();
    TestVolatile() {
        super();
//        init();
//        init();
        System.out.println("TestVolatile this="+this);
    }

    @Override
    public void init() {
        a = 20;
        bb = new TestKotlinA();
        b = 25;
    }

    private static boolean stop = false;
//    public static void testBB(){
//        System.out.println("testBB");
//    }
//    public static void testCC(){
//        System.out.println("testCC");
//    }

    public void testAA() {
        new Thread() {
            @Override
            public void run() {
                System.out.println("3333 this=" + TestVolatile.this);
            }
        }.start();
    }

    public static void main(String[] args) throws Exception {
        TestKTStatic dd = TestKTStatic.INSTANCE;
        System.out.println(new TestVolatile().a);
        System.out.println(new TestVolatile().b);
        TestKTStatic.INSTANCE.testBB();
        TestKTStatic.INSTANCE.testCC();
//        new TestVolatile().testAA();
        new Thread() {
            @Override
            public void run() {
                System.out.println("000000 ");
            }
        }.start();
        new Thread() {
            @Override
            public void run() {
                System.out.println("11111");
            }
        }.start();
        Thread t = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                int a = 0;
                String sa = null;
                while (!stop) {
                }
            }
        });
        t.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Stop Thread");
        stop = true;
    }
}