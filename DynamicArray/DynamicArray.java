package DynamicArray;

public class DynamicArray {
  int[] arr;
  private int size;

  public DynamicArray(int capacity) {
    if (capacity < 0) {
      throw new ArrayIndexOutOfBoundsException();
    }
    this.arr = new int[capacity];
    this.size = 0;
  }

  public int get(int i) {
    if (i < 0 || i >= this.size) {
      throw new ArrayIndexOutOfBoundsException();
    }
    return arr[i];
  }

  public void set(int i, int n) {
    if (i < 0 || i >= this.size) {
      throw new ArrayIndexOutOfBoundsException();
    }
    this.arr[i] = n;
  }

  public void pushback(int n) {
    if (this.getSize() == this.getCapacity()) {
      resize();
    }

    this.arr[this.getSize()] = n;
    this.size++;
  }

  public int popback() {
    if (this.size == 0) {
      throw new IndexOutOfBoundsException("Cannot pop from an empty array");
    }
    int lastNum = this.arr[this.size - 1];
    this.arr[this.size - 1] = 0;
    this.size--;
    return lastNum;
  }

  private void resize() {
    int[] newArr = new int[this.arr.length * 2];
    System.arraycopy(this.arr, 0, newArr, 0, getCapacity());
    // Or int[] newArr = Arrays.copyOf(this.arr, getCapacity() * 2);
    this.arr = newArr;
  }

  public int getSize() {
    return this.size;
  }

  public int getCapacity() {
    return this.arr.length;
  }
}
