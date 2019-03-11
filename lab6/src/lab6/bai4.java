/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author NGUYEN TUAN
 */
public class bai4 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        bai4();
    }

    static void bai4() {
        System.out.println("Nhập 5 phần tử của mảng:");
        int n = sc.nextInt();
        System.out.println("Các phần tử của mảng:");
        double a[] = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]:");
            a[i] = sc.nextInt();
        }
        double b[] = xarrays.swap(a, 2, 4);
        System.out.print("các phần tử của mảng sau khi thay đổi:" + Arrays.toString(b));
        double d = xarrays.min(a);
        System.out.println("\nphần tử nhỏ nhất là" + d);
        double[] e = xarrays.remove(a, 3);
        System.out.println("Phân tử thứ 3 sau khi xóa là" + Arrays.toString(e));
        System.out.println("nhập phần tử thêm vào mảng");
        double c[] = xarrays.add(e, sc.nextDouble());
        System.out.println("các phần tử của mảng sau khi thay đổi:" + Arrays.toString(c));

    }
}
