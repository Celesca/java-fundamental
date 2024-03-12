import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("John", 18);
        map.put("Jane", 20);

        System.out.print(map.get("Jane"));

    }
}
