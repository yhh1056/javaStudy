package collectionPra.setEx;

/**
 * author {yhh1056}
 * Create by {2020/07/07}
 */
public class Member {
    private String name;

    public Member(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            return this.name == member.name;
        }
        return false;
    }
}
