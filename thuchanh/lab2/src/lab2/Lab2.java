/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TUAN
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Tên sản phẩm:");
        String sanpham = scanner.nextLine();
        System.out.print("Đơn giá:");
        double dongia = scanner.nextDouble();
        System.out.print("Số Lượng:");
        int soluong = scanner.nextInt();
        double a = dongia;
        int b = soluong;
        double c = (a * b) * 10 / 100;
        System.out.println("============");
        System.out.println("Tên sản phẩm:" + sanpham);
        System.out.println("Đơn giá" + dongia);
        System.out.println("Số Luơng" + soluong);
        System.out.println("thuế nhập khẩu" + c);
    }

}
