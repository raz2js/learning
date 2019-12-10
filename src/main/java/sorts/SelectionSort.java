package sorts;

import java.util.Arrays;

public class SelectionSort implements  sortAlgorithm {

    @Override
    public <T extends Comparable<T>> T[] sort(T[] arr) {
         int i, j, min;

        for (i = 0; i < arr.length - 1; i++) {
            for (j = i + 1; j < arr.length; j++) {
                min = i;
                if (SortUtils.less(arr[j], arr[min])) {
                    T swap = arr[j];
                    arr[j] = arr[min];
                    arr[min] = swap;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        Integer[] array = {123, 4, 5, 1, 22, 6, 3, 55, 1, 32, 0, 1, 5, 12, 2, 5, 7, 8, 9, 2, 44, 43, 5};
        SelectionSort selectionSort = new SelectionSort();

        String[] arr = {"z", "x", "y", "s", "b", "j"};
        selectionSort.sort(arr);
        SortUtils.print(Arrays.asList(arr));
    }


}
