package finaltext;

import java.util.Scanner;

public class FinalText {

    public static String tenHang[] = new String[100], mauSac[] = new String[100];
    ;
    public static double chieuCao[] = new double[100], trungBinh = 0;
    public static int i, so;

    public static void main(String[] args) {
        menu();
    }

    static void danhSach() {
        System.out.println("1.Nhập số yêu thích");
        System.out.println("2.Nhập thông tin ti vi");
        System.out.println("3.Xuất thông tin ti vi");
        System.out.println("4.Tính chiêu cao trung bình");
        System.out.println("5.In ra phần tử có chiều cao lớn nhất");
        System.out.println("6.Thoát");
    }

    static void menu() {
        while (true) {
            System.out.println("=======================");
            danhSach();
            int luaChon = keyBoard.readInt("Nhập lựa chọn: ");
            switch (luaChon) {
                case 1:
                    soYeuThich();
                    break;
                case 2:
                    nhapThongTin();
                    break;
                case 3:
                    xuatThongTin();
                    break;
                case 4:
                    TB();
                    break;
                case 5:
                    max();
                    break;
                case 6:
                    System.exit(0);
                    break;

            }
        }
    }

    static void soYeuThich() {
        so = keyBoard.readInt("Nhập số yêu thích:");
        double canBacHai = Math.sqrt(so);
        System.out.println("Căn bậc 2: " + canBacHai);
        System.out.println("Bình phương : " + (so * so));
    }

    static void nhapThongTin() {
        int tiVi = keyBoard.readInt("Nhập số ti vi");
        for (int i = 0; i < tiVi; i++) {
            System.out.println("Nhập tên hàng thứ " + (i + 1) + ":");
            tenHang[i] = keyBoard.readString("");
            System.out.println("Nhập chiều cao của ti vi thứ" + (i + 1) + ":");
            chieuCao[i] = keyBoard.readDouble("");
            System.out.println("Nhập màu sắc của ti vi  thứ" + (i + 1) + ":");
            mauSac[i] = keyBoard.readString("");

        }
    }

    static void xuatThongTin() {
        for (int i = 0; i < tenHang.length; i++) {
            if (tenHang[i] == null) {
                continue;
            }
            System.out.println("Tên tivi:" + tenHang[i]);
            System.out.println("Chiều cao:" + chieuCao[i]);
            System.out.println("Mầu sắc :" + mauSac[i]);
            System.out.println("==============================");
        }
    }

    static void TB() {
        System.out.println("Chiều cao TB");
        double tong = 0;
        double dem = 0;
        for (int i = 0; i < tenHang.length; i++) {
            if (tenHang[i] == null) {
                continue;
            }
            tong += chieuCao[i];
            dem++;
        }
        trungBinh = tong / dem;
        System.out.println("\nChiều cao trung bình :" + trungBinh);
    }

    public static void max() {
        int viTri = 0;
        double max = chieuCao[viTri];
        for (int i = 0; i < tenHang.length; i++) {
            if (tenHang[i] == null) {
                continue;
            }
            if (chieuCao[i] > max) {
                max = chieuCao[i];
                viTri = i;
            }

        }
        System.out.println("Tivi: " + tenHang[i] + " có chiều cao cao nhất :" + max);
    }

}
