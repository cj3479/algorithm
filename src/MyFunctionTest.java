import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyFunctionTest {
    public static void print(String s) {
        if (s == null) {
            s = "null";
        }
        System.out.print(s);
    }
    @FunctionalInterface
    public interface MyFunction {
        void print(String s);
    }
    public static void main(String[] args) {
        int aaa = TestJavaCallKT.AA;
        String text = "试试自定义函数好使不";
        printString(text, MyFunctionTest::print);
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered2 = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
    }

    private static void printString(String text, MyFunction myFunction) {
        myFunction.print(text);
    }
}
