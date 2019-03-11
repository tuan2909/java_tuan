/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TUAN
 */
public class bai2 {

    public static Scanner sc = new Scanner(System.in);
    public String sp1;
    public String sp2;

    public static void main(String[] args) {
        bai2 sp1 = new bai2();
        bai2 sp2 = new bai2();
        sp1.nhap();
        sp1.xuat();
        sp2.nhap();
        sp2.xuat();
    }

    public void nhap() {
        System.out.print("nhập thông tin sp 1: ");
        this.sp1 = sc.nextLine();
        System.out.println("Nhập thông tin sp 2: ");
        this.sp2 = sc.nextLine();
    }

    public void xuat() {
        System.out.println("========================");
        System.out.println("Sản phẩm 1 :" + this.sp1);
        System.out.println("Sản phẩm 2 :" + this.sp2);
        System.out.println("========================");
    }
}
