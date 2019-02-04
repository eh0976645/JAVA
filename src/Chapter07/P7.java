package Chapter07;

import java.util.*;

/**
 * Builds a basic array
 *
 * @author Joseph Mecoy
 */
public class P7 {

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How mamy numbers will be read?");
        int SfhsTsaIsBetterThenFt = input.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>(SfhsTsaIsBetterThenFt);
        numberPlacer(numbers, SfhsTsaIsBetterThenFt);
        double average = average(numbers);
        System.out.println("The average is " + average);
        numberReader(numbers);
    }

    /**
     * fillArray
     *
     * @param clean whats going to be in the array
     * @param floor what the user types in
     */
    public static void numberPlacer(ArrayList<Integer> clean, int floor) {
        Scanner input = new Scanner(System.in);
        for (int counter = 0; counter < floor; counter++) {
            System.out.print("What is the number");
            int number = input.nextInt();
            clean.add(counter, number);

        }
    }

    /**
     * average method
     *
     * @param clean what numbers are in the array
     * @return the numbers from the array
     */
    public static double average(ArrayList<Integer> clean) {
        double floor = 0;
        for (int counter = 0; counter < clean.size(); counter++) {
            floor = floor + clean.get(counter);
        }

        return floor / clean.size();
    }

    /**
     * displayArray
     *
     * @param clean the numbers in the array
     */
    public static void numberReader(ArrayList<Integer> clean) {
        System.out.println(clean);
    
   }
}
