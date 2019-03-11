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
public class sanPham {

    public static Scanner sc = new Scanner(System.in);
    public String tenSP;
    public double donGia;
    public double giamGia;

    public static void main(String[] args) {
        sanPham sp = new sanPham();
        sp.nhap();
        sp.xuat();
    }

    public void nhap() {
        System.out.print("nhập tên sản phẩm :");
        this.tenSP = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        this.donGia = sc.nextDouble();
        System.out.print("Nhập giảm giá: ");
        this.giamGia = sc.nextDouble();
    }

    public double getThueNhapKhau() {
        return (this.donGia * (10 / 100));

    }

    public void xuat() {
        System.out.println("--------------------------");
        System.out.println("Tên Sản Phẩm: " + this.tenSP);
        System.out.println("Tên Đơn Giá: " + this.donGia);
        System.out.println("Giảm giá: " + this.giamGia);
        System.out.println("Thuế nhập khẩu: "+this.getThueNhapKhau());
        
    }
}
//    public String fullname;
//    public double salary;
//
//    public void input() {
//    }
//
//    public void output() {
//    }
//
//    public void setInfo(String fullname, double salary) {
//        this.fullname = fullname;
//        this.salary = salary;
//    }
//
//    public double incomTax() {
//        if (this.salary < 5000000) {
//            return 0;
//        }
//        double tax = (this.salary - 5000000) * 10 / 100;
//        return tax;
//    }
//}

