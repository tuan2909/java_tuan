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
public class bai3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm toán:");
        double toan = scanner.nextDouble();
        System.out.print("Nhập điểm lý:");
        double ly = scanner.nextDouble();
        System.out.print("Nhập điểm hóa:");
        double hoa = scanner.nextDouble();
        double avg = (toan * 3 + ly * 2 + hoa) / 6;
        System.out.println("\n==========");
        System.out.println("Điểm TB là:" + avg);
    }
}
