import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {


//    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("3");
//        list.add("4");
//        list.add("1");
//        list.add("2");

//        for (String s: list) {
//            System.out.println(s);
//        }
//        System.out.println("sau khi set");
//        list.set(1,"4");
//        for (String s: list) {
//            System.out.println(s);
//        }
//
//        System.out.println("Xoa phan tu thu:");
//        list.remove(3);
//        for (String s: list) {
//            System.out.println(s);
//        }
//
//        System.out.println("index of cua 1:" + list.indexOf("1"));
//        System.out.println("last index of cua 1:" + list.lastIndexOf("1"));
//    }

    public static void main(String[] args) {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("2", "A");
        stringMap.put("3", "B");
        stringMap.put("1", "C");
        stringMap.put("5", "D");
        stringMap.put("4", "E");

        System.out.println(stringMap.get("1"));
        stringMap.forEach((key, value) -> {
            System.out.printf("[%s,%s]\n", key, value);
        });
    }
}
