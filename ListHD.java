package quanlyhopdong;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

public class ListHD {
    public LinkedList <HopDong> list;

    public static Scanner scan = new Scanner(System.in);

    public int checkIndex(int loaiHopDong, String nguoiMua, String nguoiThuHuong, int thoiHan, long giaTri, int ngay, int thang, int nam){
        for(int i=0; i<list.size(); i++){
            HopDong tmp = list.get(i);
            if(tmp.checkEqual(loaiHopDong, nguoiMua, nguoiThuHuong, thoiHan, giaTri, ngay, thang, nam)) return i;
        }
        return -1;
    } 

    public void themHopDong(){
        boolean check=true;
        while(check){
            int loaiHopDong=Integer.parseInt(scan.nextLine());
            String nguoiMua=scan.nextLine();
            String nguoiThuHuong=scan.nextLine();
            long giaTri=Long.parseLong(scan.nextLine());
            int ngay=Integer.parseInt(scan.nextLine());
            int thang=Integer.parseInt(scan.nextLine());
            int nam=Integer.parseInt(scan.nextLine());
            int thoiHan=Integer.parseInt(scan.nextLine());
            if( loaiHopDong==0 ){                
                HopDong tmp = new HDCoBan(nguoiMua, nguoiThuHuong, thoiHan, giaTri, ngay, thang, nam);       // upcasting
                if(list.contains(tmp)) System.out.println("Co hop dong trung du lieu\nVui long nhap lai.");
                else {
                    check = false;
                    list.add(tmp);
                }
            }
            else {
                HopDong tmp = new HDNangCao(nguoiMua, nguoiThuHuong, thoiHan, giaTri, ngay, thang, nam);       // upcasting
                if(list.contains(tmp)) System.out.println("Co hop dong trung du lieu\nVui long nhap lai.");
                else {
                    check = false;
                    list.add(tmp);
                }
            }
            //tmp.inThongTin();
        }
        
    }

    public void xoaHopDongById() {
        System.out.println("Xoa hop dong");
        //tim hop dong can xoa
        System.out.println("Nhap so thu tu hop dong ban can xoa!");
        int index = Integer.parseInt(scan.nextLine());
        list.remove(index-1);
    }

    public void suaHopDongById() {
        System.out.println("Sua hop dong");
        System.out.println("Nhap so thu tu hop dong ban can sua va thong tin moi!");
        int index = Integer.parseInt(scan.nextLine());
        int loaiHopDong=Integer.parseInt(scan.nextLine());
        String tenNguoiMua=scan.nextLine();
        String tenNguoiThuHuong=scan.nextLine();
        long giaTriHD=Long.parseLong(scan.nextLine());
        int ngay=Integer.parseInt(scan.nextLine());
        int thang=Integer.parseInt(scan.nextLine());
        int nam=Integer.parseInt(scan.nextLine());
        int thoiHanHD=Integer.parseInt(scan.nextLine());
        list.remove(index-1);
        if(loaiHopDong==0){ 
            HopDong tmp = new HDCoBan(tenNguoiMua, tenNguoiThuHuong, thoiHanHD, giaTriHD, ngay, thang, nam);
            list.add(index-1, tmp);
        }
        else {
            HopDong tmp = new HDNangCao(tenNguoiMua, tenNguoiThuHuong, thoiHanHD, giaTriHD, ngay, thang, nam);
            list.add(index-1, tmp);
        }
    }

    public void xoaHopDong() {
        System.out.println("Xoa hop dong");
        //tim hop dong can xoa
        System.out.println("Nhap hop dong ban can xoa!");
        boolean check=true;
        while(check){
            int loaiHopDong=Integer.parseInt(scan.nextLine());
            String nguoiMua=scan.nextLine();
            String nguoiThuHuong=scan.nextLine();
            long giaTri=Long.parseLong(scan.nextLine());
            int ngay=Integer.parseInt(scan.nextLine());
            int thang=Integer.parseInt(scan.nextLine());
            int nam=Integer.parseInt(scan.nextLine());
            int thoiHan=Integer.parseInt(scan.nextLine());
            int index = checkIndex(loaiHopDong, nguoiMua, nguoiThuHuong, thoiHan, giaTri, ngay, thang, nam);
            if(index!=-1) {
                list.remove(index);
                check=false;
            }
            else{
                System.out.println("Khong co hop dong nay!\nNhap lai: ");
            }
        }
    }

    public void suaHopDong() {
        System.out.println("Sua hop dong");
        //tim hop dong can xoa
        System.out.println("Nhap hop dong ban can sua!");
        boolean check=true;
        while(check){
            int loaiHopDong=Integer.parseInt(scan.nextLine());
            String nguoiMua=scan.nextLine();
            String nguoiThuHuong=scan.nextLine();
            long giaTri=Long.parseLong(scan.nextLine());
            int ngay=Integer.parseInt(scan.nextLine());
            int thang=Integer.parseInt(scan.nextLine());
            int nam=Integer.parseInt(scan.nextLine());
            int thoiHan=Integer.parseInt(scan.nextLine());
            int index = checkIndex(loaiHopDong, nguoiMua, nguoiThuHuong, thoiHan, giaTri, ngay, thang, nam);
            if(index!=-1) {
                System.out.println("Nhap thong tin moi");
                list.remove(index);
                int loaiHopDong1=Integer.parseInt(scan.nextLine());
                String tenNguoiMua1=scan.nextLine();
                String tenNguoiThuHuong1=scan.nextLine();
                long giaTri1=Long.parseLong(scan.nextLine());
                int ngay1=Integer.parseInt(scan.nextLine());
                int thang1=Integer.parseInt(scan.nextLine());
                int nam1=Integer.parseInt(scan.nextLine());
                int thoiHan1=Integer.parseInt(scan.nextLine());
                if(loaiHopDong1==0){ 
                    HopDong tmp = new HDCoBan(tenNguoiMua1, tenNguoiThuHuong1, thoiHan1, giaTri1, ngay1, thang1, nam1);
                    list.add(index, tmp);
                }
                else {
                    HopDong tmp = new HDNangCao(tenNguoiMua1, tenNguoiThuHuong1, thoiHan1, giaTri1, ngay1, thang1, nam1);
                    list.add(index, tmp);
                }
                check=false;
            }
            else{
                System.out.println("Khong co hop dong nay!\nNhap lai: ");
            }
        }
    }

    public void inDanhSach(){
        for(HopDong tmp: list){
            System.out.println("STT " + (list.indexOf(tmp)+1) + ":");
            tmp.inThongTin();
        }
    }

    public void timHopDong(int thoiHanHopDong){
        System.out.println("Cac hop dong co thoi han "+ thoiHanHopDong +"thang:\n");
        for(HopDong tmp: list){
            if( tmp.getThoiHanHD() == thoiHanHopDong )     tmp.inThongTin();
        }
    }

    public void thongKe(int ngayStart, int thangStart, int namStart, int ngayEnd, int thangEnd, int namEnd){
        System.out.println("Cac han dong trong khoang thoi gian tren:\n");
        LocalDate start=LocalDate.of(namStart, thangStart, ngayStart);
        LocalDate end=LocalDate.of(namEnd, thangEnd, ngayEnd);
        for(HopDong tmp: list){
            if(tmp.getNgayMua().isAfter(start) && tmp.getNgayMua().isBefore(end))       tmp.inThongTin();
        }
    }

    public long tienHopDong(){
        long sum=0;
        for(HopDong tmp: list){
            sum+=tmp.loiNhuan();
        }
        return sum;
    }
    
}
