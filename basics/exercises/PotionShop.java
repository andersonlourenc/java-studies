package basics.exercises;

public class PotionShop {

  public static void main (String[] args) {

    int price = calculateFinalPrice(5, true);

    System.out.println("The price is: " + price);
  }

  public static double calculateFinalPrice(int quantity, boolean isVip) {

    if (quantity >= 5 && (isVip = true) {
      return 10;
    } else if (quantity >= 5) {
      return 15;
    } else {
      return 20;
    }
    

    
  }
}
