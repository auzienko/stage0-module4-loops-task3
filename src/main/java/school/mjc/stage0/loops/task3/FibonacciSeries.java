package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        if (lastFibonacci == 0) {
            return;
        }
        int first = -1;
        int second = 1;
        for (int i = 0; i < lastFibonacci; i++) {
            int tmp = first + second;
            first = second;
            second = tmp;
            System.out.println(second);
        }
    }
}
