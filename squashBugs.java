Squash The Bugs

import java.util.*;

public class Kata {

  public static int findLongest(final String str) {
    String[] spll = str.split(" ");
    
    int longest = 0;
    
    for (int i = 0; i < spll.length; i++) {
      
      if (spll[i].length() > longest) {
        
        longest = spll[i].length();
      
      }
      
    }
    return longest;
    }
}
