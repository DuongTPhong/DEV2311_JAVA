package baithuchanh;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {
    List<String>lstSinhvien= new ArrayList<>();

    public void testList() {
        lstSinhvien.add("Phong");
        lstSinhvien.add("Tuan");
        lstSinhvien.add("Ha");
        System.out.println("ArrayList Student");
        System.out.println("\t" + lstSinhvien + "\n");
    }

    public void updateList(){
        lstSinhvien.set(1, "Thang");
        System.out.println("Update ArrayList Student");
        System.out.println("\t" + lstSinhvien + "\n");
    }

    public void deleteList() {
        lstSinhvien.remove(0);
        System.out.println("Delete ArrayList Student");
        System.out.println("\t" + lstSinhvien + "\n");
    }
    public static void main(String[] args) {
        StudentManager demo = new StudentManager();
        demo.testList();
        demo.updateList();
        demo.deleteList();
    }
}
