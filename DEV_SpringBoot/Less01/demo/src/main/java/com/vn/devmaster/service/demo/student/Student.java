package com.vn.devmaster.service.demo.student;


import lombok.Data;



import java.util.Scanner;

@Data

public class Student {
    private String id;
    private String name;
    private Long age;
    private String address;
    private Double gpa;
    public static final Scanner sc = new Scanner(System.in);

    void nhap() {
        System.out.println("Nhap id");
        id = sc.nextLine();
        System.out.println("Nhap name");
        name = sc.nextLine();
        System.out.println("Nhap age");
        age = Long.parseLong(sc.nextLine());
        System.out.println("address");
        address = sc.nextLine();
        System.out.println("gpa");
        gpa = Double.parseDouble(sc.nextLine());
    }

    String xuat() {
        // System.out.printf("%s %s %d %s %.2f\n", id, name, age, address, gpa);
        return "ID: " + id + ", Name: " + name + ", Age: " + age + ", Address: " + address + ", GPA: " + gpa;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.nhap();
        student.xuat();
    }
}
