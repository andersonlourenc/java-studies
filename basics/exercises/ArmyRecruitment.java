package basics.exercises;

public class ArmyRecruitment {
  public static void main (String[] args) {

    int[] soldierStrength = {10, 80, 105, 120, 40};

    int total = 0;
    for (int i = 0; i < soldierStrength.length; i++) {
      
      if(soldierStrength[i] >= 100) {
        total++;
      }
    }
      System.out.println("Total is: " + total);
  }
}
