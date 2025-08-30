
public class c8_SumOfTwoPrimes {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    // Function to check if number can be expressed as sum of two primes
    public static boolean canBeSumOfTwoPrimes(int n) {
        for (int i = 2; i <= n / 2; i++) {
            int complement = n - i;
            if (isPrime(i) && isPrime(complement)) {
                System.out.println(n + " = " + i + " + " + complement);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 20;

        if (canBeSumOfTwoPrimes(n)) {
            System.out.println("True. It can be expressed as sum of two primes.");
        } else {
            System.out.println("False. It cannot be expressed as sum of two primes.");
        }
    }
}
