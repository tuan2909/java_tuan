/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TUAN
 */
public class lab5 {

    public static int n;
    public static int phanTu[];
    public static double tong, dem, trungBinh, diem[];
    public static Scanner Sc = new Scanner(System.in);
    public static String ten[];

    static void danhSachBai5() {
        System.out.println("Lab 1:");
        System.out.println("(1)Bài 1:Viết chương trình nhập mảng số nguyên từ bàn phím.\n Xuất phần tử có giá trị nhỏ nhất ra màn hình \n Tính và xuất ra màn hình trung bình cộng các phần tử chia hết cho 3 \n Sắp xếp và xuất mảng vừa nhập ra màn hình.  ");
        System.out.println("(2)Bài 2: Viết chương trình cho phép nhập họ và tên sinh viên, DTB từ bàn phím ");
        System.out.println("(3)Thoát.");
    }

    static void menuBai5() {
        while (true) {
            danhSachBai5();
            int lCBai5 = keyBoard.readInt("Nhập lựa chọn: ");
            switch (lCBai5) {
                case 1:
                    bai5_1();
                    break;
                case 2:
                    bai5_2();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }

    static void bai5_1() {
        n = keyBoard.readInt("Nhập số phần tử của mảng: ");
        System.out.println(" Nhập phần tử: ");
        phanTu = new int[n];
        for (int i = 0; i < n; i++) {
            phanTu[i] = keyBoard.readInt("Phần tử thứ" + i + ": ");
            if (phanTu[i] % 3 == 0) {
                tong += phanTu[i];
                dem++;
                trungBinh = tong / dem;
            }
        }
        System.out.println("Trung bình cộng các số chia hết cho 3 là: " + trungBinh);
    }

    static void bai5_2() {

        System.out.print("Nhập số sinh viên: ");
        int n = Sc.nextInt();
        ten = new String[n];
        diem = new double[n];
        System.out.println("Nhập thông tin");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập tên sinh viên: ");
            ten[i] = Sc.next();
            System.out.println("Nhập điểm sinh viên: ");
            diem[i] = Sc.nextDouble();
        }
        for (int i = 0; i < diem.length - 1; i++) {
            for (int j = i + 1; j < diem.length; j++) {
                if (diem[i] > diem[j]) {
                    double temp = diem[i];
                    diem[i] = diem[j];
                    diem[j] = temp;
                    String tempTen = ten[i];
                    ten[i] = ten[j];
                    ten[j] = tempTen;

                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Họ Tên Sinh viên: " + ten[i] + ", Điểm của sinh viên: " + diem[i]);
            if (diem[i] < 5) {
                System.out.println("Xếp loại yếu");
            } else if (diem[i] < 6.5) {
                System.out.println("Xếp loại trung bình");
            } else if (diem[i] < 7.5) {
                System.out.println("Xếp loại khá");
            } else if (diem[i] < 9) {
                System.out.println("Xếp loại giỏi");
            } else if (diem[i] >= 9 && diem[i] <= 10) {
                System.out.println("Xếp loại xuất sắc");
            }
        }
    }
}
