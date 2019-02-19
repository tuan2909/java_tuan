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
public class bai4 {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 9; i++) {
            System.out.println("Bảng cửu chương:"+i);
           for(int j =1;j<=10;j++){
               System.out.printf("%d*%d=%d\n",i,j,i*j);           
           }
        }
    }
}
