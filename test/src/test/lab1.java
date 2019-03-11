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
public class lab1 {



    static void danhSachBai1() {
        System.out.println("Lab 1:");
        System.out.println("(1)Bài 1: Tính diện tích hình chữ nhật");
        System.out.println("(2)Bài 2: Viết chương trình cho phép nhập họ và tên sinh viên, DTB từ bàn phím ");
        System.out.println("(3)Thoát.");
    }

    static void menuBai1() {
        while(true){
            danhSachBai1();
            int lCBai1 = keyBoard.readInt("Nhập lựa chọn: ");
            switch (lCBai1) {
                case 1:
                    bai1_1();
                    break;
                case 2:
                    bai1_2();
                    break;
                case 3:
                 Test.menu();
                    break;
            }
        }
    }

    static void bai1_1() {
        double rong = keyBoard.readDouble("Nhập chiều rộng: ");
        double dai = keyBoard.readDouble("Nhập chiều dài: ");
        double dienTich = rong * dai;
        System.out.println("Diện tích hình chữ nhật là: " + dienTich);
    }

    static void bai1_2() {
        String hoTen1 = keyBoard.readString("Nhập họ và tên: ");
        double diemTB1 = keyBoard.readDouble("Nhập điểm trung bình: ");
        System.out.println("========================");
        System.out.println("Họ và tên: " + hoTen1);
        System.out.println("Điểm trung bình: " + diemTB1);
    }
}
