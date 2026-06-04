package DynamicArray;

public class Main {
  public static void main(String[] args) {
    DynamicArray dynamicArray = new DynamicArray(5);

    System.out.println("Capacity: " + dynamicArray.getCapacity());
    System.out.println("Size: " + dynamicArray.getSize());

    dynamicArray.pushback(1);
    dynamicArray.pushback(2);
    dynamicArray.pushback(3);
    dynamicArray.pushback(4);

    System.out.println("Size: " + dynamicArray.getSize());

    System.out.println("----------- Elements ----------");
    for (int i = 0; i < dynamicArray.getCapacity(); i++) {
      try {
        System.out.println(dynamicArray.get(i));
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Null");
      }
    }

    dynamicArray.pushback(5);
    dynamicArray.pushback(6);

    System.out.println("----------- Elements ----------");
    for (int i = 0; i < dynamicArray.getCapacity(); i++) {
      try {
        System.out.println(dynamicArray.get(i));
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Null");
      }
    }

    System.out.println("Capacity: " + dynamicArray.getCapacity());
  }
}
