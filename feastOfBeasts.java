// The Feast of Many Beasts


public class Kata {

  public static boolean feast(String beast, String dish) {
    
    int beastFinIndex = beast.length() - 1;
    int dishFinIndex = dish.length() - 1;
    
    if(beast.charAt(0) == (dish.charAt(0)) &&
       beast.charAt(beastFinIndex) == (dish.charAt(dishFinIndex))) {
      return true;
    }
    
    return false;
    
  }
  
}
