package baitap;

import lombok.Data;

@Data
public class Employee  extends Person{
    private String salary;
    private String position;

    public void nhap() {
        super.nhap();
        System.out.println("Nhap salary");
        salary = scanner.nextLine();
        System.out.println("Nhap position");
        position = scanner.nextLine();
    }
    public String xuat(){
        return super.xuat() +"-" + salary + "-" + position;
    }
}
