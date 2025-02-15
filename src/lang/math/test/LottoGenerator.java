package lang.math.test;

import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;

    LottoGenerator(){
        count = 0;
        lottoNumbers = new int[6];

        while(count<6) {
            int flag = 0;
            int num = random.nextInt(45) + 1;

            if (isUnique(num)) {
                lottoNumbers[count] = num;
                count++;
            }
        }
    }

    private boolean isUnique(int number){
        for (int i = 0; i < count; i++) {
            if (lottoNumbers[i] == number) {
                return false;
            }
        }
        return true;
    }
    public int[] getLottoNumbers() {
        return lottoNumbers;
    }

    public int getCount() {
        return count;
    }
}
