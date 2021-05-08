package quanlyhopdong;

public class HDNangCao extends HopDong {
    public HDNangCao(String tenNguoiMua, String tenNguoiThuHuong, int thoiHanHD, long giaTriHD, int ngay, int thang, int nam, int Id) {
        super(tenNguoiMua, tenNguoiThuHuong, thoiHanHD, giaTriHD, ngay, thang, nam, Id);
    }
    public long loiNhuan() {
        return super.getGiaTriHD()/100l*17l + 1000000l;
    }
}
