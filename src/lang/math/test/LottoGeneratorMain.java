package lang.math.test;

public class LottoGeneratorMain {

    public static void main(String[] args) {
        LottoGenerator lottoGenerator = new LottoGenerator();

        int[] lottoNumbers = lottoGenerator.getLottoNumbers();

        for (int lottoNumber : lottoNumbers) {
            System.out.println("lottoNumber = " + lottoNumber);
        }
    }
}
