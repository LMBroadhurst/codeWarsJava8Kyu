// Thinkful - Number Drills: Blue and red marbles


public class BlueAndRedMarbles {
  public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
    // Number of blue vs. red gives an initial probability
//     Take into account number of blue and red left to adjust probability
//     accordingly
//     return prob.
    
    float noBalls = blueStart + redStart;
    float finBalls = noBalls - (bluePulled + redPulled);
    float remBlue = blueStart - bluePulled;
    
    float prob = remBlue / finBalls;
    
    return prob;
  }
}
