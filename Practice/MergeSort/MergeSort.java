package Practice.MergeSort;

import java.util.Arrays;

public class MergeSort {


  public int[] mergeSort1(int[] array) {
    if (array.length == 1) return array;

    int midIndex = array.length / 2;
    int[] left = mergeSort1(Arrays.copyOfRange(array, 0, midIndex));
    int[] right = mergeSort1(Arrays.copyOfRange(array, midIndex, array.length));

    return merge(left, right);
  }

  public int[] mergeSort(int[] array){
    int[][] arrayOfArray = new int[array.length][];

    for(int i = 0; i < array.length; i++){
      arrayOfArray[i] = new int[] {array[i]};
    }

    int i = 1;
    int[] finalAray = arrayOfArray[i - 1];

    while(i < arrayOfArray.length){
      finalAray = merge(finalAray, arrayOfArray[i]);
      i++;
    }

    return finalAray;
  }

  public int[] merge(int[] array1, int[] array2){
    int[] finalArray = new int[array1.length + array2.length];

    int index= 0;
    int i = 0;
    int j = 0;
    while(i < array1.length && j < array2.length){
      if(array1[i] > array2[j]){
        finalArray[index] = array2[j];
        j++;
      } else {
        finalArray[index] = array1[i];
        i++;
      }
      index++;
    }

    while(i < array1.length) {
      finalArray[index] = array1[i];
      i++;
      index++;
    }

    while(j < array2.length){
      finalArray[index] = array2[j];
      j++;
      index++;
    }
    return finalArray;
    }
}
