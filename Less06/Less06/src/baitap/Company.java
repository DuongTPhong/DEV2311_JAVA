package baitap;


import java.util.*;
import java.util.Collections;
import java.util.Comparator;

public class Company {
    List<Employee> employees = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
void nhapDl () {
    System.out.println("Nhập số lượng nhân viên:");
    int n = scanner.nextInt();
    scanner.nextLine();

    for (int i = 0; i < n; i++) {
        Employee employee = new Employee();
        System.out.println("Nhập thông tin nhân viên thứ " + (i + 1));
        employee.nhap();
        employees.add(employee);
    }
}
    void xuatDl () {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).xuat());
        }
    }

    void sapXepLuong() {
        Collections.sort(employees, Comparator.comparing(Employee::getSalary));
    }
    void sapXepTen() {
        Collections.sort(employees, Comparator.comparing(Employee::getName));
    }

    void search() {
        System.out.println("Nhập tên cần tìm kiếm:");
        String searchName = scanner.nextLine();

        for (int i = 0; i < employees.size(); i++) {
            if (searchName.equals(employees.get(i).getName())) {
                System.out.println(employees.get(i).xuat());
            }
        }
    }
    public static void main (String[]args){
        Company company = new Company();
        company.nhapDl();
        System.out.println("Danh sách nhân viên sau khi nhập:");
        company.xuatDl();
        company.search();

        company.sapXepLuong();
        System.out.println("Danh sách nhân viên sau khi sắp xếp theo lương:");
        company.xuatDl();

        company.sapXepTen();
        System.out.println("Danh sách nhân viên sau khi sắp xếp theo tên:");
        company.xuatDl();
    }
}
