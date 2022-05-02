// Parse nice int from char problem

public class CharProblem {
  public static int howOld(final String herOld) {
    
    String[] ageStr = herOld.split(" year");
    
    return Integer.parseInt(ageStr[0]);
  
  }
}
