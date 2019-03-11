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
//        soSanh();
        bai1();
//        bai2();
//        bai3();
//        bai3New();
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

    public static void bai1() {
        String hoTen = keyBoard.readString("Nhập họ và tên:");
        int postHo = hoTen.indexOf(" ");
        String ho = hoTen.substring(0, postHo).toUpperCase();
        System.out.println("Họ sau khi in hoa là:" + ho);
        int dem = hoTen.indexOf(" ");
        int dem1 = hoTen.lastIndexOf(" ");
        String tenDem = hoTen.substring(dem, dem1);
        System.out.println("Tên đệm là:" + tenDem);
        int postTen = hoTen.lastIndexOf(" ");
        String ten = hoTen.substring(postTen).toUpperCase();
        System.out.println("Tên sau khi in hoa là:" + ten);
    }

    public static void bai2() {
        int so = 1;
        do {
            System.out.println("Nhập user name:");
            String userName = sc.nextLine();
            System.out.println("Nhập password:");
            String pass = sc.nextLine();
            if (userName.equalsIgnoreCase("fpt") && pass.equals("polytechnic")) {
//        if (userName.equalsIgnoreCase("" + userName)&& pass.equalsIgnoreCase(""+pass)) {
                System.out.println("Đăng nhập thành công");
            } else {
                so = 0;
                System.out.println("Sai password hoặc tên đăng nhập vui lòng nhập lại");
            }
        } while (so != 1);
    }

    public static void bai3() {
        String hoTen = keyBoard.readString("Nhập họ và tên:");

        String email = "Nhập Email:";
        String bieuThucEmail = "\\w+@\\w+(\\.\\w+){1,2}";
        String email1 = "Nhập sai email vui lòng nhập lại";
        keyBoard.readString1(email, bieuThucEmail, email1);
        String soDT = "Nhập số điện thoại :";
        String phone = "0\\d{9,10}";
        String soDT1 = "Nhập sai số điện thoại vui lòng nhập lại";
        keyBoard.readString1(soDT, phone, soDT1);
        String CMND = "Nhập CMND";
        String BTCMND = "\\d{10,12}";
        String CMND1 = "Nhập sai CMND vui lòng nhập lại";
        keyBoard.readString1(CMND, BTCMND, CMND1);
    }

    public static void bai3New() {
        String hoTen = keyBoard.readString("Nhập họ và tên:");

        readStringNew(hoTen, "", "");
        String enterEmail = "Nhập Email: ";
        String bieuThucEmail = "\\w+@\\w+(\\.\\w+){1,2}";
        String validateEmai = "Nhập sai email vui lòng nhập lại";
        readStringNew(enterEmail, bieuThucEmail, validateEmai);

        String enterPhone = "Nhập số điện thoại :";
        String phone = "0\\d{9,10}";
        String validatePhone = "Nhập sai số điện thoại vui lòng nhập lại";
        readStringNew(enterPhone, phone, validatePhone);

        String enterCMND = "Nhập CMND :";
        String regexCMND = "\\d{10,12}";
        String validateCMND = "Nhập sai CMND vui lòng nhập lại";
        readStringNew(enterCMND, regexCMND, validateCMND);
    }

    public static String readStringNew(String message, String regex, String validateString) {
        int flag = 1;
        String chuoi;
        do {
            System.out.println(message);
            chuoi = sc.nextLine();
            if (regex != "" && validateString != "") {
                if (!chuoi.matches(regex)) {
                    flag = 0;
                    System.out.println(validateString);
                } else {
                    flag = 1;
                }
            }
        } while (flag != 1);
        return chuoi;
    }

}
