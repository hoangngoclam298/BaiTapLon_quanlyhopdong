package quanlyhopdong;

import java.time.LocalDate;

public abstract class HopDong {
    private String tenNguoiMua;
    private String tenNguoiThuHuong;
    private int thoiHanHD;
    private long giaTriHD;
    private LocalDate ngayMua;
    public String getTenNguoiMua() {
        return tenNguoiMua;
    }
    public String getTenNguoiThuHuong() {
        return tenNguoiThuHuong;
    }
    public int getThoiHanHD() {
        return thoiHanHD;
    }
    public long getGiaTriHD() {
        return giaTriHD;
    }
    public LocalDate getNgayMua() {
        return ngayMua;
    }

    public abstract long loiNhuan();

    HopDong(String tenNguoiMua, String tenNguoiThuHuong, int thoiHanHD, long giaTriHD, int ngay, int thang, int nam) { 
        this.tenNguoiMua = tenNguoiMua;
        this.tenNguoiThuHuong = tenNguoiThuHuong;
        this.thoiHanHD = thoiHanHD;
        this.giaTriHD = giaTriHD;
        ngayMua = LocalDate.of(nam, thang, ngay);
    }
    public LocalDate thoihanHD() {
        return ngayMua.plusMonths(thoiHanHD);
    }

    public void inThongTin() {
        System.out.println("Thong tin cua khach hang ");
        System.out.println("Ten nguoi mua: " + tenNguoiMua);
        System.out.println("Ten nguoi thu huong: "+tenNguoiThuHuong);
        System.out.println("Gia tri hop dong: "+giaTriHD);
        System.out.println("Ngay mua:"+ngayMua.getDayOfMonth()+"/"+ngayMua.getMonthValue()+"/"+ngayMua.getYear());
        System.out.println("Thoi han: "+thoiHanHD+" thang\n");
    }
    public void suaThongTin(String tenNguoiMua, String tenNguoiThuHuong, int thoiHanHD, long giaTriHD, int ngay, int thang, int nam) {
        this.tenNguoiMua = tenNguoiMua;
        this.tenNguoiThuHuong = tenNguoiThuHuong;
        this.thoiHanHD = thoiHanHD;
        this.giaTriHD = giaTriHD;
        ngayMua = LocalDate.of(nam, thang, ngay);
    }
}