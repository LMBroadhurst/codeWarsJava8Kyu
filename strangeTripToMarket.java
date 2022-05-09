// A Strange Trip to the Market

public class Nessie {
    public static boolean isLockNessMonster(String s){
     if (s.contains("tree fiddy") || s.contains("3.50") || s.contains("three fifty")) {
       return true;
     } else {
       return false;
     }
    }
}
