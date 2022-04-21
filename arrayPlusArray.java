// Array plus Array

public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {

    int total1 = 0;

    int total2 = 0;

    for (int i = 0; i < arr1.length; i++) {
      total1 += arr1[i];
    }

    for (int i = 0; i < arr2.length; i++) {
      total2 += arr2[i];
    }
    
    int output = total1 + total2;

    return output;

  }

}
