package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV2Self {

    public void hello(Process process) {
        System.out.println("프로그램 시작");

        //코드 조각 시작
        process.run();
        //코드 조각 종료

        System.out.println("프로그램 종료");
    }

    class Dice implements Process {

        @Override
        public void run() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        }
    }

    class Sum implements Process {

        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        Ex1RefMainV2Self ex1RefMainV2 = new Ex1RefMainV2Self();
        Dice dice = ex1RefMainV2.new Dice();
        Sum sum = ex1RefMainV2.new Sum();
        ex1RefMainV2.hello(dice);
        ex1RefMainV2.hello(sum);
    }
}
