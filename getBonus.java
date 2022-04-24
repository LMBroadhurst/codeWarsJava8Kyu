// Do I get a bonus?


public class Kata{
  public static String bonusTime(final int salary, final boolean bonus) {
    
    if (bonus == true) {
      int salary1 = salary * 10;
      return "£" + Integer.toString(salary1);
    } else {
      return "£" + Integer.toString(salary);
    }
    
  }
}
