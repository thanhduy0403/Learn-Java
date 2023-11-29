/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyhinhproject;

/**
 *
 * @author User
 */
public class HinhChuNhat implements IHinh {

    double canh1, canh2;

    public HinhChuNhat() {
    }

    @Override
    public String toString() {
        return canh1 + "\t" + canh2 + "\t" + tinhChuVi() + "\t" + tinhDienTich();
    }

    public HinhChuNhat(double canh1, double canh2) {
        this.canh1 = canh1;
        this.canh2 = canh2;
    }

    public double getCanh1() {
        return canh1;
    }

    public void setCanh1(double canh1) {
        this.canh1 = canh1;
    }

    public double getCanh2() {
        return canh2;
    }

    public void setCanh2(double canh2) {
        this.canh2 = canh2;
    }

    @Override
    public double tinhDienTich() {
        return canh1 * canh2;
    }

    @Override
    public double tinhChuVi() {
        return (canh1 + canh2) * 2;
    }

}
