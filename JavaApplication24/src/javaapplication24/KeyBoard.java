/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication24;

/**
 *
 * @author NGUYEN TUAN
 */
 import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class KeyBoard {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static String readString(String message) {
        System.out.println(message);
        String input = sc.nextLine();
        return input;
    }

    public static int readInt(String message) {
        System.out.println(message);
        int input = sc.nextInt();
        sc.nextLine();
        return input;
    }
    
    public static double readDouble(String message) {
        System.out.println(message);
        double input = sc.nextDouble();
        sc.nextLine();
        return input;
    }

    public static String readString1(String message, String regex, String xacNhan) {
        int a = 1;
        String bien = "";
        do {
            System.out.println(message);
            bien = sc.next();
            if (regex != "" && xacNhan != "") {
                if (!bien.matches(regex)) {
                    a = 0;
                    System.out.println(xacNhan);
                } else {
                    a = 1;
                }
            }
        } while (a != 1);

        return bien;
    }
}   

