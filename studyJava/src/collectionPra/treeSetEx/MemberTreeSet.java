package collectionPra.treeSetEx;


import java.util.TreeSet;

/**
 * author {yhh1056}
 * Create by {2020/07/07}
 */
public class MemberTreeSet {
    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        treeSet = new TreeSet<>();
    }

    public void addMember(Member member) {
        treeSet.add(member);
    }

    public void showAll() {
        for (Member member : treeSet) {
            System.out.println(member);
        }
    }
}
