package abstractPra;

import java.util.ArrayList;
import java.util.List;

/**
 * 클레스 설명
 * <p>
 * author {yhh1056}
 * Create by {2020/07/01}
 */
public class StarbucksEmployeeList extends Starbucks{
    @Override
    public void getBarista() {
        for (String barista : list()) {
            System.out.println(barista);
        }
    }

    public List<String> list() {
        List<String> list = new ArrayList<>();
        String bororo = "뽀로로";
        String sonOgong = "손오공";
        list.add(bororo);
        list.add(sonOgong);

        return list;
    }

//    하위클래스에서 재정의가 가능하다;
//    @Override
//    public void getCoffee() {
//        System.out.println("실수");
//    }
}
