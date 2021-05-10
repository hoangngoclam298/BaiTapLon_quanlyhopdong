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

    public abstract void inThongTin() ;
    
    public void suaThongTin(String tenNguoiMua, String tenNguoiThuHuong, int thoiHanHD, long giaTriHD, int ngay, int thang, int nam) {
        this.tenNguoiMua = tenNguoiMua;
        this.tenNguoiThuHuong = tenNguoiThuHuong;
        this.thoiHanHD = thoiHanHD;
        this.giaTriHD = giaTriHD;
        ngayMua = LocalDate.of(nam, thang, ngay);
    }

    public abstract int checkLoai(); 

    public boolean checkEqual(int loaiHopDong, String tenNguoiMua, String tenNguoiThuHuong, int thoiHanHD, long giaTriHD, int ngay, int thang, int nam){
        if(loaiHopDong!=checkLoai())                                return false;
        if(!this.tenNguoiMua.equals(tenNguoiMua))                   return false;
        if(!this.tenNguoiThuHuong.equals(tenNguoiThuHuong))         return false;
        if(this.thoiHanHD!=thoiHanHD)                               return false;       
        if(this.giaTriHD!=giaTriHD)                                 return false;       
        LocalDate tmp = LocalDate.of(nam, thang, ngay);
        if( !( this.ngayMua.isEqual(tmp) ) )                        return false;       
        return true;
    }
}