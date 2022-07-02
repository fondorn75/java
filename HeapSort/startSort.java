package HeapSort;

public class startSort {

    public static void main(String args[]) {

        int arr[] = { 12, 11, 13, 5, 6, 7, 4, 9, 15, 2 };

        System.out.print("Задан массив: ");
        heapSort.printArray(arr);

        HeapSort.heapSort hs = new heapSort();
        hs.sort(arr);

        System.out.print("Массив отсортирован к виду: ");
        heapSort.printArray(arr);
    }
}
