package basics.arrays;

public class DisplayDimensionalArray { 

    
    void printMatrix(String[][] strings) {
        for (int arrayIndex = 0; arrayIndex < strings.length; arrayIndex++) {
            for (int index = 0; index < strings[arrayIndex].length; index++) {
  
                System.out.print(strings[arrayIndex][index] + " ");
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {
        

        String[][] strings = {
            {"one"}, 
            {"Maria", "Jennifer", "Patricia"},
            {"James", "Michael"},
            {"Washington", "London", "Paris", "Berlin", "Tokyo"}
        };

        DisplayDimensionalArray app = new DisplayDimensionalArray();
        
    
        app.printMatrix(strings); 
    }
}