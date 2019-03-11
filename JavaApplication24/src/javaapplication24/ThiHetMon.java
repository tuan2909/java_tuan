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
public class ThiHetMon {

    public static Scanner sc = new Scanner(System.in);

    public static String ten[] = new String[60];
    public static double canNang[] = new double[60];
    public static String mauSac[] = new String[60];
    public static double trungBinh = 0;
    public static int i;

    public static void main(String[] args) {
        menu();
    }

    static void danhSach() {
        System.out.println("1. Nhập mật khẩu");
        System.out.println("2. Nhập thông tin");
        System.out.println("3. Xuất thông tin");
        System.out.println("4. Tính cân nặng trung bình");
        System.out.println("5. Học sinh có cân nặng Min");
        System.out.println("6. Thoat CT");
    }

    public static void menu() {
        while (true) {
            danhSach();
            System.out.print("\nLựa chọn:");
            int luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    nhapMatKhau();
                    break;
                case 2:
                    nhapThongtin();
                    break;
                case 3:
                    xuatThongTin();
                    break;
                case 4:
                    tinhTB();
                    break;
                case 5:
                    min();
                    break;
                case 6:
                    System.exit(0); 
                   break;
            }
        }
    }

    public static void nhapMatKhau() {
        System.out.println("Nhap username");
        String userName = sc.nextLine();
        System.out.println("Nhap password");
        String passWord = sc.nextLine();
        if (userName.equals("FPT")) {
            if (passWord.equalsIgnoreCase("javaNumber1")) {
                System.out.println("Đăng nhập thành công!");
            } else {
                System.out.println("Sai Password");
            }
        } else {
            System.out.println("Sai Username hoac Password");
        }
    }

    public static void nhapThongtin() {
        int soSV = KeyBoard.readInt("Nhập số học sinh");
        for (int i = 0; i < soSV; i++) {
            System.out.println("Nhap họ và tên của phần tử thứ" + (i + 1) + ":");
            ten[i] = KeyBoard.readString("");
            System.out.println("Nhập cân nặng của phần tử thứ" + (i + 1) + ":");
            canNang[i] = KeyBoard.readDouble("");
            System.out.println("Nhập màu sắc của phần tử thứ" + (i + 1) + ":");
            mauSac[i] = KeyBoard.readString("");

        }
    }

    public static void xuatThongTin() {
        for (int i = 0; i < ten.length; i++) {
            if (ten[i] == null) {
                continue;
            }
            System.out.println("Tên SV:" + ten[i]);
            System.out.println("Cân nặng:" + canNang[i]);
            System.out.println("Mầu sắc yêu thích:" + mauSac[i]);
            System.out.println("==============================");
        }
    }

    public static void tinhTB() {
        System.out.println("Cân nặng TB");
        double tong = 0;
        double dem = 0;
        for (int i = 0; i < ten.length; i++) {
            if (ten[i] == null) {
                continue;
            }
            tong += canNang[i];
            dem++;
        }
        trungBinh = tong / dem;
        System.out.println("\nCân nặng trung bình của học sinh là::" + trungBinh);
    }

    public static void min() {
        int viTri = 0;
        double min = canNang[viTri];
        for (int i = 0; i < ten.length; i++) {
            if (ten[i] == null) {
                continue;
            }
            if (canNang[i] < min) {
                min = canNang[i];
                viTri = i;
            }

        }
        System.out.println("Học sinh: " + ten[i] + " có cân nặng thấp nhất:" + min);

    }

}
