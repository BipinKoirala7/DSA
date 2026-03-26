package Practice.MergeSort;

import java.util.Arrays;

public class Main {
  static void main() {
    int[] array1 = {42, 7, 19, 3, 88, 25, 61, 14, 9, 50};
    int[] array2 = {2, 17};

    Arrays.sort(array1);
    Arrays.sort(array2);

    MergeSort mergeSort = new MergeSort();
    System.out.println(Arrays.toString(mergeSort.mergeSort(array1)));
  }

}
