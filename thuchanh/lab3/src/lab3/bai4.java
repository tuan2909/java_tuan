/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TUAN
 */
public class bai4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số điện:");
        int sodien = sc.nextInt();

        if (sodien < 50) {
            System.out.println("số tiền là :" + (sodien * 1000));

        } else {
            System.out.println("số tiền là" + (50 * 1000 + (sodien - 50) * 1200));
        }
    }
}
