package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first == second || first == 0 || second == 0) {
            System.out.println(first >= second ? first : second);
            return;
        }

        int gdc = 1;
        int min = first > second ? second : first;
        for (int i = 2; i <= min / 2; i++) {
            if (second % i == 0 && first % i == 0) {
                gdc = i;
            }
        }
        System.out.println(gdc);
    }
}
