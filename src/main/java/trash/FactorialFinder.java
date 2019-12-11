package trash;

public class FactorialFinder {

    public static int findFactorial(int n) {
        return n <= 2 ? n : n * findFactorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.print(findFactorial(10));
    }

}
