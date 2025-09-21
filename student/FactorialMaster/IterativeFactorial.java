public class IterativeFactorial extends Factorial {
    @Override
    public long calculate(int n) {
        // iterative factorial calculation
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i ;
        }
        return result;
    }
}