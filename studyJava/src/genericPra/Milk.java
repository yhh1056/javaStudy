package genericPra;

/**
 * author {yhh1056}
 * Create by {2020/07/06}
 */
public class Milk implements CoffeeMaterial {
    @Override
    public String toString() {
        return "우유를 섞습니다";
    }

    public String result() {
        return "라떼 완성!";
    }
}
