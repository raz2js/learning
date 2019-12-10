package trash;

import static java.lang.Math.PI;

public class numberPI {

    public static String PIToTheNthDigit(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(PI);
        stringBuilder.setLength(n + 2);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(PIToTheNthDigit(10));

    }
}
