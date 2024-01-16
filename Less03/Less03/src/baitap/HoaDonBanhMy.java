package baitap;

import java.util.Date;

public class HoaDonBanhMy {
    private String maHoaDon;
    private Date ngayLap;
    private String tenKhachHang;
    private String diaChi;
    private int soLuong;
    private double giaBanh;
    private double tienKhuyenMai;

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(Date ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaBanh() {
        return giaBanh;
    }

    public void setGiaBanh(double giaBanh) {
        this.giaBanh = giaBanh;
    }

    public double getTienKhuyenMai() {
        return tienKhuyenMai;
    }

    public void setTienKhuyenMai(double tienKhuyenMai) {
        this.tienKhuyenMai = tienKhuyenMai;
    }

    public HoaDonBanhMy(String maHoaDon, Date ngayLap, String tenKhachHang, String diaChi, int soLuong, double giaBanh, double tienKhuyenMai) {
        this.maHoaDon = maHoaDon;
        this.ngayLap = ngayLap;
        this.tenKhachHang = tenKhachHang;
        this.diaChi = diaChi;
        this.soLuong = soLuong;
        this.giaBanh = giaBanh;
        this.tienKhuyenMai = tienKhuyenMai;
    }

    public double tinhTongTienHang() {
        return soLuong * giaBanh;
    }

    public double tinhTongTienPhaiThanhToan() {
        return tinhTongTienHang() - tienKhuyenMai;
    }

    public void tinhTienKhuyenMai() {
        if (soLuong >= 100) {
            tienKhuyenMai += 0.2 * tinhTongTienHang();
        } else if (soLuong >= 10) {
            tienKhuyenMai += 0.1 * soLuong * giaBanh;
        }
    }
}
