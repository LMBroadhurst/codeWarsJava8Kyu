// Grasshopper - Grade book

public class GrassHopper {

    public static char getGrade(int s1, int s2, int s3) {
        float avg = (s1 + s2 + s3) / 3;
      
      if (avg >= 90) {
        return 'A';
      } else if (avg >= 80) {
        return 'B';
      } else if (avg >= 70) {
        return 'C';
      } else if (avg >= 60) {
        return 'D';
      }
      return 'F';
    }
}
