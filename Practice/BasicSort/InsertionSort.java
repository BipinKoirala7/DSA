package Practice.BasicSort;

public class InsertionSort {

  public void insertionSort(int[] array){
    for(int i = 1; i < array.length; i++){
      int temp = array[i];
      int j = i - 1;
      while(j > -1 && temp < array[j]){
        array[j + 1] = array[j];
        array[j] = temp;
        j--;
      }
    }
  }

  public void insertionSort1(int[] array){
    for(int i = 0; i < array.length - 1; i++){
      for(int j = i + 1; j > i; j--){
        if(array[j] < array[j - 1]){
          int temp = array[j - 1];
          array[j - 1] = array[j];
          array[j] = temp;
        }
      }
    }
  }
}
