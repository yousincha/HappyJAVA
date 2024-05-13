import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        boolean flag1 = set.add("hello");
        boolean flag2 = set.add("hi");
        boolean flag3 = set.add("hang");
        boolean flag4 = set.add("hang"); // 중복된 값이 추가 됐으므로  false출력

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println(flag4);

        Iterator<String> iter = set.iterator();
        while (iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }
    }
}
