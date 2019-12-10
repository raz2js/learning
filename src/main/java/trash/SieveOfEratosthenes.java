package trash;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        findPrime(1000);
    }

    public static void findPrime(int n) {
        boolean[] arr = new boolean[n];
        for (int i = 2; i < arr.length; i++) {
            if (!arr[i]) {
                for (int j = 2 * i; j < arr.length; j += i) {
                    arr[j] = true;
                }
            }
        }

        System.out.println("Prime number below" + '\n');

        for (int i = 2; i < arr.length; i++) {
            if (!arr[i]) {
                System.out.println(i + " is prime");
            }
        }

        System.out.println('\n' + "Not prime number below" + '\n');

        for (int i = 2; i < arr.length; i++) {
            if (arr[i]) {
                System.out.println(i + " is not prime");
                }
            }
        }
}
