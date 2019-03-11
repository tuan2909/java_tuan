/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author NGUYEN TUAN
 */
public class lab4 {

    public static int min, max, i, m, n;
    public static double tong, dem, trungBinh;

    static void danhSachBai4() {
        System.out.println("Lab 4:");
        System.out.println("(1)Bài 1:Viết chương trình nhập vào 2 số min và max từ bàn phím. Tính và xuất trung bình cộng các số chia hết cho 5 từ min đến max.");
        System.out.println("(2)Bài 2: Viết chương trình nhập từ bàn phím số m. Xuất dãy số fibonci các số nhỏ hơn m. Dãy fibonaci là dãy số có số sau bằng tổng 2 số đứng kế trước trong đó 2 số đầu tiên f0=1 và f1=2 ");
        System.out.println("(3)Viết chương trình nhập một số nguyên từ bàn phím và cho biết số đó có phải là số nguyên tố hay không .");
        System.out.println("(4)Viết chương trình xuất ra màn hình bảng cửu chương .");
        System.out.println("(5)Thoát.");
    }

    static void menuBai4() {
        while (true) {
            danhSachBai4();
            int lCBai4 = keyBoard.readInt("Nhập lựa chọn: ");
            switch (lCBai4) {
                case 1:
                    bai4_1();
                    break;
                case 2:
                    bai4_2();
                    break;
                case 3:
                    bai4_3();
                    break;
                case 4:
                    bai4_4();
                    break;
                case 5:
                    Test.menu();
                    break;
            }
        }
    }

    static void bai4_1() {
        min = keyBoard.readInt("Nhập số min:");
        max = keyBoard.readInt("Nhập số max:");
        if_minMax();
    }

    static void if_minMax() {
        for (i = min; i <= max; i++) {
            if (i % 5 == 0) {
                tong += i;
                dem++;
                trungBinh = tong / dem;
            }
        }
        System.out.println("Số min là: " + min);
        System.out.println("số max là: " + max);
        System.out.println("trung bình các số chia hết cho 5 là: " + trungBinh);
    }

    static void bai4_2() {
        m = keyBoard.readInt("Nhập số m: ");
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
        n = keyBoard.readInt("Nhập số nguyên N: ");
        boolean soNguyenTo = true;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                soNguyenTo = false;
                break;
            }
        }
        System.out.println(soNguyenTo);
    }

    static void bai4_4() {
        for (int i = 1; i <= 9; i++) {
            System.out.println("Bảng cửu chương:" + i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d*%d=%d\n", i, j, i * j);
            }
        }
    }
}
