package QLBenhNhan;

import java.util.Scanner;
import java.util.Calendar;

public class BenhNhan {
    private String hoten;
    private String quequan;
    private int namsinh;

    public BenhNhan(String hoten, String quequan, int namsinh) {
        super();
        this.hoten = hoten;
        this.quequan = quequan;
        this.namsinh = namsinh;
    }

    public BenhNhan() {
        super();
        // TODO Auto-generated constructor stub
    }
    private String getHoten() {
        return hoten;
    }
    private void setHoten(String hoten) {
        this.hoten = hoten;
    }
    private String getQuequan() {
        return quequan;
    }
    private void setQuequan(String quequan) {
        this.quequan = quequan;
    }
    private int getNamsinh() {
        return namsinh;
    }
    private void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }
    public void inputbenhnhan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------------------");
        System.out.println("Nhap vao ho va ten benh nhan ");
        this.hoten = sc.nextLine();
        System.out.println("Nhap vao que quan benh nhan");
        this.quequan = sc.nextLine();
        System.out.println("Nhap bao nam sinh cua benh nhan");
        this.namsinh = Integer.parseInt(sc.nextLine());
    }
    public void outputbenhnhan() {
        System.out.println("===================================================");
        System.out.println("|Benh nhan : "+this.hoten);
        System.out.println("|Que quan  : "+this.quequan);
        System.out.println("|Nam sinh  : "+this.namsinh);

    }
    public int tinhtuoi() {

        Calendar instance = Calendar.getInstance();
        int year = instance.get(Calendar.YEAR);
        return year - this.namsinh;
    }
}