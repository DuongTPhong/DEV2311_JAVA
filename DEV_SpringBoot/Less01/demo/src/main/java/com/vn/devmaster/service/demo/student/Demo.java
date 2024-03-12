package com.vn.devmaster.service.demo.student;

import java.util.*;

public class Demo {

    List<Student> studentList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    void menu() {
        int choice;
        String menu = "1. Add student.\n" +
                "2. Edit student by id.\n" +
                "3. Delete student by id.\n" +
                "4. Sort student by gpa.\n" +
                "5. Sort student by name.\n" +
                "6. Show student.\n" +
                "0. Exit.";
        System.out.println(menu);
        while (true) {
            System.out.println("Nhap lua chon:");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    nhap();
                    break;
                case 2:
                    update();
                    break;
                case 3:
                    break;
                case 4:
                    sortByGpa();
                    break;
                case 5:
                    sortByName();
                    break;
                case 6:
                    xuat();
                    break;
                case 0:
                    System.out.println("Exit");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập số từ 0 đến 6.");
            }
        }
    }

    void nhap() {
        System.out.println("Nhập số sinh viên:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            Student student = new Student();
            System.out.println("Nhap thong tin sinh vien thu:"  + (i + 1) + ":");
            student.nhap();
            studentList.add(student);
        }
    }

    void xuat() {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println(studentList.get(i).xuat());
        }
    }

    void update() {
        System.out.println("Nhập ID của sinh viên cần sửa:");
        int id = scanner.nextInt();
        scanner.nextLine();

//        for (Student student : studentList) {
//            if (student.getId(id)) {
//                System.out.println("Nhập thông tin mới cho sinh viên:");
//                student.nhap();
//                return;
//            }
//        }
        System.out.println("Không tìm thấy sinh viên có ID là " + id);
    }

    public void sortByGpa() {
        Collections.sort(studentList, Comparator.comparing(Student::getGpa));
    }
    public void sortByName() {
        Collections.sort(studentList, Comparator.comparing(Student::getName));
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.menu();
    }
}
