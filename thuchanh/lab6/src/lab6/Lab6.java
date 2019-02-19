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
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
//        vd();
//        vd2();
//        bai1();
        bai2();
    }

    static void vd() {
        double so = 5 + 7 * Math.random();
        int rand = (int) Math.round(so);
        System.out.printf("Số ngẫu nhiên:%.0f", so);
    }

    static void vd2() {
        System.out.print("Nhập số a:");
        int a = sc.nextInt();
        System.out.print("Nhập số b:");
        int b = sc.nextInt();
        double x = Math.pow(a, b);
        System.out.print("a lũy thừa b là:" + x);
        System.out.println("");
        double y = Math.min(a, b);
        System.out.print("giá trị nhỏ nhất là:" + y);
    }

    static void bai1() {
        System.out.println("Nhập số a");
        double a = sc.nextDouble();
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

    static void bai2() {
        System.out.print("Nhập điểm:");
        double diem = sc.nextDouble();
        String hocLuc = keyBoard.xepLoai(diem);
        System.out.println(hocLuc);
    }



}
    

