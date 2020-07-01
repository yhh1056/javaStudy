package templetMehodPra;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/07/01}
 */
public class Gold extends Tier {
    @Override
    public void drive() {
        System.out.println("골드식 무빙 괜찮음");
    }

    @Override
    public void drift() {
        System.out.println("골드식 드리프트 괜찮음");
    }

    @Override
    public void power() {
        System.out.println("파워 조금 약함");
    }
}
