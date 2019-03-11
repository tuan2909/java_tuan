/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhapsv;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TUAN
 */
public class keyBoard {

    public static Scanner sc = new Scanner(System.in);

    public static String readString(String message) {
        System.out.println(message);
        String chuoi = sc.next();
        return chuoi;
    }

    public static int readInt(String message) {
        System.out.println(message);
        int input = sc.nextInt();
        return input;

    }

    public static double readDouble(String message) {
        System.out.println(message);
        double input = sc.nextDouble();
        return input;
    }
}
