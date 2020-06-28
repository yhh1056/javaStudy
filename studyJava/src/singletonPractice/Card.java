package singletonPractice;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/06/28}
 */
public class Card {
   public static int serialNumber = 10000;
   private int cardNumber;

   public void createCardNumber() {
       serialNumber++;
       cardNumber = serialNumber;
   }

   public void showCardNumber() {
       System.out.println(this.cardNumber);
   }
}
