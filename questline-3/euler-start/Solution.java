public class Solution {
    public static void main(String[] args) {
        long sum1 = 0, sum2 = 0;

        // Problem 1: Sum of multiples of 3 or 5 below 1000
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum1 += i;
            }
        }

        // Problem 2: Sum of even Fibonacci numbers below 4,000,000
        long a = 1, b = 2, next;
        while (b <= 4000000) {
            if (b % 2 == 0) {
                sum2 += b;
            }
            next = a + b;
            a = b;
            b = next;
        }

        System.out.println("Problem 1: " + sum1);
        System.out.println("Problem 2: " + sum2);
    }
}
