// A wolf in sheep's clothing

public class ZywOo {

  public static String warnTheSheep(String[] array) {
//     If wolf is closest to me...
    if (array[(array.length - 1)].equals("wolf")) {
      return "Pls go away and stop eating my sheep";
    }
    
//     Identify the index of the wolf.
    int wolfIndex = 0;
    
    for (int i = 0; i < array.length; i++)
    {
        if (array[i] == "wolf") {
            wolfIndex = i + 1;
//           +1 to get element number rather than index number
        }
    }
    
//     Get the element number of the sheep in front of the wolf
    int sheepIndex = array.length - wolfIndex;
   
    return "Oi! Sheep number " + sheepIndex + "! You are about to be eaten by a wolf!";
  }

}
