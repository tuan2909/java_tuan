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
public class bai5 {

    public static void main(String[] args) {
        menu();

    }

    static void menu() {
        System.out.println("1. Giải phương trình bậc nhất ");
        System.out.println("2. Giải phương trình bậc 2  ");
        System.out.println("3. Tính tiền điện  ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Lựa chọn:");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                giaiPTB1();
                break;
            case 2:
                giaiPTB2();
                break;
            case 3:
                giaiPTB3();
                break;
        }

    }

    static void giaiPTB1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập giá trị a:");
        double a = sc.nextDouble();
        System.out.print("Nhập giá trị b:");
        double b = sc.nextDouble();
        double x = -b / a;
        if (a == 0) {
            if (b == 0) {
                System.out.print("vô số ngiệm");

            } else {
                System.out.print("vô nghiệm");
            }
        } else {
            System.out.print("kết quả" + x);
        }

    }

    static void giaiPTB2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số giá trị a:");
        double a = sc.nextDouble();
        System.out.print("Nhập giá trị b:");
        double b = sc.nextDouble();
        System.out.print("Nhập giá trị c:");
        double c = sc.nextDouble();
        if (a == 0) {
            System.out.println("Kết quả:" + (-b / a));
        }
        if (a != 0) {
            double delTa = b * b - 4 * a * c;
            System.out.println("Delta=" + delTa);
            if (delTa < 0) {
                System.out.println("vô nghiệm");
                if (delTa == 0) {
                    System.out.println("nghiệm kép" + (-b / (2 * a)));
                    if (delTa > 0) {
                        System.out.println("phương trình có 2 nghiệm phân biêt:");
                        double x1 = (((-b + sprt(delTa))) / (2 * a));
                        double x2 = (((-b - sprt(delTa))) / (2 * a));
                        System.out.println("nghiệm của phương trình :" + x1 + " " + x2);

                    }
                }
            }

        }
    }

    static void giaiPTB3() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện:");
        int sodien = sc.nextInt();

        if (sodien < 50) {
            System.out.println("số tiền là :" + (sodien * 1000));

        } else {
            System.out.println("số tiền là" + (50 * 1000 + (sodien - 50) * 1200));
        }
    }

    private static double sprt(double delTa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
