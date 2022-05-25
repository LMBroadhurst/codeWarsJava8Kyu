// Sum of Multiples


public class Kata {
    public static long sumMul(int n, int m) {
        
        // From M we must find the even numbers... for loop, include some sort of summation in that to add together the numbers
        // Stop we we get below n, add condition to the for loop

      if (m < 1 || n < 1) throw new IllegalArgumentException();

        int sumOfInts = 0;
        for (int i = 0; i < m; i++) {
            if (i % n == 0) {
                sumOfInts += i;
            }
        }

      
        return sumOfInts;
    }
}
