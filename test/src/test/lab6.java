/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author NGUYEN TUAN
 */
public class lab6 {

    public static Scanner sc = new Scanner(System.in);

    static void danhSachBai6() {
        System.out.println("Lab 1:");
        System.out.println("(1)Bài 1: Sử dụng các hàm Math để thực hiện các yêu cầu sau. \n"
                + " Nhập vào 1 số thực a từ bàn phìm và sinh số thực ngẫu nhiên b từ 5 đến 20\n Xuất ra các thông tin sau\n o Số nhỏ nhất trong 2 số\n o a lũy thừa b\n o Làm tròn b và xuất ra màn hình ");
        System.out.println("(2)Bài 2: Viết chương trình nhập điểm từ bàn phím. Viết một hàm để xếp loại học lực theo điểm. Sau đó gọi ham để lấy loại học lực. ");
        System.out.println("(3)Thoát.");
    }

    static void menuBai6() {
        while (true) {
            danhSachBai6();
            int lCBai6 = keyBoard.readInt("Nhập lựa chọn: ");
            switch (lCBai6) {
                case 1:
                    bai6_1();
                    break;
                case 2:
                    bai6_2();
                    break;
                case 3:
                    bai6_3();
                    break;
                case 4:
                    bai6_4();
                    break;
                case 5:
                    Test.menu();
                    break;
            }
        }
    }

    static void bai6_1() {
        int a = keyBoard.readInt("Nhập số a: ");
        double b;
        b = 5 + 15 * Math.random();
        int rand = (int) Math.round(b);
        System.out.printf("Số ngẫu nhiên b :%.0f", b);
        System.out.println("");
        int min = (int) Math.min(a, b);
        System.out.print("Số nhỏ nhất là:" + min);
        int pow = (int) Math.pow(a, b);
        System.out.print("\nlũy thừa của a và b là:" + pow);
    }

    static void bai6_2() {
        double diem;
        do {
            diem = keyBoard.readDouble("Nhập điểm: ");
            String hocLuc = keyBoard.xepLoai(diem);
            System.out.println(hocLuc);
        } while (diem > 0);
    }

    static void bai6_3() {
        String fullname = keyBoard.readString("Họ và Tên:");
        int age = keyBoard.readInt("Nhập tuổi:");
        keyBoard.readDouble("Nhập điểm");
        String gioiTinh = keyBoard.readString("Giới Tính:");
    }

    static void bai6_4() {
        int n = keyBoard.readInt("Nhập 5 phần tử của mảng");
        System.out.println("Các phần tử của mảng:");
        double a[] = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = keyBoard.readDouble("a[" + i + "]: ");
        }
        double b[] = xarrays.swap(a, 2, 4);
        System.out.print("các phần tử của mảng sau khi thay đổi:" + Arrays.toString(b));
        double d = xarrays.min(a);
        System.out.println("\nphần tử nhỏ nhất là" + d);
        double[] e = xarrays.remove(a, 3);
        System.out.println("Phân tử thứ 3 sau khi xóa là" + Arrays.toString(e));
        System.out.println("nhập phần tử thêm vào mảng");
        double c[] = xarrays.add(e, sc.nextDouble());
        System.out.println("các phần tử của mảng sau khi thay đổi:" + Arrays.toString(c));

    }
}
