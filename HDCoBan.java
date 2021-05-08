package quanlyhopdong;

public class HDCoBan extends HopDong {
    public HDCoBan(String tenNguoiMua, String tenNguoiThuHuong, int thoiHanHD, long giaTriHD, int ngay, int thang, int nam) {
        super(tenNguoiMua, tenNguoiThuHuong, thoiHanHD, giaTriHD, ngay, thang, nam);
    }
    public long loiNhuan(){
        return super.getGiaTriHD()/10l;
    }
}