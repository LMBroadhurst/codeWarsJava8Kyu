// cat years, dog years

public class Dinglemouse {

  public static int[] humanYearsCatYearsDogYears(final int humanYears) {
//     create an algo that will take the human years and give the equivalent cat/dog years
//     add these values to an array
    
    int dogYears = 0;
    int catYears = 0;
    
    for (int i = 0; i < humanYears; i++) {
      if (i >= 2) {
        dogYears += 5;
        catYears += 4;
      } else if (i == 1) {
        dogYears += 9;
        catYears += 9;
      } else if (i == 0) {
        dogYears += 15;
        catYears += 15;
      }
    }
    
    return (new int[]{humanYears, catYears, dogYears});
    
  }

}
