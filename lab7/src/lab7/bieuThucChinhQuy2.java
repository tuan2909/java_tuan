/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TUAN
 */
public class bieuThucChinhQuy2 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        System.out.println("Nhập số mobie:");
//        String soDT = sc.nextLine();
////        String bieuThuc = "0[0-9]{9,10}";
//        String bieuThuc = "5\\d-[A-Z]\\d-((\\d{4})|(\\d{3}\\.\\d{2}))";
//        if (soDT.matches(bieuThuc)) {
//            System.out.println("đúng");
//        } else {
//            System.out.println("sai");
//        }
//        thuchanh();
        email();
    }

    static void thuchanh() {
        System.out.println("Nhập biểu thức");
        String soBieuThuc = sc.nextLine();
        String bieuThuc = "PT\\d{5}-[A-Z]{3}-\\w{7}";
        if (soBieuThuc.matches(bieuThuc)) {
            System.out.println("đúng");
        } else {
            System.out.println("Sai");
        }
    }

    static void email() {
        int flag = 1;
        do {
            System.out.println("Nhập email");
            String email = sc.nextLine();
            String bieuThuc = "\\w+@\\w+(\\.\\w+){1,2}";
            if (email.matches(bieuThuc)) {
                System.out.println("đúng");
            } else if (!email.matches(bieuThuc)) {
                flag = 0;
                System.out.println("Sai");
            }
        } while (flag != 1);
    }
}
