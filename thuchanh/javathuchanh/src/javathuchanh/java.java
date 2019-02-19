/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathuchanh;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TUAN
 */
public class java {

    public static void main(String[] args) {
        System.out.println("Java1");
        double rong = 6.5;
        double dai = 8.5;
        double dientich = rong * dai;
        System.out.println("Diện tích lớp bạn:" + dientich);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Họ và tên:");
        String hoten = scanner.nextLine();
        System.out.print("Điểm TB:");
        double diemTB = scanner.nextDouble();
        System.out.printf("Tên và điểm TB:%s %.2fđiểm \n", hoten, diemTB);

    }
}
