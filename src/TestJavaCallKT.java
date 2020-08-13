public class TestJavaCallKT {
     class MyTest  extends TestVolatile{
        public void test(){
            System.out.println("AAAAA "+TestJavaCallKT.class);
            System.out.println("AAAAA "+TestJavaCallKT.this);
        }
    }
    public static final int AA = 992;

    public static void main(String[] args) {
        TestKotlinA.Companion.testStaticCC();
        TestKotlinA.testEE();
        System.out.println(TestKotlinA.aa);
        String dd;
        try {
            TestKTStatic.INSTANCE.testCC();
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println("AAAAA");
        }
//        int aa = TestKotlin.MAX_TASK_SIZE_AAA;
//        TestKotlin.INSTANCE.testExtend("ddd","ssf");
        TestKTStatic.INSTANCE.isName();
    }

    public static void testException() throws Exception {
        throw new Exception("fffff");
    }

    public int getValue()  {
        return 1;
    }
    public String getValueStr()  {
        return "dddd";
    }
    public static int getValue(int a)  {
        return 1;
    }

    public static int getValueStr(String a)  {
        return 1;
    }


    public static TestJavaCallKT getJavaCallKT(int i) throws Exception {
        if (i > 10) {
            return new TestJavaCallKT();
        } else {
            return null;
        }
    }
}
