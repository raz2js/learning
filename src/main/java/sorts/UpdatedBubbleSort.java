package sorts;

import java.util.Arrays;

public class UpdatedBubbleSort {


    public static void standartBubbleSort(int[] arr) {

        int in, out, j, swap;

        for (out = arr.length - 1; out > 0; --out) {
            for (in = 0, j = out; in < out; ++in, j--) {
                if (arr[in] > arr[in + 1]) {
                    swap = arr[in];
                    arr[in] = arr[in + 1];
                    arr[in + 1] = swap;
                }
            }
        }
    }

    public static void updatedBubbleSort(int[] arr) {

        int in, out, j, swap;

        for (out = arr.length - 1; out > 0; --out) {
            for (in = 0, j = out; in < out; ++in, --j) {
                if (arr[in] > arr[in + 1]) {
                    swap = arr[in];
                    arr[in] = arr[in + 1];
                    arr[in + 1] = swap;
                } else if (arr[j] < arr[j - 1]) {
                    swap = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = swap;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] array = new int[100000];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 1) * 1000000);
        }

        double startTime = System.currentTimeMillis();
        standartBubbleSort(array);
        double endTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(array));
        double duration = (endTime - startTime);
        System.out.println("Standart bubble sort: " + duration);


        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 1) * 1000000);
        }

        double updatedStartTime = System.currentTimeMillis();
        updatedBubbleSort(arr);
        double updatedEndTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(arr));
        double updatedDuration = (updatedEndTime - updatedStartTime);
        System.out.println("Updated bubble sort: " + updatedDuration);
        System.out.println(((duration - updatedDuration) / duration) * 100);
    }
}
