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
public class lab3 {

    public static double a, b, c;
    public static int soDien;

    static void danhSachBai3() {
        System.out.println("Lab 3:");
        System.out.println("(1)Bài 1: Viết chương trình cho phép giải phương trình bậc nhất trong đó các hệ số a và b nhập từ bàn phím.");
        System.out.println("(2)Bài 2: Viết chương trình cho phép giải phương trình bậc hai trong đó các hệ số a, b và c nhập từ bàn phím.");
        System.out.println("(3)Bài 3: Viết chương trình nhập vào số điện sử dụng của tháng và tính tiền điện.");
        System.out.println("(4)Thoát.");
    }

    static void menuBai3() {
        while(true)
        {
            danhSachBai3();
            int lCBai3 = keyBoard.readInt("Nhập lựa chọn: ");
            switch (lCBai3) {
                case 1:
                    bai3_1();
                    break;
                case 2:
                    bai3_2();
                    break;
                case 3:
                    bai3_3();
                    break;
                case 4:
                    Test.menu();
                    break;
            }
        }
    }

    static void bai3_1() {
        a = keyBoard.readDouble("Nhập số a: ");
        b = keyBoard.readDouble("Nhập số b: ");
        sS3_1();
    }

    static void sS3_1() {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm!");
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
        } else {
            System.out.println("Nghiệm của phương trình là: " + (-b / a));
        }
    }

    static void bai3_2() {
        a = keyBoard.readDouble("Nhập số a: ");
        b = keyBoard.readDouble("Nhập số b: ");
        c = keyBoard.readDouble("Nhập số c: ");
        Denlta();
    }

    static void Denlta() {
        if (a == 0) {
            System.out.println("Nghiệm của phương trình là: " + (-b / a));
        } else if (a != 0) {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm!");
            }
            if (delta == 0) {
                System.out.println("Phương trình có nghiệm kép: " + (-b / (2 * a)));
            }
            if (delta > 0) {
                System.out.println("Phương trình có 2 nghiệm phân biệt: ");
                System.out.printf("X1: " + (-b + Math.sqrt(delta)) / (2 * a) + "\nX2: " + (-b - Math.sqrt(delta)) / (2 * a) + "");
            }
        }
    }

    static void bai3_3() {
        soDien = keyBoard.readInt("Nhập số điện: ");
        sSDien();
    }

    static void sSDien() {
        int i = 1;
        do {
            if (soDien > 0 && soDien < 50) {
                System.out.println("Tiền điện là: " + (soDien * 1000));
            } else if (soDien > 50) {
                System.out.println("Tiền điện là: " + (50 * 1000 + (soDien - 50) * 1200));
            } else {
                i = 0;
                System.out.println("Nhập sai vui lòng nhập lại!!");
            }
        } while (i != i);
    }
}
