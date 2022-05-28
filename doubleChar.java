// Double Char


public class Solution{
  public static String doubleChar(String s){
    String doubledStr = "";
    
    for (int i = 0; i < s.length(); i++) {
      doubledStr += Character.toString(s.charAt(i))
        + Character.toString(s.charAt(i));
    }
    
    return doubledStr;
  }
}
