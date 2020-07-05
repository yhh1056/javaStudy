package ObjectPra;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Book harryPotter = new Book(100,"해리포터","롤링");
        System.out.println(harryPotter);
//      toString 재정의 전 출력값 : ObjectPra.Book@5b2133b1
//      재정의 후 출력값
//      제목 : 해리포터
//      작가 : 롤링
        Book oldHarryPotter = new Book(100,"해리포터", "롤링");

        System.out.println(harryPotter);                              //ObjectPra.Book@5b2133b1
        System.out.println(oldHarryPotter);                           //ObjectPra.Book@72ea2f77
        System.out.println(harryPotter.equals(oldHarryPotter));       //true

        System.out.println(harryPotter.hashCode());                   //100
        System.out.println(oldHarryPotter.hashCode());                //100

        System.out.println(System.identityHashCode(harryPotter));     //실제 해시코드를 보는 방

        Book cloneHarryPotter = (Book) harryPotter.clone();
        System.out.println(cloneHarryPotter);
    }
}
