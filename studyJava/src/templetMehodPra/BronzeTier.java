package templetMehodPra;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/07/01}
 */
public class BronzeTier extends Tier {
    @Override
    public void drive() {
        System.out.println("브론즈식 무빙.");
    }

    @Override
    public void drift() {
        System.out.println("브론즈식 드리프트");
    }

    @Override
    public void power() {
        System.out.println("브론즈는 파워 없음");
    }

}
