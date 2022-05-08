// Lario and Muigi Pipe Problem


public class Kata {
  public static int[] pipeFix(int[] numbers) {
    
    int finEnd = numbers[numbers.length - 1];
    int finStart = numbers[0];
    int finLength = finEnd - finStart + 1;
    
    int[] output = new int[finLength];
    
    for (int i = 0; i < output.length; i++) {
      output[i] = finStart + i;
    }
    
    return output;
    
  }
}
