package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";

        Integer i = Integer.valueOf(str);
        System.out.println("i = " + i);

        int intValue = i.intValue();
        System.out.println("intValue = " + intValue);

        Integer i1 = Integer.valueOf(intValue);
        System.out.println("i1 = " + i1);
    }
}
