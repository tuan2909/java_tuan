/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import static test.keyBoard.sc;

/**
 *
 * @author NGUYEN TUAN
 */
public class lab7 {

    public static void main(String[] args) {
        menuBai7();
    }

    static void danhSachBai7() {
        System.out.println("Lab 7:");
        System.out.println("(1)Bài 1:Nhập họ và tên từ bàn phím. Xuất tên, họ và tên đệm ra màn hình trong đó tên và họ xuất IN HOA.");
        System.out.println("(2)Bài 2: Viết chương trình đăng nhập với username và password được nhập từ bàn phím. Nếu username là “FPT” (không phân biệt hoa/thường) và password là “polytechnic” (có phân biệt hoa/thường). Đưa ra thông báo  ");
        System.out.println("(3)Nhập từ bàn phím họ tên, email, số điện thoại và chứng minh nhân dân. Kiểm tra và thông báo lỗi nếu nhập không đúng định dạng email, số điện thoại và CMND. .");
        System.out.println("(4)Thoát.");
    }

    static void menuBai7() {
        while (true) {
            danhSachBai7();
            int lCBai7 = keyBoard.readInt("Nhập lựa chọn: ");
            switch (lCBai7) {
                case 1:
                    bai7_1();
                    break;
                case 2:
                    bai7_2();
                    break;
                case 3:
                    bai7_3();
                    break;
                case 4:
                    Test.menu();
                    break;
            }
        }
    }

    public static void bai7_1() {
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

    public static void bai7_2() {
        int so = 1;
        do {
            System.out.println("Nhập user name:");
            String userName = sc.next();
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

    public static void bai7_3() {
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
}
