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
public class Lab8Demo {
public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        demo();
    }

    public static void demo() {
        Lab8Demo ht = new Lab8Demo();
        ht.banKinh = sc.nextDouble();
        ht.printf();
    }
    public double banKinh;//trường

    public double getChuVi() {
        return 2 * Math.PI * this.banKinh;//Phương thức
    }

    public double getDienTich() {
        return Math.PI * Math.pow(this.banKinh, 2);
    }

    public void printf() {
        System.out.println(">Bán Kính" + this.banKinh);
        System.out.println(">Chu vi" + this.getChuVi());
        System.out.println(">Diện Tích" + this.getDienTich());
    }
}
