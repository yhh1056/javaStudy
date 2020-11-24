package interfacePra;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/07/02}
 */
public class Wizard implements Character {
    @Override
    public void attack() {
        System.out.println("파이어 볼");
    }

    @Override
    public void move() {
        System.out.println("텔레 포트");
    }
}
