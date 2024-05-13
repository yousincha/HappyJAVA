import java.util.HashMap;
import java.util.Map;

public class MapExam {
    public static void main(String[] args) {
        Map<String, String > map = new HashMap<>();
        map.put("k1","hello");
        map.put("k2","hi");
        map.put("k3","안녕");
        map.put("k3","안녕하세요."); // put을 사용하면 덮어쓰기가 됨

        System.out.println(map.get("k1"));
        System.out.println(map.get("k2"));
        System.out.println(map.get("k3"));
    }
}
