// L1: Set Alarm

public class Alarm {
  
  public static boolean setAlarm(boolean employed, boolean vacation) {
    
    if (employed && vacation) {
      return false;
    } else if (!employed) {
      return false;
    } else {
      return true;
    }
