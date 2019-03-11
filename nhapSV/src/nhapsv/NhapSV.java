/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhapsv;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TUAN
 */
public class NhapSV {

    /**
     * @param args the command line arguments
     */
    public static String hoTen[];
    public static int soHS;
    public static Scanner sc = new Scanner(System.in);
    public static double diem[];
    public static double height[];
    public static double trungBinh = 0;
public static int i;
    public static void main(String[] args) {
        // TODO code application logic here
        nhapSV();
        thongTinSV();
        dienTB();
    }

    public static void nhapSV() {
        System.out.println(" Nhập số học sinh:");
        soHS = sc.nextInt();
        hoTen = new String[50];
        diem = new double[50];
        height = new double[50];
        for (int i = 0; i < soHS; i++) {
            System.out.print("Họ và tên học sinh thứ " + (i + 1) + ":");
            hoTen[i] = keyBoard.readString("");
            System.out.print("Điểm học sinh thứ: " + (i + 1) + ":");
            diem[i] = sc.nextDouble();
            System.out.print(" Cân nặng của học sinh thứ" + (i + 1) + ": ");
            height[i] = keyBoard.readDouble("");

        }
    }

    public static void thongTinSV() {
        for (int i = 0; i < soHS; i++) {
            System.out.println("Họ và Tên SV: " + hoTen[i]);
            System.out.println("Điểm Sv: " + diem[i]);
            System.out.println("Cân nặng SV:" + height[i]);
        }
    }

    public static void dienTB() {
        System.out.println("Điểm TB");
        double tong = 0;
        double dem = 0;
        for ( i = 0; i < height.length; i++) {
            tong += height[i];
            dem++;
            trungBinh = tong / dem;

        }
        System.out.println("\ncân nặng của sv là" + (i + 1) + " là:" + trungBinh);
    }

    public static void hSMin() {
        for (int i = 0; i < diem.length; i++) {
            if (diem[i] > 1) {

            }
        }
    }
}
