package basics.Arrays;

import java.util.Arrays;

public class ArrayManipulation {

    public static void main(String[] args) {
        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
            "Marocchino", "Ristretto" };

            String[] copyTo = Arrays.copyOfRange(copyFrom, 2, 9);
            for (String coffee : copyTo) {
                System.out.println(coffee + "");
            }

            System.out.println(Arrays.toString(copyTo));
        }
}