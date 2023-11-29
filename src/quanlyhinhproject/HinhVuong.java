/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyhinhproject;

/**
 *
 * @author User
 */
public class HinhVuong implements IHinh {

    double canh;

    public HinhVuong() {
    }

    @Override
    public String toString() {
        return canh + "\t" +tinhChuVi() + "\t" + tinhDienTich();
    }

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public double tinhDienTich() {
        return canh * canh;
    }

    @Override
    public double tinhChuVi() {
        return canh * 4;
    }

}
