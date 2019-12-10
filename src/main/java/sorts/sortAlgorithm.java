package sorts;

public interface sortAlgorithm {

    <T extends Comparable<T>> T[] sort(T[] unsorted);

}
