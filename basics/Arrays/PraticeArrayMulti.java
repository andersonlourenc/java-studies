package basics.Arrays;

public class PraticeArrayMulti {
    public static void main(String[] args) {

         int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("3x3 Matrix");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "");
            }
            System.out.println();
        }

        // Try a different shaped matrix
        String[][] schedule = {
            {"Math", "Science", "English"},
            {"History", "Art", "PE"},
            {"Music", "Computer", "Study Hall"}
        };

        System.out.println("");
        System.out.println("Class Schedule:");
        String[] periods = {"Period 1", "Period 2", "Period 3"};
        for (int day = 0; day < schedule.length; day++) {
            System.out.println("Day" + (day + 1) + ":");
            for (int period = 0; period < schedule[day].length; period++) {
                System.out.println(" " + periods[period] + ": " + schedule[day][period]);
            }

        }
    }
}