package quanlyhopdong;

import java.time.LocalDate;

public abstract class HopDong {
    private String tenNguoiMua;
    private String tenNguoiThuHuong;
    private int thoiHanHD;
    private long giaTriHD;
    private LocalDate ngayMua;
    protected int Id;
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
    public int getId() {
        return Id;
    }
    public void setGiaTriHD(long giaTriHD) {
        this.giaTriHD = giaTriHD;
    }
    public void setTenNguoiMua(String tenNguoiMua) {
        this.tenNguoiMua = tenNguoiMua;
    }
    public void setTenNguoiThuHuong(String tenNguoiThuHuong) {
        this.tenNguoiThuHuong = tenNguoiThuHuong;
    }
    public void setThoiHanHD(int thoiHanHD) {
        this.thoiHanHD = thoiHanHD;
    }
    public void setNgayMua(LocalDate ngayMua) {
        this.ngayMua = ngayMua;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public abstract long loiNhuan();

    HopDong(String tenNguoiMua, String tenNguoiThuHuong, int thoiHanHD, long giaTriHD, int ngay, int thang, int nam, int Id) { 
        setTenNguoiMua(tenNguoiMua);
        setTenNguoiThuHuong(tenNguoiThuHuong);
        setThoiHanHD(thoiHanHD);
        setGiaTriHD(giaTriHD);
        setId(Id);
        ngayMua = LocalDate.of(nam, thang, ngay);
    }
    public LocalDate thoihanHD() {
        return ngayMua.plusMonths(thoiHanHD);
    }

    public void inThongTin() {
        System.out.println("\nThong tin cua khach hang "+Id);
        System.out.println("Ten nguoi mua: " + tenNguoiMua);
        System.out.println("Ten nguoi thu huong: "+tenNguoiThuHuong);
        System.out.println("Gia tri hop dong: "+giaTriHD);
        System.out.println("Ngay mua:"+ngayMua.getDayOfMonth()+"/"+ngayMua.getMonthValue()+"/"+ngayMua.getYear());
        System.out.println("Thoi han: "+thoiHanHD+" thang\n");
    }

}
