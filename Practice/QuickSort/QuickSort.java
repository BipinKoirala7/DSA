package Practice.QuickSort;

public class QuickSort {
  public void quickSort(int[] array, int left, int right) {
    if (left < right) {
      int pivotIndex = pivot(array, left, right);
      quickSort(array, left, pivotIndex - 1);
      quickSort(array, pivotIndex + 1, right);
    }
  }

  public int pivot(int[] array, int pivotIndex, int endIndex) {
    int swapIndex = pivotIndex;

    for (int i = pivotIndex + 1; i <= endIndex; i++) {
      if (array[i] < array[pivotIndex]) {
        swapIndex++;
        swap(array, swapIndex, i);
      }
    }

    swap(array, pivotIndex, swapIndex);

    return swapIndex;
  }

  private void swap(int[] array, int i, int j){
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
  }
}
