package sorts;

import java.util.Arrays;

public class Bubble {


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

    public static void newBubbleSort(int[] arr) {

        int in, out, j, swap;

        for (out = arr.length - 1; out > 0; --out) {
            for (in = 0, j = out; in < out; ++in, j--) {
                if (arr[in] > arr[in + 1]) {
                    swap = arr[in];
                    arr[in] = arr[in + 1];
                    arr[in + 1] = swap;
                } else if (arr[j] < arr[j - 1]) {
                    int swap2 = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = swap2;
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

        double newStartTime = System.currentTimeMillis();
        newBubbleSort(arr);
        double newEndTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(arr));
        double newDuration = (newEndTime - newStartTime);
        System.out.println("Updated buble sort: " + newDuration);

    }
}
