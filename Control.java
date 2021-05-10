package quanlyhopdong;

import java.util.LinkedList;

public class Control {
    public static void main (String [] args){
        ListHD listHopDong = new ListHD();
        listHopDong.list = new LinkedList<HopDong>();
        System.out.println("Chao ban !");
        System.out.println("Nhap du lieu");
        listHopDong.themHopDong();
        listHopDong.themHopDong();
        listHopDong.themHopDong();
        listHopDong.inDanhSach();
        //listHopDong.xoaHopDong();
        //listHopDong.inDanhSach();
        //listHopDong.suaHopDong();
        //listHopDong.inDanhSach();

        //listHopDong.xoaHopDongById();
        //listHopDong.inDanhSach();
        //listHopDong.suaHopDongById();
        //listHopDong.inDanhSach();
        listHopDong.timHopDong(18);
        listHopDong.thongKe(1, 1, 2001, 9, 11, 2001);
        
        System.out.println("\n\nTong loi nhuan:"+listHopDong.tienHopDong());
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
1
Hoang Nhat Nam
Hoang Thi Thu Huong
15000000
16
10
2001
18

1
Nguyen Trung Kien
Nguyen Thi Yen
20000000
10
12
2001
20

0
Hoang Ngoc Lam
Pham Minh Nguyet
10000000
2
1
2001
24

1
Hoang Ngoc Lam
Pham Minh Nguyet
30000000
2
1
2001
24

*/
// xong ngon lanh r
// check pass 2