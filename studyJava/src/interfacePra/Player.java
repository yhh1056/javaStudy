package interfacePra;

import java.util.Scanner;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/07/02}
 */
public class Player implements GameSystem {
    private Character player;

    @Override
    public void login() {
        System.out.println(GameSystem.LOGIN_MESSAGE);
    }

    @Override
    public void logOut() {
        System.out.println(GameSystem.LOGOUT_MESSAGE);
    }

    public void choiceCharacter() {
        System.out.println(GameSystem.START);
        String character = getJob();

        switch (character) {
            case (BEGINNER) -> player = new Beginner();
            case (WIZARD) -> player = new Wizard();
            case (WARRIOR) -> player = new Warrior();
        }

    }

    @Override
    public void playing() {
        player.attack();
        player.move();
    }

    private String getJob() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
