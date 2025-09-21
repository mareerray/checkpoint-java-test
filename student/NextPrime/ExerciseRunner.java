public class ExerciseRunner {
    public static void main(String[] args) {
        System.out.println(NextPrime.nextPrime(3)); // 5
        System.out.println(NextPrime.nextPrime(5)); // 7
        System.out.println(NextPrime.nextPrime(4)); // 5
        System.out.println(NextPrime.nextPrime(8)); // 11
        System.out.println(NextPrime.nextPrime(0)); // 2
        System.out.println(NextPrime.nextPrime(1)); // 2
        System.out.println(NextPrime.nextPrime(29)); // 31
        System.out.println(NextPrime.nextPrime(-5)); // 2
    }
}