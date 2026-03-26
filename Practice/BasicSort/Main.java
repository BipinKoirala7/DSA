package Practice.BasicSort;


import java.util.Arrays;

public class Main {
  static void main() {
    int[] array = new int[] { 2,3,4,5,6 };
    int[] array1 = new int[] { 2,3,4,5,6 };
    int[] array2 = new int[] { 2,3,4,5,6 };
    int[] array3 = new int[] { 2,3,4,5,6 };

    BubbleSort bubbleSort = new BubbleSort();
    bubbleSort.bubbleSort(array);
    System.out.println(Arrays.toString(array));

    SelectionSort selectionSort = new SelectionSort();
    selectionSort.selectionSort(array1);
    System.out.println(Arrays.toString(array1));

    InsertionSort insertionSort = new InsertionSort();
    insertionSort.insertionSort(array3);
    System.out.println(Arrays.toString(array2));
  }
}
