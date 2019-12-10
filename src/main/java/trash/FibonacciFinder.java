package trash;

public class FibonacciFinder {

    static long findFibonacci(long n) {
        return n <= 1 ? n : findFibonacci(n-1) + findFibonacci(n-2);
    }

    static long findFibo(long n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return findFibo(n - 1) + findFibo(n - 2);
        }
    }

    public static void main (String[] args){
        System.out.println(findFibonacci(12));
        System.out.print(findFibo(13));
    }
}
