package interfacePra;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/07/02}
 */
public class Beginner implements Game {
    @Override
    public void attack() {
        System.out.println("맨손 공격");
    }

    @Override
    public void run() {
        System.out.println("뚜벅 뚜벅");

    }
}
