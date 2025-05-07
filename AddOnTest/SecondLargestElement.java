package AddOnTest;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, 30, 80};

        if (arr.length < 2) {
            System.out.println("Array must have at least two elements.");
            return;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest element found (all elements may be equal).");
        } else {
            System.out.println("Second largest element = " + second);
        }
    }
}
