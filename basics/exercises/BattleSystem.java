package basics.exercises;

public class BattleSystem {
  public static void main (String[] args) {

    int result = calculateDamage(40, 35);

    System.out.println("The damage was: " + result);

  }
  public static int calculateDamage(int attack, int defense) {


    if (attack < defense) {
      return 0;
    } else {
      return attack - defense;
    }

  }
}
