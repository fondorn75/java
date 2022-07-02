import java.util.Arrays;

public class startSort {
    public static void main(String[] args) {
        int[] array1 = { 8, 0, -3, 5, 6, 9, 8, -4, 2, -99, 43, 15, -80 };
        int[] result = mergeSort.mergesort(array1);
        System.out.println(Arrays.toString(result));
    }
}
