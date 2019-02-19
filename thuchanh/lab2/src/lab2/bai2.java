/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TUAN
 */
public class bai2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường kính:");
        int bankinh = scanner.nextInt();
        double a = bankinh, chuvi, dientich;
        chuvi = (a * 2) * 3.14;
        dientich = bankinh * bankinh * 3.14;
        System.out.println("\n=========");
        System.out.println("Chu vi là:" + chuvi);
        System.out.println("\n Diện tích là:" + dientich);
    }
}
