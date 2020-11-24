package interfacePra;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/07/02}
 */
public class Beginner implements Character {
    @Override
    public void attack() {
        System.out.println("맨손 공격");
    }

    @Override
    public void move() {
        System.out.println("뚜벅 뚜벅");

    }
}
