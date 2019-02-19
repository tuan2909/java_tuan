/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TUAN
 */
public class bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số N:");
        int n = sc.nextInt();
        boolean soNguyenTo = true;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                soNguyenTo = false;
                break;
            }
        }
        System.out.print(soNguyenTo);
    }
}
