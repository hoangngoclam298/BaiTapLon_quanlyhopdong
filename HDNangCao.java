package quanlyhopdong;

public class HDNangCao extends HopDong {
    public HDNangCao(String tenNguoiMua, String tenNguoiThuHuong, int thoiHanHD, long giaTriHD, int ngay, int thang, int nam) {
        super(tenNguoiMua, tenNguoiThuHuong, thoiHanHD, giaTriHD, ngay, thang, nam);
    }
    public long loiNhuan() {
        return super.getGiaTriHD()/100l*17l + 1000000l;
    }
}
