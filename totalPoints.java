// Total amount of points


public class TotalPoints {
  
    public static int points(String[] games) {
      
      int pointsTotal = 0;
      
      for (int i = 0; i < games.length; i++) {
        
        if (games[i].charAt(0) > games[i].charAt(2)) {
          pointsTotal += 3;
        } else if (games[i].charAt(0) == games[i].charAt(2)) {
          pointsTotal += 1;
        }
        
      }
      
      return pointsTotal;
      
    }
}
