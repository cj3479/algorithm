public abstract class TestVS {
    //    private int a = 10;
    protected int b = 20;

    public TestVS() {
        b = 30;
        init();
        System.out.println("TestVS this=" + this);
    }

    public abstract void init();
}
