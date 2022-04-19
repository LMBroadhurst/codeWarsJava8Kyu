// Opposites Attract

public class OppositesAttract {

  public static boolean isLove(final int flower1, final int flower2) {

    float flower1Modulus = flower1 % 2;
    float flower2Modulus = flower2 % 2;
    
    if (flower1Modulus == 0 && flower2Modulus != 0) {
      return true;
    } else if (flower1Modulus != 0 && flower2Modulus == 0) {
      return true;
    } else {
      return false;
    }
    
  }
  
}
