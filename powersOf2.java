// Power of 2

public class Kata{
  public static long[] powersOfTwo(int n){
    
    long[] output = new long[(n + 1)];
    
    for (int i = 0; i < output.length; i++) {
      output[i] = (long) Math.pow(2, i);
    }
    
    return output;
  }
}
