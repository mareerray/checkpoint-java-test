public class ExerciseRunner {
    public static void main(String[] args) {
        Factorial iterativeFactorial = new IterativeFactorial();
        Factorial recursiveFactorial = new RecursiveFactorial();

        // Test iterative factorial
        int number1 = 5;
        long iterativeResult1 = iterativeFactorial.calculate(number1);
        System.out.println("Iterative Factorial of " + number1 + " is: " + iterativeResult1); // Expected output: 120

        // Test recursive factorial
        long recursiveResult1 = recursiveFactorial.calculate(number1);
        System.out.println("Recursive Factorial of " + number1 + " is: " + recursiveResult1); // Expected output: 120

        // Test iterative factorial
        int number2 = 1;
        long iterativeResult2 = iterativeFactorial.calculate(number2);
        System.out.println("Iterative Factorial of " + number2 + " is: " + iterativeResult2); // Expected output: 1

        // Test recursive factorial
        long recursiveResult2 = recursiveFactorial.calculate(number2);
        System.out.println("Recursive Factorial of " + number2 + " is: " + recursiveResult2); // Expected output: 1

        // Test iterative factorial
        int number3 = 0;
        long iterativeResult3 = iterativeFactorial.calculate(number3);
        System.out.println("Iterative Factorial of " + number3 + " is: " + iterativeResult3); // Expected output: 1

        // Test recursive factorial
        long recursiveResult3 = recursiveFactorial.calculate(number3);
        System.out.println("Recursive Factorial of " + number3 + " is: " + recursiveResult3); // Expected output: 1

        // Test iterative factorial
        int number4 = 10;
        long iterativeResult4 = iterativeFactorial.calculate(number4);
        System.out.println("Iterative Factorial of " + number4 + " is: " + iterativeResult4); // Expected output: 3628800

        // Test recursive factorial
        long recursiveResult4 = recursiveFactorial.calculate(number4);
        System.out.println("Recursive Factorial of " + number4 + " is: " + recursiveResult4); // Expected output: 3628800
    }
}