package singletonPractice;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/06/28}
 */
public class CardCompany {
    private static CardCompany instance = null;
    private CardCompany() {}

    public static CardCompany getInstance() {
        if(instance == null) {
            instance = new CardCompany();
        }
        return instance;
    }

    public Card createCard() {
        Card cardNumber = new Card();
        return cardNumber;
    }
}
