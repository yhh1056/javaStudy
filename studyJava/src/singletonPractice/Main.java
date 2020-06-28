package singletonPractice;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/06/28}
 */
public class Main {
    public static void main(String[] args) {
        CardCompany company = CardCompany.getInstance();

        Card studentCard = company.createCard();
        Card policeCard = company.createCard();

        studentCard.showCardNumber();
        policeCard.showCardNumber();

    }
}
