/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author NGUYEN TUAN
 */
public class chuNhat {

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        chuNhat cn = new chuNhat(20, 15);
        chuNhat vn = new chuNhat(30);
    }
    public double dai, rong;

    public chuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public chuNhat(double canh) {
        this.rong = canh;
        this.dai = canh;
    }
}
