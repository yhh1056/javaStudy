package collectionPra.hashSetEx;

import java.util.HashSet;

/**
 * author {yhh1056}
 * Create by {2020/07/07}
 */
public class MemberHashSet {
    private HashSet<Member> hashSet;

    public MemberHashSet() {
        hashSet = new HashSet<>();
    }

    public void addMember(Member member) {
        hashSet.add(member);
    }

    public void showAll() {
        for (Member member : hashSet) {
            System.out.println(member);
        }
    }
}
