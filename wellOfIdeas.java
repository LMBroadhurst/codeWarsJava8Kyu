// Well of Ideas - Easy Version


public class Kata {

  public static String well(String[] x) {
    
    int goodCount = 0;
    String strOutput = "";
    
    for (String good: x) {
      if (good == "good") {
        goodCount += 1;
      }
    }
    
    if (goodCount > 2) {
      strOutput = "I smell a series!";
    } else if (goodCount > 0) {
      strOutput = "Publish!";
    } else {
      strOutput = "Fail!";
    }
    
    return strOutput;
  }
}
