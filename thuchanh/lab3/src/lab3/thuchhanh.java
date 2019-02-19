/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TUAN
 */
public class thuchhanh {

    public static void main(String[] args) {
     menu();
    }

    static void menu() {
        System.out.println("1.phép cộng");
        System.out.println("2.phép trừ");
        System.out.println("3.kết thúc");
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chức năng");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                hamCong();
                break;
            case 2:
                hamTru();
                break;
            case 3:
                System.exit(0);
                break;
        }
    }

    static void hamCong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số a:");
        double a = sc.nextDouble();
        System.out.print("nhập số b:");
        double b = sc.nextDouble();
        double c = a + b;
        System.out.println("kết quả:" + c);
    }

    static void hamTru() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số a:");
        double a = sc.nextDouble();
        System.out.print("nhập số b:");
        double b = sc.nextDouble();
        double c = a - b;
        System.out.println("kết quả:" + c);
    }
}
