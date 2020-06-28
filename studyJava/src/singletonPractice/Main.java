package singletonPractice;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/06/28}
 */
public class Main {
    public static void main(String[] args) {
        CardCompany cardCompany = CardCompany.getInstance();
        Card myCard = cardCompany.createCard();
        Card yourCard = cardCompany.createCard();

        System.out.println(myCard.getCardNumber());
        System.out.println(yourCard.getCardNumber());
    }
}
