package interfacePra;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/07/02}
 */
public class Warrior implements Character {
    @Override
    public void attack() {
        System.out.println("검으로 공격");
    }

    @Override
    public void move() {
        System.out.println("돌진 스킬");
    }
}
