package quanlyhopdong;

import java.util.LinkedList;

public class Control {
    public static void main (String [] args){
        ListHD listHopDong = new ListHD();
        listHopDong.list = new LinkedList<HopDong>();
        System.out.println("Chao ban !");
        System.out.println("Nhap du lieu");
        listHopDong.themHopDong();
        System.out.println("Nhap du lieu tiep");
        listHopDong.themHopDong();
        System.out.println("\nDanh sach hop dong:\n");
        listHopDong.inDanhSach();
        System.out.println("\nTong loi nhuan:"+listHopDong.tienHopDong());
    }
}
/*
0
Hoang Ngoc Lam
Pham Minh Nguyet
10000000
2
1
2001
24

1
Nguyen Trung Kien
Nguyen Thi Yen
20000000
10
12
2001
20

*/
// xong ngon lanh r
