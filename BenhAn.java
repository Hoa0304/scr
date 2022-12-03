package QLBenhAn;

import java.util.Scanner;

import QLBenhNhan.BenhNhan;

public class BenhAn extends BenhNhan {
    private String tenbenhan;
    private double sotienvienphi;
    /**
     *
     */
    public BenhAn() {
        super();
        // TODO Auto-generated constructor stub
    }

    private String getTenbenhan() {
        return tenbenhan;
    }
    private void setTenbenhan(String tenbenhan) {
        this.tenbenhan = tenbenhan;
    }
    private double getSotienvienphi() {
        return sotienvienphi;
    }
    private void setSotienvienphi(double sotienvienphi) {
        this.sotienvienphi = sotienvienphi;
    }
    public BenhAn(String hoten, String quequan, int namsinh, String tenbenhan,double sotienvienphi) {
        super(hoten, quequan, namsinh);
        // TODO Auto-generated constructor stub
        this.tenbenhan = tenbenhan;
        this.sotienvienphi = sotienvienphi;
    }
    public void inputbenhan() {
        inputbenhnhan();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten benh an");
        this.tenbenhan = sc.nextLine();
        System.out.println("Nhap vao so tien vien phi");
        this.sotienvienphi = Double.parseDouble(sc.nextLine());
    }
    public double tienvienphi() {
        return this.sotienvienphi;
    }

    public void outputbenhan() {
        outputbenhnhan();

        System.out.println("|Ten benh an     : "+this.tenbenhan);
        System.out.println("|So tien vien phi: "+this.sotienvienphi);
        System.out.println("=========================================");

    }

}