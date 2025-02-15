package enumeration.ex2;

public class ClassRefMain {

    public static void main(String[] args) {
        System.out.println("class BASIC = " + ClassGrade.BASIC.getClass());
        System.out.println("class GOLD = " + ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND = " + ClassGrade.DIAMOND.getClass());

        System.out.println("Ref BASIC = " + ClassGrade.BASIC);
        System.out.println("Ref GOLD = " + ClassGrade.GOLD);
        System.out.println("Ref DIAMOND = " + ClassGrade.DIAMOND);

    }
}
