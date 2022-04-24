// Rock Paper Scissors


public class Kata {
2
  public static String rps(String p1, String p2) {
3
    
4
    String outcome = "";
5
    
6
    if (p1 == p2) {
7
      outcome = "Draw!";
8
    } else if (p1 == "scissors" && p2 == "paper") {
9
      outcome = "Player 1 won!";
10
    } else if (p1 == "scissors" && p2 == "rock") {
11
      outcome = "Player 2 won!";
12
    } else if (p1 == "rock" && p2 == "paper") {
13
      outcome = "Player 2 won!";
14
    } else if (p1 == "rock" && p2 == "scissors") {
15
      outcome = "Player 1 won!";
16
    } else if (p1 == "paper" && p2 == "rock") {
17
      outcome = "Player 1 won!";
18
    } else if (p1 == "paper" && p2 == "scissors") {
19
      outcome = "Player 2 won!";
20
    }
21
    return outcome;
22
  }
23
}
24
​
