package collectionPra.setEx;


/**
 * author {yhh1056}
 * Create by {2020/07/07}
 */
public class HashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member member = new Member("yhh");
        Member member2 = new Member("osh");
        Member member3 = new Member("yhh");

        memberHashSet.addMember(member);
        memberHashSet.addMember(member2);
        memberHashSet.addMember(member3);

        memberHashSet.showAll();
    }
}
