package sorts;

import sun.jvm.hotspot.code.BufferBlob;

import java.util.Arrays;

public class BubbleSort implements sortAlgorithm{

    @Override
    public <T extends Comparable<T>> T[] sort(T[] array) {
        for (int i = 0, size = array.length; i < size - 1; ++i) {
            boolean swapped = false;
            for (int j = 0; j < size - 1 - i; ++j) {
                swapped = SortUtils.less(array[j + 1], array[j]) && SortUtils.swap(array, j, j + 1);
            }
            if (!swapped) {
                break;
            }
        }
        return array;
    }

    public static void display(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {

        Integer[] array = {123, 4, 5, 1, 22, 6, 3, 55, 1, 32, 0, 1, 5, 12, 2, 5, 7, 8, 9, 2, 44, 43, 5};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array);
        SortUtils.print(Arrays.asList(array));

        String[] strings = {"z", "c", "a", "x", "e", "b", "d"};
        BubbleSort bubbleSortStrings = new BubbleSort();
        bubbleSortStrings.sort(strings);
        SortUtils.print(Arrays.asList(strings));

    }
}
