package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        Integer i = Integer.valueOf(str);
        System.out.println("i = " + i);

        int intValue = i;
        System.out.println("intValue = " + intValue);

        Integer i1 = intValue;
        System.out.println("i1 = " + i1);
    }
}
