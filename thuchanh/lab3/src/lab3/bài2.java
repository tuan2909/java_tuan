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
public class bài2 {

    public static void main(String[] args) {
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

    private static double sprt(double delTa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
