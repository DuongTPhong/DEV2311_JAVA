package baitap.thuchanh4;

import java.util.ArrayList;
import java.util.Scanner;

public class BaiThucHanh04 {
    ArrayList<Book> lstBook = new ArrayList<>();

    public void nhapDuLieu() {
        System.out.println("Số sách muốn nhập?");
        Scanner input = new Scanner(System.in);
        int cnt = input.nextInt();
        for (int i = 0; i < cnt; i++) {
            System.out.println("Nhập cuốn thứ " + (i + 1));
            Book book = new Book();
            book.nhapDuLieu();
            lstBook.add(book);
        }
        System.out.println("Xin cảm ơn!");
    }

    public void hienThiDanhSach() {
        System.out.println("Số sách trong thư viện: ");
        for (int i = 0; i < lstBook.size(); i++) {
            Book get = lstBook.get(i);
            System.err.println((i + 1) + ". " + get.toString());
        }
        System.out.println("--------------------------");
    }

    public void xoaSach() {
        System.out.println("Nhập số thứ tự sách muốn xóa");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        if (id < lstBook.size() && id >= 0) {
            lstBook.remove(id);
        }
        System.out.println("Xóa thành công");
    }

    public int showMenu() {
        System.out.println("Menu");
        System.out.println("1. Nhập dữ liệu");
        System.out.println("2. Hiển thị danh sách");
        System.out.println("3. Xóa");
        System.out.println("4. Thoát");
        System.out.println("Vui lòng nhập từ 1 -> 4");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static void main(String[] args) {
        int choose;
        BaiThucHanh04 main = new BaiThucHanh04();
        do {
            choose = main.showMenu();
            switch (choose) {
                case 1:
                    main.nhapDuLieu();
                    break;
                case 2:
                    main.hienThiDanhSach();
                    break;
                case 3:
                    main.xoaSach();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
