Reversed Words

public class ReverseWords{

 public static String reverseWords(String str){
     
   String[] splitSentence = str.split(" ");
   
   String reversedSentence = "";
   
   for (int i = splitSentence.length - 1; i >= 0; i--) {
     if (i != 0) {
     reversedSentence += splitSentence[i] + " "; 
   } else {
     reversedSentence += splitSentence[i];
   }
   }
   
   return reversedSentence;
   
  }
}
