package genericPra;

/**
 * author {yhh1056}
 * Create by {2020/07/06}
 */
public class Water implements CoffeeMaterial {
    @Override
    public String toString() {
        return "물을 섞습니다.";
    }

    public String result() {
        return "아메리카노 완성";
    }
}
