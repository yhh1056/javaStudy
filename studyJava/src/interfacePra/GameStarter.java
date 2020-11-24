package interfacePra;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/07/02}
 */
public class GameStarter {
    public static void main(String[] args) {
        Player player = new Player();
        player.login();
        player.choiceCharacter();
        player.playing();
        player.logOut();
    }
}
