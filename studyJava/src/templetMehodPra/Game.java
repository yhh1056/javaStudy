package templetMehodPra;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/07/01}
 */
public class Game {
    public void start() {
        Player player = new Player();
        player.play();

        Gold goldTier = new Gold();
        player.upgradeTier(goldTier);
        player.play();
    }
}
