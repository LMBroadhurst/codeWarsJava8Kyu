// String Strings

public class Kata {
  public static String stringy(int size) {
//     Get size of string
//     Loop through, if i is odd +1, if even +0
    
    String output = "";
    
    for (int i = 0; i < (size); i++) {
      if (i % 2 == 0) {
        output += "1";
      } else {
        output += "0";
      }
    }
    return output;
  }
}
