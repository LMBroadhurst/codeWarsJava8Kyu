// Simple Multiplication


public class Sid {
    public static int simpleMultiplication(int n) {
      int even_check = n % 2;
      
      if (even_check == 0) {
        return n * 8;
      } else {
        return n * 9;
      }
      
    }
}
