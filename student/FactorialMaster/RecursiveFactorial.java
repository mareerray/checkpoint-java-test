public class RecursiveFactorial extends Factorial {
    @Override
    public long calculate(int n) {
        // recursive factorial calculation
        if ( n == 0) return 1; // base case: 0! = 1
        return n * calculate(n-1); // recursive case
    }
}