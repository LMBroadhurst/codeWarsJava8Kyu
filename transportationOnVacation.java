// Transportation on vacation

public class Kata {
  
  public static int rentalCarCost(int d) {
    int noDiscount = d * 40;
    
    if (d >= 7) {
      return noDiscount - 50;
    } else if (d >= 3) {
      return noDiscount - 20;
    } else {
      return noDiscount;
    }
  }
}
