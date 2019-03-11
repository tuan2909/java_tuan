/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TUAN
 */
public class Test {

    public static Scanner sc = new Scanner(System.in);
    public static double a, b, c;

    public static void main(String[] args) {
        menu();
    }

    static void danhSach() {
        System.out.println("Danh sách bài lab: ");
        System.out.println("(1)Lab 1.");
        System.out.println("(2)Lab 2.");
        System.out.println("(3)Lab 3.");
        System.out.println("(4)Lab 4.");
        System.out.println("(5)Lab 5.");
        System.out.println("(6)Lab 6.");
        System.out.println("(7)Lab 7.");
        System.out.println("(8)Thoát.");
    }

    static void menu() {
        while (true) {
            danhSach();
            int luaChon = keyBoard.readInt("Nhập lựa chọn: ");
            switch (luaChon) {
                case 1:
                    lab1.menuBai1();
                    break;
                case 2:
                    lab2.menuBai2();
                    break;
                case 3:
                    lab3.menuBai3();
                    break;
                case 4:
                    lab4.menuBai4();
                    break;
                case 5:
                    lab5.menuBai5();
                    break;
                case 6:
                    lab6.menuBai6();
                    break;
                case 7:
//                    lab7.menuBai7();
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        }
    }
}
