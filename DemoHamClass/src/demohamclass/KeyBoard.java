/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demohamclass;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TUAN
 */
public class KeyBoard {

    public static Scanner sc = new Scanner(System.in);

    public static String readString(String message) {
        System.out.print(message);
        String input = sc.nextLine();
        return input;
    }

    public static String readInt(String message) {
        return null;

    }
}
