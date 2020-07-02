package interfacePra;

import java.util.Scanner;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/07/02}
 */
public class Player {
    private static final String GAME_START = "게임 시작";
    private static final String GAME_END = "게임 종료";

    public Beginner beginner;
    private Wizard wizard;
    private Warrior warrior;

    public static void login() {
        System.out.println(GAME_START);
    }

    public static void logOut() {
        System.out.println(GAME_END);
    }

    public Game choiceCharacter() {
        System.out.println("캐릭터를 선택해주세요. 초보자, 전사, 법사만 입력 가능");
        Scanner scanner = new Scanner(System.in);
        String character = scanner.nextLine();
        String b = "초보자";
        String w = "전사";
        String m = "법사";

        if (character.equals(b)) {
            Beginner beginner = new Beginner();
            this.beginner = beginner;
            return beginner;
        } else if (character.equals(w)) {
            Warrior warrior = new Warrior();
            this.warrior = warrior;
            return warrior;
        } else if (character.equals(m)) {
            Wizard wizard = new Wizard();
            this.wizard = wizard;
            return wizard;
        }
        return null;
    }

    public void playing() {
        Game player = choiceCharacter();
        player.attack();
        player.run();
    }
}
