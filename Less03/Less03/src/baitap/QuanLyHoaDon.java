package baitap;

import baitap.HoaDonBanhMy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class QuanLyHoaDon {

    public static void main(String[] args) {
        QuanLyHoaDon quanLy = new QuanLyHoaDon();
        HoaDonBanhMy hoaDon = quanLy.nhapHoaDon();
        quanLy.inHoaDon(hoaDon);
    }

    public HoaDonBanhMy nhapHoaDon() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập thông tin hóa đơn:");
        System.out.print("Mã hóa đơn: ");
        String maHoaDon = scanner.nextLine();

        Date ngayLap = null;
        boolean ngayLapValid = false;
        while (!ngayLapValid) {
            System.out.print("Ngày lập hóa đơn (dd/MM/yyyy): ");
            ngayLap = parseDate(scanner.nextLine());
            ngayLapValid = (ngayLap != null);
        }

        System.out.print("Tên khách hàng: ");
        String tenKhachHang = scanner.nextLine();

        System.out.print("Địa chỉ giao hàng: ");
        String diaChi = scanner.nextLine();

        System.out.print("Số lượng bánh cần giao: ");
        int soLuong = scanner.nextInt();

        System.out.print("Giá bán 1 chiếc bánh: ");
        double giaBanh = scanner.nextDouble();

        System.out.print("Tiền khuyến mãi: ");
        double tienKhuyenMai = scanner.nextDouble();

        HoaDonBanhMy hoaDon = new HoaDonBanhMy(maHoaDon, ngayLap, tenKhachHang, diaChi, soLuong, giaBanh, tienKhuyenMai);
        hoaDon.tinhTienKhuyenMai();

        return hoaDon;
    }

    public void inHoaDon(HoaDonBanhMy hoaDon) {
        System.out.println("-------- Hóa Đơn Bánh Mỳ --------");
        System.out.println("Mã hóa đơn: " + hoaDon.getMaHoaDon());
        System.out.println("Ngày lập hóa đơn: " + formatDate(hoaDon.getNgayLap()));
        System.out.println("Tên khách hàng: " + hoaDon.getTenKhachHang());
        System.out.println("Địa chỉ giao hàng: " + hoaDon.getDiaChi());
        System.out.println("Số lượng bánh cần giao: " + hoaDon.getSoLuong());
        System.out.println("Giá bán 1 chiếc bánh: " + hoaDon.getGiaBanh());
        System.out.println("Tổng tiền hàng: " + hoaDon.tinhTongTienHang());
        System.out.println("Tiền khuyến mãi: " + hoaDon.getTienKhuyenMai());
        System.out.println("Tổng tiền phải thanh toán: " + hoaDon.tinhTongTienPhaiThanhToan());
    }

    private Date parseDate(String dateStr) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            return dateFormat.parse(dateStr);
        } catch (Exception e) {
            System.out.println("Lỗi: Định dạng ngày không hợp lệ. Vui lòng nhập lại.");
            return null;
        }
    }

    private String formatDate(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(date);
    }
}
