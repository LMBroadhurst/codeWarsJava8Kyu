// Difference of Volumes of Cuboids

public class CuboidVolumes {
  public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
    int firstC = 1;
    int secondC = 1;
    
    for (int i = 0; i < firstCuboid.length; i++) {
      firstC *= firstCuboid[i];
    }
    
    for (int i = 0; i < secondCuboid.length; i++) {
      secondC *= secondCuboid[i];
    }
    
    if (firstC > secondC) {
      return firstC - secondC;
    }
    
    return secondC - firstC;
  }
}
