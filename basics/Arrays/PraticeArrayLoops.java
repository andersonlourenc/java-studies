package basics.Arrays;

public class PraticeArrayLoops {
    public static void main(String[] args) {

        int [] scores = {95, 87, 92, 78, 85};

        for (int score : scores) {
            System.out.println("Score: " + score);
        }

        // Diferent data types
        double[] temperature = {28.5, 25.0, 18.3, 30.2};
        boolean[] flags = {true, false, true, false, true};
        char[] letters = {'a', 'b', 'c', 'd', 'e'};


        System.out.println("");
        System.out.println("Temperatures:");
        for (double temp : temperature) {
            System.out.println("Temperature: " + temp);
        }

        System.out.println("");
        System.out.println("Boolean flags:");
        for (int i = 0; i < flags.length; i++) {
            System.out.println(i + ": " + flags[i]);
        }

        System.out.println("");
        System.out.println("Character letters:");
        for (char letter : letters) {
            System.out.println("Letter: " + letter);
        }

    }
}