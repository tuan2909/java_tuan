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
public class bai3 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        bai3();
    }

    static void bai3() {
        String fullname = keyBoard.readString("Họ và Tên:");
        int age = keyBoard.readInt("Nhập tuổi:");
        double point = keyBoard.readDouble("Nhập điểm");
        String gioiTinh = keyBoard.readString("Giới tính:");
    }
}
