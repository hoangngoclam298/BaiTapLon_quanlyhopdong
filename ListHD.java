package quanlyhopdong;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;

public class ListHD {
    public LinkedList <HopDong> list;

    public static Scanner scan = new Scanner(System.in);

    public void themHopDong(){
        System.out.println("Them du lieu\nNhap du lieu !");
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
                int id = list.size() + 1;
                HopDong tmp = new HDCoBan(nguoiMua, nguoiHuongThu, thoiHan, giaTri, ngay, thang, nam, id);       // upcasting
                if(list.contains(tmp)) System.out.println("Co hop dong trung du lieu\nVui long nhap lai.");
                else {
                    check = false;
                    list.add(tmp);
                }
            }
            else {
                int id = list.size() + 1;
                HopDong tmp = new HDNangCao(nguoiMua, nguoiHuongThu, thoiHan, giaTri, ngay, thang, nam, id);       // upcasting
                if(list.contains(tmp)) System.out.println("Co hop dong trung du lieu\nVui long nhap lai.");
                else {
                    check = false;
                    list.add(tmp);
                }
            }
            //tmp.inThongTin();
        }
        
    }

    public void inDanhSach(){
        for(HopDong tmp: list){
            tmp.inThongTin();
        }
    }

    public void timHopDong(int thoiHanHopDong){
        for(HopDong tmp: list){
            if( tmp.getThoiHanHD() ==thoiHanHopDong )     tmp.inThongTin();
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
