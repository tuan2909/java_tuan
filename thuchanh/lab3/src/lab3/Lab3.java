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
public class Lab3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
}
