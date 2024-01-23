import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // HasSet --> Săp xếp danh sách
        // LinkedHashSet -->

        Set<String> stringSet = new LinkedHashSet<>();
        stringSet.add("2");
        stringSet.add("1");
        stringSet.add("1");
        stringSet.add("3");
        for (String s: stringSet){
            System.out.println(s);
        }
    }
}