/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TUAN
 */
public class keyBoard {

    public static Scanner sc = new Scanner(System.in);

    public static String readString(String message) {
        System.out.println(message);
        String chuoi = sc.nextLine();
        return chuoi;
    }

    public static int readInt(String message) {
        System.out.println(message);
        int soNguyen = sc.nextInt();
        return soNguyen;
    }

    public static String readString1(String message, String regex, String xacNhan) {
        int a = 1;
        String bien="";
        do {
            System.out.println(message);
            bien = sc.nextLine();
            
            if (!bien.matches(regex)) {
                a = 0;
                System.out.println(xacNhan);
            }
            else{
                 a=1;   
                    }
        } while (a != 1);

        return bien;
    }
}
