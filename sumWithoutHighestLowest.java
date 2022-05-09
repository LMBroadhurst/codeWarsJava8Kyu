// Sum without highest and lowest number


public class Kata
{
  public static int sum(int[] numbers)
  {
    if (numbers == null || numbers.length == 0 || numbers.length == 1) {
      return 0;
    } 
    
    int maxNum = -1000;
    
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] > maxNum) {
        maxNum = numbers[i];
      }
    }
    
    int minNum = 1000;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] < minNum) {
        minNum = numbers[i];
      }
    }
    
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    
    return sum - (maxNum + minNum);
    
  }
}
