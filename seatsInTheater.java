// Simple Fun #1: Seats in Theater


public class Kata {

  public static int seatsInTheater(int nCols, int nRows, int col, int row) {
//   The number of seats behind person x should just be the difference between
//     the rows and columns, mulitplied.
    
    int diffCols = nCols - col + 1;
    int diffRows = nRows - row;
    
    return (diffCols * diffRows);
    
//     +1 for columns as column person x sits in is included, whereas row isn't.
  }

}
