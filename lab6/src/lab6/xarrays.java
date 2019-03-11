/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TUAN
 */
public class xarrays {

    public static Scanner sc = new Scanner(System.in);

    public static double[] swap(double[] a, int i, int j) {
        double temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        return a;
    }

    public static double[] add(double[] a, double x) {
        double b[] = new double[a.length + 1];
        System.arraycopy(a, 0, b, 0, a.length);
        b[a.length] = x;
        return b;
    }

    public static double min(double[] a) {
        double min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public static double[] remove(double[] a, int i) {
        double b[] = new double[a.length - 1];
        System.arraycopy(a, 0, b, 0, i);
        System.arraycopy(a, i + 1, b, i, a.length - i - 1);
        return b;
    }


}
