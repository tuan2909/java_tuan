/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TUAN
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                System.out.print("Họ và tên:");
                String hoten = scanner.nextLine();
                System.out.print("Điểm TB:");
                double diemTB =scanner.nextDouble();
                System.out.printf("%s %.1fđiểm \n",hoten,diemTB);
    }
}
