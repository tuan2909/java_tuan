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
public class bai1 {

    public static void main(String[] args) {
        tinhMinMax();
    }

    static void tinhMinMax() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số min:");
        int min = sc.nextInt();
        System.out.print("Nhập số max:");
        int max = sc.nextInt();
        int i = min;
        double tong = 0, dem = 0, trungBinh = 0;
        while (i <= max) {
            if (i % 5 == 0) {
                tong += i;
                dem++;
                trungBinh = tong / dem;
            }
            i++;
            
        }
        System.out.println("trung bình cộng các số chia hết cho 5:" + trungBinh);
    }

}
