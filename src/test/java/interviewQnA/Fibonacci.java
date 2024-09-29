package interviewQnA;

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
public class Fibonacci {

    public static void main(String[] args) {

        // Method 1
        int n = 10;
        int f1 = 1, f2 = 0, f3 = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(f3 + "\t");
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }

        // Method 2
        System.out.println();
        for (int i = 0; i < n; i++)
            System.out.printf("%d\t", fibonacci(i));

    }

    public static int fibonacci(int x) {
        if (x == 0)
            return 0;
        else if (x == 1)
            return 1;
        else
            return (fibonacci(x - 1) + fibonacci(x - 2));
    }

}
