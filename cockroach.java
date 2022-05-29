// Beginner Series #4 Cockroach


public class Cockroach{
  public int cockroachSpeed(double x){
    
//     1km = 100000cm
//     1Hr = 3600 seconds
//     Math.floor(x)
    
    double convertedX = (x * 100000) / 3600;
    
    return (int) Math.floor(convertedX);
    
  }
}
