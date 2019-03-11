/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author NGUYEN TUAN
 */
public class lab2 {

    static void danhSachBai2() {
        System.out.println("Lab 2:");
        System.out.println("(1)Bài 1: Viết chương trình nhập từ bàn phím thông tin mua sản phẩm");
        System.out.println("(2)Bài 2: Viết chương trình nhập từ bàn phím bán đường kính của một đường tròn và xuất diện tích và chu vi của đường tròn đó.");
        System.out.println("(3)Thoát.");
    }

    static void menuBai2() {
        while (true) {
            danhSachBai2();
            int lCBai2 = keyBoard.readInt("Nhập lựa chọn: ");
            switch (lCBai2) {
                case 1:
                    bai2_1();
                    break;
                case 2:
                    bai2_2();
                    break;
                default:
                    Test.menu();
                    break;
            }
        }
    }

    static void bai2_1() {
        String tenSP2 = keyBoard.readString("Nhập tên sản phẩm: ");
        double donGia2 = keyBoard.readDouble("Đơn giá: ");
        int SL2 = keyBoard.readInt("Số lượng: ");
        System.out.println("===================");
        System.out.println("Tên sản phẩm: " + tenSP2);
        System.out.println("Đơn Giá " + donGia2);
        System.out.println("Số Lượng: " + SL2);
        System.out.println("Thuế nhập khẩu: " + ((donGia2 * SL2) * 10 / 100));
    }

    static void bai2_2() {
        double banKinh = keyBoard.readDouble("Nhập bán kính: ");
        double cV, dT;
        cV = (banKinh * banKinh) * 3.14;
        dT = 3.14 * Math.pow(banKinh, 2);
        System.out.println("====================");
        System.out.println("Chu vi hình tròn là: " + cV);
        System.out.println("Diện tích hình tròn là: " + dT);
    }
}
