package kethua;

import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
public class Car extends Vehicle{
    private String speed;

    public void nhap() {
        super.nhap();
        System.out.println("Nhap speed");
        speed = scanner.nextLine();
    }

    public String xuat(){
        return super.xuat() +"-" + speed;
    }

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        System.out.println("Nhập số lượng car:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            Car car = new Car();
            System.out.println("Nhập thông tin car thứ " + (i + 1));
            car.nhap();
            cars.add(car);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(cars.get(i).xuat());
        }

        System.out.println("Nhập tên cần tìm kiếm:");
        String searchName = scanner.nextLine();

        for (int i = 0; i < n; i++) {
            if (searchName.equals(cars.get(i).getName())) {
                System.out.println(cars.get(i).xuat());
            }
        }
    }
}
