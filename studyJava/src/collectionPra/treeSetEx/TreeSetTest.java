package collectionPra.treeSetEx;


/**
 * author {yhh1056}
 * Create by {2020/07/07}
 */
public class TreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member member2 = new Member("yhh");
        Member member3 = new Member("yhh");
        Member member = new Member("asd");

        memberTreeSet.addMember(member2);
        memberTreeSet.addMember(member3);
        memberTreeSet.addMember(member);

        memberTreeSet.showAll();
    }
}
