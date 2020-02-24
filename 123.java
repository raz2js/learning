package sorts;

import java.util.List;

final class SortUtils {



    static <T> boolean swap(T[] array, int idx, int idy) {
        T swap;
        swap = array[idx];
        array[idx] = array[idy];
        array[idy] = swap;
        return true;
    }

    static void print(List<?> toPrint) {
        toPrint.stream()
                .map(Object::toString)
                .map(str -> str + " ")
                .forEach(System.out::print);

        System.out.println();
    }

    static <T extends Comparable<T>> boolean less(T v, T w) {
        return v.compareTo(w) < 0;
    }
}
