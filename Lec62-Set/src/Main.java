import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();

        set.add(1);
        set.add(5);
        set.add(3);

        // Set cannot contain duplicate elements

        System.out.println(set);
    }
}
