package quanlyhopdong;

import java.time.LocalDate;

public class HDNangCao extends HopDong {
    public HDNangCao(String tenNguoiMua, String tenNguoiThuHuong, int thoiHanHD, long giaTriHD, int ngay, int thang, int nam) {
        super(tenNguoiMua, tenNguoiThuHuong, thoiHanHD, giaTriHD, ngay, thang, nam);
    }

    public void inThongTin() {
        System.out.println("Loai hop dong nang cao");
        System.out.println("Thong tin cua khach hang ");
        System.out.println("Ten nguoi mua: " + super.getTenNguoiMua());
        System.out.println("Ten nguoi thu huong: "+super.getTenNguoiThuHuong());
        System.out.println("Gia tri hop dong: "+super.getGiaTriHD());
        LocalDate ngayMua = super.getNgayMua();
        System.out.println("Ngay mua:"+ngayMua.getDayOfMonth()+"/"+ngayMua.getMonthValue()+"/"+ngayMua.getYear());
        System.out.println("Thoi han: "+super.getThoiHanHD()+" thang\n");
    }

    public int checkLoai(){
        return 1;
    }

    public long loiNhuan() {
        return super.getGiaTriHD()/100l*17l + 1000000l;
    }
}
