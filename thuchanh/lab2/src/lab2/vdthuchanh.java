/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import static java.lang.Double.max;
import java.util.Scanner;

/**
 *
 * @author NGUYEN TUAN
 */
public class vdthuchanh {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int a, b, c;
//        System.out.print("nhâp a:");
//        a = scanner.nextInt();
//        System.out.print("nhâp b:");
//        b = scanner.nextInt();
//        System.out.print("nhâp c:");
//        c = scanner.nextInt();
//        boolean ketQua;
//        ketQua = (a + b > c && a + c > b && b + c > a) ? true : false;
//        System.out.println("" + ketQua);
        int a;
        System.out.print("nhập vào a:");
        a = scanner.nextInt();
        System.out.print("nhập vào b:");
        int b = scanner.nextInt();
        if (a > b) {
            System.out.println("ket qua a:" + a);
        } else if (b == a) {
            System.out.println("2 thằng bằng nhau");
        } else {
            System.out.println("kết quả" + b);
        }

    }
}
