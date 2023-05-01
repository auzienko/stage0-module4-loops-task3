package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum = 0;
        int temp = 1;
        for (int i = 0; i < lengthOfLastNumber; i++) {
            temp *= 10;
            sum += temp - 1;
        }
        System.out.println(sum);
    }
}
