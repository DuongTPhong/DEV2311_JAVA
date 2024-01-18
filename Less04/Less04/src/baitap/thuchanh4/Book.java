package baitap.thuchanh4;

import java.util.Scanner;

public class Book {
    private String bookName;
    private String nxb;
    private int yearOfPublish;
    private String author;
    private int numOfPage;
    private float price;

    public void nhapDuLieu() {
        System.out.println("Nhập dữ liệu cho sách");
        Scanner input = new Scanner(System.in);
        System.out.print("Tên sách: ");
        this.bookName = input.nextLine();
        System.out.print("\nNhà xuất bản: ");
        this.nxb = input.nextLine();
        System.out.print("\nNăm xuất bản: ");
        this.yearOfPublish = input.nextInt();
        input.nextLine();
        System.out.print("\nTác giả: ");
        this.author = input.nextLine();
        System.out.print("\nSố trang: ");
        this.numOfPage = input.nextInt();
        input.nextLine();
        System.out.print("\nGiá: ");
        this.price = input.nextFloat();
    }

    @Override
    public String toString() {
        return "Book{" + "bookName=" + bookName + ", nxb=" + nxb + "" +
                ", yearOfPublish=" + yearOfPublish + ", author=" + author + "" +
                ", numOfPage=" + numOfPage + ", price=" + price + '}';
    }
}
