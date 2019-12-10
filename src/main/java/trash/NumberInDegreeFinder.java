package trash;

public class NumberInDegreeFinder {

    public static int findNumberInDegree(int number, int degree) {
       return degree == 0 ? 1 : degree <= 1 ? number : number * findNumberInDegree(number, degree - 1);
    }

    public static void main(String[] args) {
        System.out.print(findNumberInDegree(10, 3));
    }
}
