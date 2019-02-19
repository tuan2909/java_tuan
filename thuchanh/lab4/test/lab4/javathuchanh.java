/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author NGUYEN TUAN
 */
public class javathuchanh {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tinhDiemTrungBinh();
    }

    static void tinhDiemTrungBinh() {
        int number = 27;
        int soLuong = 0;
        int tong = 0;
        while (number <= 250) {
            if (number % 3 == 0) {
                tong += number;
                soLuong++;
            }
            number++;
        }
        System.out.println("Trung bình cộng các số chia hết cho 3 là:" + (tong / soLuong));        
    }

    static void thuchanh() {

            
            
        }
    }


