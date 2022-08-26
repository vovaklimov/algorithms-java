public class FibonacciNumbers {
    public static int get(int n) {
        // First three elements of the sequence are hardcoded 0, 1, 1
        switch (n) {
            case 1 -> {
                return 0;
            }
            case 2, 3 -> {
                return 1;
            }
        }

        int n0 = 1;
        int n1 = 1;
        int currentNumber = 0;

        // Produces elements of the sequence from 4 to n
        for (int i = 4; i <= n; i++) {
            currentNumber = n0 + n1;

            n0 = n1;
            n1 = currentNumber;
        }

        return currentNumber;
    }
}
