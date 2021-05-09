package quanlyhopdong;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

public class ListHD {
    public LinkedList <HopDong> list;

    public static Scanner scan = new Scanner(System.in);

    public void themHopDong(){
        boolean check=true;
        while(check){
            int loaiHopDong=Integer.parseInt(scan.nextLine());
            String nguoiMua=scan.nextLine();
            String nguoiHuongThu=scan.nextLine();
            long giaTri=Long.parseLong(scan.nextLine());
            int ngay=Integer.parseInt(scan.nextLine());
            int thang=Integer.parseInt(scan.nextLine());
            int nam=Integer.parseInt(scan.nextLine());
            int thoiHan=Integer.parseInt(scan.nextLine());
            if( loaiHopDong==0 ){                
                HopDong tmp = new HDCoBan(nguoiMua, nguoiHuongThu, thoiHan, giaTri, ngay, thang, nam);       // upcasting
                if(list.contains(tmp)) System.out.println("Co hop dong trung du lieu\nVui long nhap lai.");
                else {
                    check = false;
                    list.add(tmp);
                }
            }
            else {
                HopDong tmp = new HDNangCao(nguoiMua, nguoiHuongThu, thoiHan, giaTri, ngay, thang, nam);       // upcasting
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
        System.out.println("Nhap so thu tu hop dong ban can xoa!");
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
            String nguoiHuongThu=scan.nextLine();
            long giaTri=Long.parseLong(scan.nextLine());
            int ngay=Integer.parseInt(scan.nextLine());
            int thang=Integer.parseInt(scan.nextLine());
            int nam=Integer.parseInt(scan.nextLine());
            int thoiHan=Integer.parseInt(scan.nextLine());
            if( loaiHopDong==0 ){                
                HopDong tmp = new HDCoBan(nguoiMua, nguoiHuongThu, thoiHan, giaTri, ngay, thang, nam);       
                if( list.indexOf(tmp)==-1 ) {
                	System.out.println(list.indexOf(tmp));
                	tmp.inThongTin();
                    System.out.println("Khong ton tai hop dong, nhap lai: ");
                }
                else{
                    list.remove(tmp);
                    check=false;
                }
            }
            else {
                HopDong tmp = new HDNangCao(nguoiMua, nguoiHuongThu, thoiHan, giaTri, ngay, thang, nam);       
                for(HopDong tmp1:list) {
                	if(tmp==tmp1) {
                		list.remove(tmp1);
                	}
                	else System.out.println("deo co chuyen kia dau");
                }        
            }
        }
    }

    public void suaHopDong() {
        System.out.println("Sua hop dong\nNhap thong tin hop dong can sua");
        boolean check=true;
        while(check){
            int loaiHopDong=Integer.parseInt(scan.nextLine());
            String nguoiMua=scan.nextLine();
            String nguoiHuongThu=scan.nextLine();
            long giaTri=Long.parseLong(scan.nextLine());
            int ngay=Integer.parseInt(scan.nextLine());
            int thang=Integer.parseInt(scan.nextLine());
            int nam=Integer.parseInt(scan.nextLine());
            int thoiHan=Integer.parseInt(scan.nextLine());
            if( loaiHopDong==0 ){                
                HopDong tmp = new HDCoBan(nguoiMua, nguoiHuongThu, thoiHan, giaTri, ngay, thang, nam);       
                if( list.indexOf(tmp)==-1 ) {
                    System.out.println("Khong ton tai hop dong, nhap lai: ");
                }
                else{
                    int index=list.indexOf(tmp);
                    list.remove(index);
                    System.out.println("Nhap thong tin sau khi sua! ");
                    boolean check1=true;
                    while(check1){
                        int loaiHopDong1=Integer.parseInt(scan.nextLine());
                        String nguoiMua1=scan.nextLine();
                        String nguoiHuongThu1=scan.nextLine();
                        long giaTri1=Long.parseLong(scan.nextLine());
                        int ngay1=Integer.parseInt(scan.nextLine());
                        int thang1=Integer.parseInt(scan.nextLine());
                        int nam1=Integer.parseInt(scan.nextLine());
                        int thoiHan1=Integer.parseInt(scan.nextLine());
                        if( loaiHopDong1==0 ){                
                            HopDong tmp1 = new HDCoBan(nguoiMua1, nguoiHuongThu1, thoiHan1, giaTri1, ngay1, thang1, nam1);       // upcasting
                            if(list.contains(tmp1)) System.out.println("Co hop dong trung du lieu\nVui long nhap lai.");
                            else {
                                check = false;
                                list.add(index,tmp1);
                            }
                        }
                        else {
                            HopDong tmp1 = new HDNangCao(nguoiMua1, nguoiHuongThu1, thoiHan1, giaTri1, ngay1, thang1, nam1);       // upcasting
                            if(list.contains(tmp1)) System.out.println("Co hop dong trung du lieu\nVui long nhap lai.");
                            else {
                                check = false;
                                list.add(index,tmp1);
                            }
                        }
                    }
                }
            }
            else {
                HopDong tmp = new HDNangCao(nguoiMua, nguoiHuongThu, thoiHan, giaTri, ngay, thang, nam);       
                if( list.indexOf(tmp)==-1 ) {
                    System.out.println("Khong ton tai hop dong, nhap lai: ");
                }
                else{
                    int index=list.indexOf(tmp);
                    list.remove(index);
                    System.out.println("Nhap thong tin sau khi sua! ");
                    boolean check1=true;
                    while(check1){
                        int loaiHopDong1=Integer.parseInt(scan.nextLine());
                        String nguoiMua1=scan.nextLine();
                        String nguoiHuongThu1=scan.nextLine();
                        long giaTri1=Long.parseLong(scan.nextLine());
                        int ngay1=Integer.parseInt(scan.nextLine());
                        int thang1=Integer.parseInt(scan.nextLine());
                        int nam1=Integer.parseInt(scan.nextLine());
                        int thoiHan1=Integer.parseInt(scan.nextLine());
                        if( loaiHopDong1==0 ){                
                            HopDong tmp1 = new HDCoBan(nguoiMua1, nguoiHuongThu1, thoiHan1, giaTri1, ngay1, thang1, nam1);       // upcasting
                            if(list.contains(tmp1)) System.out.println("Co hop dong trung du lieu\nVui long nhap lai.");
                            else {
                                check = false;
                                list.add(index,tmp1);
                            }
                        }
                        else {
                            HopDong tmp1 = new HDNangCao(nguoiMua1, nguoiHuongThu1, thoiHan1, giaTri1, ngay1, thang1, nam1);       // upcasting
                            if(list.contains(tmp1)) System.out.println("Co hop dong trung du lieu\nVui long nhap lai.");
                            else {
                                check = false;
                                list.add(index,tmp1);
                            }
                        }
                    }
                }





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
        for(HopDong tmp: list){
            if( tmp.getThoiHanHD() == thoiHanHopDong )     tmp.inThongTin();
        }
    }

    public void thongKe(int ngayStart, int thangStart, int namStart, int ngayEnd, int thangEnd, int namEnd){
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
