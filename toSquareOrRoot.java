// To square(root) or not to square(root)

import java.lang.Math;

public class Kata {
  public static int[] squareOrSquareRoot(int[] array) {
    for (int i = 0; i < array.length; i++) {
      if ( Math.sqrt(array[i]) % 1 != 0 ) {
        array[i] *= (array[i]);
      } else {
        array[i] = (int) Math.sqrt(array[i]);
      }
    }
    return array;
  }
}
