Beginner Series #1 School Paperwork


public class Paper
{
  public static int paperWork(int n, int m) 
  {
    if (n < 0 || m < 0) {
      return 0;
    }
    
    int numberPages = n * m;
    
    return numberPages;
    
  }
}
