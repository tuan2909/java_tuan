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
public class java1 {

    public static void main(String[] args) {
        String hoten;
        int tuoi;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Nhập họ và tên:");
        hoten = scan.nextLine();
        System.out.print("Nhập tuổi:");
        tuoi = scan.nextInt();
        
        System.out.println("Tên là" + hoten);
        System.out.println("Tuổi là:" + tuoi);

    }
}
