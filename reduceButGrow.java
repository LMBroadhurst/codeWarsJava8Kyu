// Beginner - Reduce but Grow

public class Kata{

  public static int grow(int[] x){
    
    int total = 1;
    
    for (int i = 0; i < x.length; i++) {
      total *= x[i];
    }
    
    return total;
    
  }

}
