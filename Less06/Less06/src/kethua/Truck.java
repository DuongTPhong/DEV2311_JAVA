package kethua;

import java.util.ArrayList;
import java.util.List;

public class Truck extends Vehicle{
    private String truckload;

    public void nhap() {
        super.nhap();
        System.out.println("Nhap truckload");
        truckload = scanner.nextLine();
    }

    public String xuat(){
        return super.xuat() +"-" + truckload;
    }

    public static void main(String[] args) {
        List<Truck> trucks = new ArrayList<>();

        System.out.println("Nhập số lượng xe tải:");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            Truck truck = new Truck();
            System.out.println("Nhập thông tin xe tải thứ " + (i + 1));
            truck.nhap();
            trucks.add(truck);
        }
           for (int i = 0; i < n; i++) {
           System.out.println(trucks.get(i).xuat());
        }

        for (int i = 0; i < trucks.size(); i++) {
            Vehicle get = trucks.get(i);
            System.err.println((i + 1) + ". " + get.toString());
        }

    }
}
