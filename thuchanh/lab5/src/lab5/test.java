/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author NGUYEN TUAN
 */
public class test {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        copyMang();
//        arrays();
//        arrayDemo();
//        mang2Chieu();
//        sapXepMang();

    }

    static void copyMang() {
        int a[] = {1, 2, 3, 4, 5, 6};
        int b[] = new int[5];
        System.arraycopy(a, 0, b, 0, 3);//(mảng nguồn,vị trị copy,mảng đích,vị trí bắt đầu mảng đích,số phần tử cần copy)
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);//kq:12300

        }
        System.out.println("");
        System.arraycopy(a, 4, b, 3, 2);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);//kq12356
        }
    }

    static void arrays() {
//        int a[] = {4, 3, 2, 4, 5, 2, 8, 9, 10, 44};
        System.out.println("Nhập số phần tử của mảng:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print(" Nhập các phần tử của mảng :\n");
        for (int i = 0; i < n; i++) {
            System.out.print("a[ " + i + "]");
            a[i] = sc.nextInt();
        }
        System.out.println("Mảng gốc :" + Arrays.toString(a));//Chuyển mảng thành chuỗi trong dấu"[]" và cách nhau dấu","
        Arrays.sort(a);//sắp xếp các phần tử theo thứ tự tăng dần
        System.out.println("Sau sort:" + Arrays.toString(a));
        int i = Arrays.binarySearch(a, 8);// Xác định vị trí phần tử thứ"...."
        System.out.println("Vị trí thứ 8 là:" + i);
        Arrays.fill(a, 8);//gán giá trị cho phần tử của mảng
        System.out.println("sau fill:" + Arrays.toString(a));
    }

    static void arraysDemo() {
        System.out.println("Nhập số phần tử của mảng:");
        int n = sc.nextInt();
        String a[] = new String[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("[" + i + "]:");
            a[i] = sc.nextLine();
        }
        System.out.print("Các phần tử cửa mảng :");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "");
        }
        Arrays.sort(a);
        System.out.println("Học sinh được sắp xếp theo thứ tự alphabet:" + Arrays.toString(a));
    }

    static void sapXepMang() {
        int arrays[] = {9, 8, 7, 4, 5, 1, 2, 3, 6};
        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = i + 1; j < arrays.length; i++) {
                if (arrays[i] > arrays[j]) {
                    int temp = arrays[i];
                    arrays[i] = arrays[j];
                    arrays[j] = temp;

                }
            }

        }
    }

    static void mang2Chieu() {
//        int i, j;
//        int a[][] = new int[3][4];//khai báo mảng 2 chiều
//        for (i = 0; i < 3; i++) {// tạo vòng lặp cho mảng 
//            for (j = 0; j < 4; j++) {
////                a[i][j] = (i * 4) + j + 1;
//                System.out.println("a[ " + i + "" + j + "]");
////                a[i][j] = sc.nextInt();
//
//            }
//            System.out.println("");
//        }
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "  ");

            }
            System.out.println("");
        }
    }

    static void soSanhHaiSoNguyen(int a, int b) {
        if (a > b) {
        }
    }
}

