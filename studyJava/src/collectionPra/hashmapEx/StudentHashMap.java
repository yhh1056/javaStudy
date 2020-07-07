package collectionPra.hashmapEx;

import java.util.HashMap;
import java.util.Iterator;

/**
 * author {yhh1056}
 * Create by {2020/07/07}
 */
public class StudentHashMap {
    private HashMap<Integer, Student> hashMap;

    public StudentHashMap() {
        hashMap = new HashMap<>();
    }

    public void addStudent(Student student) {
        hashMap.put(student.getId(), student);
    }

    public boolean removeStudent(int id) {
        if (hashMap.containsKey(id)) {
            hashMap.remove(id);
        }
        return false;
    }

    public void showAll() {
        Iterator<Integer> ir = hashMap.keySet().iterator();
        while (ir.hasNext()) {
            int key = ir.next();
            Student student = hashMap.get(key);
            System.out.println(student);
        }

    }
}
