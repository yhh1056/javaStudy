package genericPra;

/**
 * author {yhh1056}
 * Create by {2020/07/06}
 */
public class Material<T extends CoffeeMaterial> {
    private T material;

    public void fill(T material) {
        this.material = material;
        System.out.println(material.toString());
    }

    public void showBeverage() {
        System.out.println(material.result());
    }
}
