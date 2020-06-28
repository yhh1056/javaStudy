package singletonPractice;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/06/28}
 */
public class Card {
    public static int number = 10000;
    private int cardNumber;

    public Card() {
        number++;
        this.cardNumber = number;
    }

    public int getCardNumber() {
        return this.cardNumber;
    }
}
