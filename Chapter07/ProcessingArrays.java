package Chapter07;
import java.util.*;
public class ProcessingArrays {
    public static void main(String[] args) {
        double[] scores = new double[10];
        // 1. Initialize an array with input values
        // initializeArray (scores)
        // 2. Initialize an array with random values
        initializeArrayWithRandomValues(scores);
        // 3. Print an array
        printArray (scores);
    }

    public static void initializeArrayWithRandomValues(double[] userScores) {
        /* [a, b] Math.random()* (b - a + 1) + a
         * [0, 100] Math.random() * 101
         * Math.random();
         * userScores = double[10]@10
         */
        for (int i = 0; i < userScores.length; i++;){ 
            userScores[i] = Math.random() * 101;
        }
        
    }

   public static void printArray(double[] userScores) {
    
   }
}

