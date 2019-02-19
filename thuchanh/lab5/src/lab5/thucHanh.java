/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Scanner;
import static lab5.test.sc;

/**
 *
 * @author NGUYEN TUAN
 */
public class thucHanh {

    /**
     * @param args the command line arguments
     */
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        khoiTaoMang();
//        duyenMang();
//        vd1();
//        baiTest();
//        bai_1();
//        bai_3();
        bai_2();
//        bai_4();
    }

    static void khoiTaoMang() {
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        a[4] = 2 * a[7];
        System.out.println("Số phần tử của mảng là:" + a.length);
        int b = a[2] * a[5];
        System.out.println(a[4] + "" + b);
    }

    static void duyenMang() {
        int a[] = {4, 3, 5, 9, 18, 65, 54, 87, 91};

    }

    static void vd1() {
        int sample[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
        int min, max;

        min = max = sample[0];
        for (int i = 1; i < 10; i++) {
            if (sample[i] < min) {
                min = sample[i];
            }

            if (sample[i] > max) {
                max = sample[i];
            }

        }
        System.out.println("Giá trị nhỏ nhất và lớn nhất là:" + min + "" + max);
    }

    static void baiTest() {
        System.out.println("Nhập số phần tử của mảng:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print(" Nhập các phần tử của mảng :\n");
        for (int i = 0; i < n; i++) {
            System.out.print("a[ " + i + "]");
            a[i] = sc.nextInt();

        }
        System.out.println("Các phần tử cửa mảng :");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "");
        }
//        xuatMang(a);
    }

    static void bai_1() {
        System.out.println("Nhập số phần tử của mảng:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "]:");
            a[i] = sc.nextInt();
        }
        System.out.print("Các phần tử cửa mảng :");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "  ");

        }
        double trungBinh = 0;
        int tong = 0;
        int dem = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 3 == 0) {
                tong += a[i];
                dem += 1;
            }
            trungBinh = tong / dem;
        }
        System.out.println("\ntrung bình cộng các số chia hết cho 3:" + trungBinh);
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("\nPhần tử nhỏ nhất là:" + min);

        int temp = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.print("Dãy số được sắp xếp tăng dần: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    static void bai_3() {
        int soDong = 3;
        int soCot = 2;
        int binhPhuong = 0;
        System.out.println("Nhập vào số dòng của ma trận:");
        soDong = sc.nextInt();
        System.out.println("Nhập số cột của ma trận");
        soCot = sc.nextInt();
        int matrix[][] = new int[soDong][soCot];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.println("Nhập phần tử thứ [" + i + "],[" + j + "]");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Ma trận:");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(matrix[i][j] + "\t");

            }
            System.out.println("\n");
        }
        System.out.println("Ma trận sau khi bình phương là:");
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                binhPhuong = matrix[i][j] * matrix[i][j];
                System.out.print(binhPhuong + "\t");
            }
            System.out.println("\n");
        }
    }

    static void bai_2() {
        String hocSinh[] = new String[3];
        System.out.println("Nhập tên sinh viên:");
        for (int i = 0; i < hocSinh.length; i++) {
            System.out.print("học sinh thứ:" + i + ":");
            hocSinh[i] = sc.nextLine();
            
        }
        System.out.println("Nhập điểm:");
        double diem[]=new double[3];
        for(int i=0;i<diem.length;i++){
            diem[i]=sc.nextDouble();   
 
        }
        

    }



    static void bai_4() {
        System.out.println("Nhập danh sách học sinh");
        String hoTen[] = {"Tuấn", "Hạnh", "Cường"};
        for (int i = 0; i < hoTen.length; i++) {
            System.out.println(hoTen[i]);
//            hoTen[i]=sc.nextLine();
        }
        System.out.println("Điểm toán,lý ,hóa của các học viên lần lượt là là:");
        double[][] diem = {{5, 6, 7}, {7, 9, 5}, {8, 3, 4}};
        for (int i = 0; i < diem.length; i++) {
            for (int j = 0; j < diem.length; j++) {
                System.out.print(diem[i][j] + "  ");
            }
            System.out.println("");
        }
        System.out.println("Điểm trung bình là:");
        double DTBTuan = (diem[0][0] + diem[0][1] + diem[0][2]) / 3;
        System.out.println("điểm trung bình của tuấn là:" + DTBTuan);
        double DTBHanh = (diem[1][0] + diem[1][1] + diem[1][2]) / 3;
        System.out.println("điểm trung bình của Hạnh là:" + DTBHanh);
        double DTBCuong = (diem[2][0] + diem[2][1] + diem[2][2]) / 3;
        System.out.println("điểm trung bình của Cường là:" + DTBCuong);
    }
}
