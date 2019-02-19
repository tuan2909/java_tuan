/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathuchanh;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author NGUYEN TUAN
 */
public class Javathuchanh {

    /**
     * @param args the command line arguments
     */
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
//        bai1();
//        bai2_1();
//        bai2_2();
//        bai2_3();
//        bai2_4();
//        bai3_1();
//        bai3_2();
//        bai3_3();
//        danhSach();
        nhapmatrix();
        xuatmatrix();
    }

    static void bai1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ và tên:");
        String hoTen = sc.nextLine();
        System.out.print("Điểm TB:");
        double diemTB = sc.nextDouble();
        System.out.printf(hoTen, diemTB);
    }

    static void bai2_1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tên sản phẩm:");
        String sanPham = sc.nextLine();
        System.out.print("Đơn giá");
        int donGia = sc.nextInt();
        System.out.print("Số lượng");
        int soLuong = sc.nextInt();
        double thue = (donGia + soLuong) * 10 / 100;
        System.out.println("\n===================");
        System.out.println("Tên sản phẩm " + sanPham);
        System.out.println("Đơn Giá:" + donGia);
        System.out.println("Số Lượng:" + soLuong);
        System.out.println("Thuế Nhập Khẩu:" + thue);
    }

    static void bai2_2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Đường Kính:");
        double duongKinh = sc.nextDouble();
        double chuVi = duongKinh * 3.14;
        double dienTich = 3.14 * (duongKinh / 2) * (duongKinh / 2);
        System.out.println("Chu vi là:" + chuVi);
        System.out.println("Diện Tích là:" + dienTich);

    }

    static void bai2_3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm toán:");
        double toan = sc.nextDouble();
        System.out.print("Nhập điểm lý:");
        double ly = sc.nextDouble();
        System.out.print("Nhập điểm hóa");
        double hoa = sc.nextDouble();
        double diemTB = (toan * 3 + ly * 2 + hoa) / 6;
        System.out.print("\nNhập điểm TB:" + diemTB);

    }

    static void bai2_4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập năm:");
        int year = sc.nextInt();
        if (year % 4 == 0 && year / 100 != 0) {
            System.out.println(year + "là: năm nhuận");
        } else {
            System.out.println(year + "là: năm không nhuận");
        }
    }

    static void bai3_1() {
        System.out.println("Giải phương trình bậc một");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số a:");
        double a = sc.nextDouble();
        System.out.print("Nhập số b:");
        double b = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            System.out.println("Nghiệm của phương trình là:" + (-b / a));
        }

    }

    static void bai3_2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a:");
        double a = sc.nextDouble();
        System.out.println("Nhập số b:");
        double b = sc.nextDouble();
        System.out.println("Nhập số c");
        double c = sc.nextDouble();
        if (a == 0) {
            System.out.println("nghiệm của phương trình là" + (-b / a));

        } else if (a != 0) {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                System.out.println("Phương trình có nghiệm kép:" + (-b / (2 * a)));
            } else if (delta > 0) {

                double x1 = (-b + sqrt(delta)) / (2 * a);
                double x2 = (-b - sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt:" + x1 + "\n" + x2);
            }
        }
    }

    static void bai3_3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số điện:");
        int soDien = sc.nextInt();
        if (soDien >= 0 && soDien <= 50) {
            System.out.println("Số tiền là:" + (soDien * 1000));
        } else if (soDien > 50) {
            System.out.println("Số tiền là" + 50 * 1000 + (soDien - 50) * 1200);
        }
    }

    static void bai4_1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số min:");
        int min = sc.nextInt();
        System.out.print("Nhập số max:");
        int max = sc.nextInt();
        int i = min;
        double tong = 0, dem = 0, trungBinh = 0;
        while (i <= max) {
            if (i % 5 == 0) {
                tong += i;
                dem++;
                trungBinh = tong / dem;
            }
            i++;

        }
        System.out.println("trung bình cộng các số chia hết cho 5:" + trungBinh);
    }

    static void bai4_2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số m:");
        int m = sc.nextInt();
        int f0 = 1, f1 = 2, next = f0 + f1;
        while (next < m) {
            next = f0 + f1;
            f0 = f1;
            f1 = next;
            if (next > m) {
                System.exit(0);
            }
            System.out.println(next);
        }
    }

    static void bai4_3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số N:");
        int n = sc.nextInt();
        boolean soNguyenTo = true;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                soNguyenTo = false;
                break;
            }
        }
        System.out.print(soNguyenTo);
    }

    static void danhSach() {
        int i, n;

        Scanner sc = new Scanner(System.in);
//        do {
//            System.out.println("Nhập vào số phần tử của mảng: ");
//            n = sc.nextInt();
//        } while (n <= 0);
        String nhap[] = new String[]{"lan", "duc", "hiep", "nga", "dat"};
        for (i = 0; i < nhap.length; i++) {
            System.out.println(nhap[i]);
        }
        // nhap vao tu ban phim 1 ten hoc sinh và kiem tra xem hoc sinh đây đa ton tai hay chua
        System.out.println("nhập học sinh");
        String hoTen = sc.nextLine();
        // check
        for (i = 0; i < nhap.length; i++) {
            if (hoTen.equals(nhap[i])) {
                System.out.println("hoc sinh nay da ton tai");
                break;
            } else {
                System.out.println("hoc sinh moi");
                break;
            }
        }

    }
    static int n, m, matrix[][];

    public static void nhapmatrix() {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so hang: ");
        int n = input.nextInt();
        System.out.println("nhap so cot: ");
        int m = input.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("  a[" + i + "," + j + "]=");
                matrix[i][j] = input.nextInt();
            }
            System.out.println();

        }
    }

    public static void xuatmatrix() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println("");
        }
    }

}
