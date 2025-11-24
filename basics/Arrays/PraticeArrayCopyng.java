package basics.Arrays;

import java.util.Arrays;

public class PraticeArrayCopyng {
    
    public static void main(String[] args) {
        
        int[] original = {1,2,3,4,5};
        int[] copy = new int [original.length];

        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copy: " + Arrays.toString(copy));

        // Modify copy to show they are independent
        copy[0] = 999;
        copy[4] = 777;

        System.out.println("");
        System.out.println("After modifying the copy:");
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copy: " + Arrays.toString(copy));

        // System.arraycopy example
        int[] source = {10, 20, 30, 40, 50};
        int[] destination = new int [5];
        System.arraycopy(source, 0, destination, 0, source.length);

        System.out.println("");
        System.out.println("Using System.arraycopy:");
        System.out.println("Source: " + Arrays.toString(source));
        System.out.println("Destination: " + Arrays.toString(destination));
    }
}
