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
public class keyBoard {

    public static Scanner sc = new Scanner(System.in);

    public static String readString(String message) {
        System.out.print(message);
        String chuoi = sc.next();
        return chuoi;
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
     public static String readString1(String message, String regex, String xacNhan) {
        int a = 1;
        String bien="";
        do {
            System.out.println(message);
            bien = sc.nextLine();
            
            if (!bien.matches(regex)) {
                a = 0;
                System.out.println(xacNhan);
            }
            else{
                 a=1;   
                    }
        } while (a != 1);

        return bien;
    }
}
