package sorts;

import java.util.Arrays;

public class Select {


    public static void sort(int[] arr) {

        int i, j, min, swap;

        for (i = 0; i < arr.length - 1; i++) {
            for (j = i + 1; j < arr.length; j++) {
                min = i;
                if (arr[j] < arr[min]) {
                    swap = arr[min];
                    arr[min] = arr[j];
                    arr[j] = swap;
                }
            }
        }
    }
    public static void display(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] array = {-13, 323,11, 21, 1255, 12, 42};
        sort(array);
        display(array);

    }
}
