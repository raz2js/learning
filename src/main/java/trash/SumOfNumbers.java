package trash;

public class SumOfNumbers {

    static int sum = 0;

    public static int findSumOfNumbers(int number) {
        sum = sum + (number % 10);
        return number == 0 ? sum : findSumOfNumbers(number / 10);
    }

    public static void main(String[] args) {
        System.out.print(findSumOfNumbers(12131232));
    }
}
