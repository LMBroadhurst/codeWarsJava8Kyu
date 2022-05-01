// Area of a square

import java.lang.Math.*;

public class Geometry{

  
  public static double squareArea(double A){
//     C = 2 Pi r
//     A * 4 = C
//     r ^ 2 = squareArea
    
    double circumference = A * 4;
    double radius = circumference / (2 * Math.PI);
    double areaOfS = Math.pow(radius, 2);
    
    double output = Math.round((areaOfS * 100.00)) / 100.00;
    
      
    return output;
  }
}
