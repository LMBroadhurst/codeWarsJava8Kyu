// Will there be enough space?

public class Bob {
  public static int enough(int cap, int on, int wait){
  
//     Write an algo that includes the cap of the bus.
//     Cannot go over this point.
    
//     If it is over cap, return number of passengers that cannot be taken.
//     Add the passengers, if over cap then return number - cap, gives number can't fit on.
    
    if ((on + wait) <= cap) {
      return 0;
    } else {
      return (on + wait) - cap;
    }
    
  }
}
