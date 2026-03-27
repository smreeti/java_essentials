package leetcode.geeksforgeeks;

public class FibonacciNumber_509 {

    public static void main(String[] args) {
        System.out.println(calculateFibonacci(10));
        System.out.println(calculateFibonacci_1(10));
    }

    private static int calculateFibonacci_1(int n) {
        int a = 0, b = 1;

        int next;
        for (int i = 0; i < n; i++) {
            next = a + b;
            a = b;
            b = next;
        }
        return a;
    }

    //recursion - O(2n)
    private static int calculateFibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        return calculateFibonacci(n - 1) + calculateFibonacci(n - 2);
    }
}
