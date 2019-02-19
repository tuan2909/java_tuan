/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assgimentgd1;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TUAN
 */
public class Assgimentgd1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        danhSach();
        menu();

    }

    static void danhSach() {
        System.out.println("1.Nhập danh sách học viên");
        System.out.println("2.Xuất danh sách học viên. ");
        System.out.println("3.Tìm kiếm học viên theo khoảng điểm");
        System.out.println("4.Tìm kiếm học viên theo học lực ");
        System.out.println("5.Tìm học viên theo mã số và cập nhật thông tin học viên. ");
        System.out.println("6.Sắp xếp học viên theo điểm ");
        System.out.println("7.Xuất 5 học viên có điểm cao nhất ");
        System.out.println("8.Tính điểm trung bình của lớp ");
        System.out.println("9.Xuất danh sách học viên có điểm trên điểm trung bình của lớp ");
        System.out.println("10.Tổng hợp số học viên theo học lực ");
    }

    static void menu() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("\nLựa chọn:");
            int luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    nhapDanhSachHocVien();
                    break;
                case 2:
                    xuatDanhSachHocSinh();
                    break;
                case 3:
                    timKiemHocVienTheoKhoangDiem();
                    break;
                case 4:
                    timKiemHocVienTheoHocLuc();
                    break;
                case 5:
                    timHocVienTheoMsVaCn();
                    break;
                case 6:
                    sapXepHocVienTheoDiem();
                    break;
                case 7:
                    xuat5HocVienDiemMax();
                    break;
                case 8:
                    diemTB();
                 break;
                case 9:
                    hocSinhTrenDiemTB();
                    break;
                case 10:
                    tongHopHvTheoHocLuc();
                    break;
                default:
                    System.exit(0);
                    break;
            }
        }
    }

    static void nhapDanhSachHocVien() {
        System.out.println("Danh sách học viên");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ và tên:");
        String hoten = sc.nextLine();
        System.out.print("Nhập email:");
        String email = sc.nextLine();
        System.out.print("Nhập điểm:");
        double diem = sc.nextDouble();
        System.out.print("Học Lực:");
        if (diem >= 0 && diem < 3 && diem >= 3 && diem < 5) {
            System.out.print("yếu");
        } else if (diem >= 5 && diem < 6.5) {
            System.out.print("Trung Bình");
        } else if (diem >= 5 && diem < 7.5) {
            System.out.print("Khá");
        } else if (diem >= 7.5 && diem < 9) {
            System.out.print("Giỏi");
        } else if (diem >= 9) {
            System.out.print("Xuất Sắc");
        }
    }

    static void xuatDanhSachHocSinh() {
        System.out.println("Nhập danh sách học viên.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ và tên:");
        String hoten = sc.nextLine();
        System.out.print("Nhập email:");
        String email = sc.nextLine();
        System.out.print("Nhập điểm:");
        double diem = sc.nextDouble();
        System.out.print("Học Lực:");
        if (diem >= 0 && diem < 3 && diem >= 3 && diem < 5) {
            System.out.print("yếu");
        } else if (diem >= 5 && diem < 6.5) {
            System.out.print("Trung Bình");
        } else if (diem >= 5 && diem < 7.5) {
            System.out.print("Khá");
        } else if (diem >= 7.5 && diem < 9) {
            System.out.print("Giỏi");
        } else if (diem >= 9) {
            System.out.print("Xuất Sắc");
        }

    }

    static void timKiemHocVienTheoKhoangDiem() {
        System.out.println("Học viên theo khoảng điểm");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ và tên:");
        String hoten = sc.nextLine();
        System.out.print("Nhập email:");
        String email = sc.nextLine();
        System.out.print("Nhập điểm:");
        double diem = sc.nextDouble();
    }

    static void timKiemHocVienTheoHocLuc() {
        System.out.println("Học viên theo học lực ");
    }

    static void timHocVienTheoMsVaCn() {

        System.out.println("Học viên theo mã số và cập nhật thông tin học viên.");
    }

    static void sapXepHocVienTheoDiem() {

        System.out.println("Sắp xếp học viên theo điểm");
    }

    static void xuat5HocVienDiemMax() {
        System.out.println("5 học viên có điểm cao nhất ");
    }

    static void diemTB() {
        System.out.println("Điểm trung bình của lớp ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ và tên:");
        String hoten = sc.nextLine();
        System.out.print("Nhập email:");
        String email = sc.nextLine();
        System.out.print("Nhập điểmTB:");
        double diem = sc.nextDouble();
    }

    static void hocSinhTrenDiemTB() {
        System.out.println("Danh sách học viên có điểm trên điểm trung bình của lớp");

    }

    static void tongHopHvTheoHocLuc() {

        System.out.println("Tổng hợp số học viên theo học lực ");

    }
}
