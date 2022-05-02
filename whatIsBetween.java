// What is between?

public class Kata {

  public static int[] between(int a, int b) {
    int diff = (b - a) + 1;
    int[] intArray = new int[diff];
    
    for (int i = 0; i < intArray.length; i++) {
      intArray[i] = a;
      a += 1;
    }
    return intArray;
  }
}
