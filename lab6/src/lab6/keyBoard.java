/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TUAN
 */
public class keyBoard {

    public static Scanner sc = new Scanner(System.in);

//    public static String aaaaa(String message) {
//        System.out.print(message);
//        String gioiTinh;
//        gioiTinh = sc.nextLine();
//        return gioiTinh;
//    }
    public static String readString(String message) {
        System.out.print(message);
        String input = sc.nextLine();
        return input;
    }

    public static int readInt(String message) {
        System.out.print(message);
        int input = sc.nextInt();
        return input;
    }

    public static double readDouble(String message) {
        System.out.print(message);
        double input = sc.nextDouble();
        return input;
    }

    public static String readBoolean(String message) {
        System.out.print(message);
        String input = sc.next();
        return input;
    }

    public static String xepLoai(double diem) {
        String hocLuc = null;
        if ((diem >= 0 && diem < 3)) {
            hocLuc = "Yếu";
        } else if ((diem >= 3 && diem < 5)) {
            hocLuc = "Yếu";
        } else if (diem >= 5 && diem < 6.5) {
            hocLuc = "Trung Bình";
        } else if (diem >= 5 && diem < 7.5) {
            hocLuc = "Khá";
        } else if (diem >= 7.5 && diem < 9) {
            hocLuc = "Giỏi";
        } else if (diem >= 9 && diem <= 10) {
            hocLuc = "Xuất Sắc";
        } else {
            hocLuc = "Nhập sai điểm";
        }
        return hocLuc;
    }

}
