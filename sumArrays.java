Sum Arrays

public class SumArray {

  public static double sum(double[] numbers) {
    double total = 0;
    for (int i = 0; i < numbers.length; i++) {
      
      total += numbers[i];
      
    }
    return total;
  }
  
}
