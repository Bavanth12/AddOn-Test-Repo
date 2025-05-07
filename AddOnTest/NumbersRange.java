package AddOnTest;

public class NumbersRange {
    public static void main(String[] args) {
        System.out.println("Perfect numbers between 1 and 1000:");

        for (int num = 1; num <= 1000; num++) {
            int sum = 0;

            // Find divisors of Nun and sum them
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

            // Check if the number is perfect
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}

