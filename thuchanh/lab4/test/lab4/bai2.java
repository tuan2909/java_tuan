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
public class bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số m:");
        int m = sc.nextInt();
        int f0 = 1, f1 = 2, next = f0 + f1;
        while (next < m) {
            next = f0 + f1;
            f0 = f1;
            f1 = next;
            if (next > m) {
                System.exit(0);
            }
            System.out.println(next);
        }
    }
}
