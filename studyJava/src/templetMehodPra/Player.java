package templetMehodPra;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/07/01}
 */
public class Player {
    public final String GAME_START = "===게임 시작===";
    public final String GAME_END = "===게임 종료===" + "\n";
    private Tier tier;

    public Player() {
        this.tier = new BronzeTier();
    }

    public void play() {
        System.out.println(GAME_START);
        tier.drive();
        tier.drift();
        tier.power();
        System.out.println(GAME_END);

    }

    public void upgradeTier(Tier tier) {
        this.tier = tier;
    }
}
