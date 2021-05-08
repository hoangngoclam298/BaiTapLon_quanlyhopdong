package quanlyhopdong;

public class HDCoBan extends HopDong {
    public HDCoBan(String tenNguoiMua, String tenNguoiThuHuong, int thoiHanHD, long giaTriHD, int ngay, int thang, int nam, int Id) {
        super(tenNguoiMua, tenNguoiThuHuong, thoiHanHD, giaTriHD, ngay, thang, nam, Id);
    }
    public long loiNhuan(){
        return super.getGiaTriHD()/10l;
    }
}