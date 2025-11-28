package basics.arrays;

import java.util.Arrays;

public class PraticeArrayCalculations {

        public static void main (String[] args) {

            int[] values = {12, 8, 15, 3, 9, 21};
            int sum = 0;
            int max = values[0];
            int min = values[0];

            // Calculate sum, max and min
            for (int value : values) {
                sum += value;
                if (value > max) max = value;
                if (value < min) min = value;
            }

            double average = (double) sum / values.length;

            System.out.println("Array: " + Arrays.toString(values));
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);

            // Try with different numbers
            int[] moreNumbers = {45, 23, 67, 12, 89, 34};
            int total = 0;

            for (int num : moreNumbers) {
                total += num;
            }
            System.out.println("");
            System.out.println("Second array: " + Arrays.toString(moreNumbers));
            System.out.println(total);

        }
}