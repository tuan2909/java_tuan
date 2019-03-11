/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication20;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TUAN
 */
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {
        int n;

        // biến đếm số phần tử được nhập từ bàn phím có trong mảng
        int count = 0;
        Scanner scanner = new Scanner(System.in);



        int A[] = {1,2,3,4,5,6,1};


        

        // Đếm số lần xuất hiện của 1 phần tử được nhập từ bàn phím
        System.out.println("Nhập vào 1 số nguyên bất kỳ: ");
        int number = scanner.nextInt();

        for (int i = 0; i < A.length; i++) {
            if (A[i] == number) {
                count++;
            }
        }

        System.out.println("Số phần tử " + number + " có trong mảng = " + count);
    }
}
