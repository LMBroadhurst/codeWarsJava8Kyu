// Will you make it?

public class Kata {
  
  public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
    double milesLeft = mpg * fuelLeft;
    
    if (distanceToPump <= milesLeft) {
      return true;
    } else {
      return false;
    }
  }
  
}
