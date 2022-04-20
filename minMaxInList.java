Find Maximum and Minimum Values of a List

public class Kata {

  public int min(int[] list) {
    int minValue = list[0];
    
    for (int i = 1; i < list.length; i++) {
      if (list[i] < minValue) {
        minValue = list[i];
      }
    }
    return minValue;
  }
  
  public int max(int[] list) {
    
    int maxValue = list[0];
    
    for (int i = 1; i < list.length; i++) {
      if (list[i] > maxValue) {
        maxValue = list[i];
      }
    }
    return maxValue;
    
  }
}
