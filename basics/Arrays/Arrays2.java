package basics.arrays;

public class Arrays2 {

    public static void main (String[] args) {

        // Declares an array of integers
        int[] anArray;


        // Other types
        byte[] anArrayOfBytes;
        short[] anArrayOfShorts;
        long[] anArrayOfLongs;
        float[] anArrayOfFloats;
        double[] anArrayOfDoubles;
        boolean[] anArrayOfBooleans;
        char[] anArrayOfChars;
        String[] anArrayOfStrings;

        // this form is discoraged
        float anArrayOfFloats1[];

        int[] anrray = {100, 200, 300,
            400, 500, 600,
            700, 800, 900, 1000
        };

        // Multidimensional Array

        String [][] names = {
            {"Mr.", "Mrs.", "Ms."},
            {"Smith", "Jones"}
        };

        System.out.println(names[0][0] + names[1][0]); // Mr. Smith
        
        System.out.println(names[0][2] + names[1][0]); // Mrs. Smith

       


    }
}
    
