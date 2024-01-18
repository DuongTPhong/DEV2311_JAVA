import java.util.ArrayList;
import java.util.List;

public class DemoString {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("b");
        list.add("a");
        list.add("c");

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
