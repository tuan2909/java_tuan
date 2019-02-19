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
public class th_if {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x == 1) {
            System.out.println("x bằng một");
            if (x == 2) {
                System.out.println("x bằng hai");
            }
            if (x == 3) {
                System.out.println("x bằng ba");                               
            }
        }
    }
}
