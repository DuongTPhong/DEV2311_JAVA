package kethua;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Data
public class Student extends Person{
    private String clazz;

    public void nhap() {
        super.nhap();
        System.out.println("Nhap class");
        clazz = scanner.nextLine();
    }

    public String xuat(){
        return super.xuat() +"-" + clazz;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        System.out.println("Nhập số lượng sinh viên:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            Student student = new Student();
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1));
            student.nhap();
            students.add(student);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(students.get(i).xuat());
        }


    }
}
