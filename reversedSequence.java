// Reversed Sequence


public class Sequence{

  public static int[] reverse(int n){
    
    int[] arrayInts = new int[n];
    
    for (int i = 0; i < arrayInts.length; i++) {
      
      arrayInts[i] = n;
      n -= 1;
      
    }
    
    return arrayInts;
    
  }
}
