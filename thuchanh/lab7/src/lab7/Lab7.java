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
public class Lab7 {

    /**
     * @param args the command line arguments
     */
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
//        nhapMatKhau();
        soSanh();
    }

    public static void nhapMatKhau() {
        System.out.println("Nhập user name:");
        String userName = sc.nextLine();
        System.out.println("Nhập password:");
        String pass = sc.nextLine();
        if (userName.equalsIgnoreCase("hello") && pass.length() > 6) {
            System.out.println("Chúc mừng bạn đã đăng nhập  thành công");
        } else {
            System.out.println("Bạn đã nhập sai cú pháp");
        }

    }

    public static void soSanh() {
        String string1 = "sinh viên cntt";
        String string2 = "SINH VIÊN CNTT";
        System.out.println("" + string1.toUpperCase());
        if (string1.equals(string2)) {
            System.out.println("Hai chuỗi bằng nhau");
        } else {
            System.out.println("Hai chuỗi không bằng nhau");
        }
        if (string2.equalsIgnoreCase(string1)) {
            System.out.println("Hai chuỗi bằng nhau");

        } else {
            System.out.println("hai chuỗi không bằng nhau");
        }
    }
}
