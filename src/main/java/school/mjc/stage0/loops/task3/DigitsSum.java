package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
        int sum = 0;
        int value = t > 0 ? t : -t;
        for (int i = value; i != 0; i /= 10) {
            sum += i % 10;
        }
        System.out.println(sum);
    }
}
