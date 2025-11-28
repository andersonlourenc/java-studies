package basics.arrays;

public class PraticeArrayBasics {

    public static void main(String[] args) {

        // Basic array creating and initialization
        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.println("Array elements: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index: " + i + ": " + numbers[i]);
        
        }

        // Array initialization shortland
        String[] fruits =  {"apple", "banana", "cherry", "date"};
        System.out.println("");
        System.out.println("Fruits array:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(i + ": " + fruits[i]);
        }

        // Try creating your own arrays!
        double[] prices = {9.99, 15.50, 7.25};
        System.err.println("");
        System.out.println("Prices:");

        for (double price : prices) {
            System.out.println("$"+ price);
        }
        
    }
    
}
