How good are you really?


public class Kata {
2
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
3
    int classTotal = 0;
4
    
5
    for (int i : classPoints) {
6
      classTotal += i;
7
    }
8
    
9
    int classAvg = classTotal / classPoints.length;
10
    
11
    if (classAvg >= yourPoints) {
12
      return false;
13
    } else {
14
      return true;
15
    }
16
  }
17
}
 Correctamu
