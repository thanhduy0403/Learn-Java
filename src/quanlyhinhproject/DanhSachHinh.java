/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyhinhproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class DanhSachHinh {

    ArrayList<IHinh> arr = new ArrayList<>();

    public void themHinh(IHinh hinh) {
        arr.add(hinh);
    }

    // doc file
    public void docFile(String tenFile) {
        try {
            FileReader fr = new FileReader(tenFile);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
                String s[] = line.split(",");
                if (s[0].equalsIgnoreCase("1")) {
                    double canh = Double.parseDouble(s[1]);
                    HinhVuong hv = new HinhVuong(canh);
                    themHinh(hv);
                } else {
                    double canh1 = Double.parseDouble(s[1]);
                    double canh2 = Double.parseDouble(s[2]);
                    HinhChuNhat hcn = new HinhChuNhat(canh1, canh2);
                    themHinh(hcn);
                }
            }
            br.close();
            fr.close();
        } catch (Exception e) {
        }
    }
}
