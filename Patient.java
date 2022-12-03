package PatientCaseManagement;

import java.util.Scanner;

public class Patient {
    private String name;
    private String address;
    private int year;

    public Patient(String name, String address, int year) {
        this.name = name;
        this.address = address;
        this.year = year;
    }
    public Patient(){}



    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public int getYear() {
        return year;
    }

    private void setYear(int year) {
        this.year = year;
    }


    public void input(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên bệnh nhân ");
        this.name = sc.nextLine();
        System.out.println("Nhập vào địa chỉ bệnh nhân ");
        this.address = sc.nextLine();
        System.out.println("Nhập vào năm sinh bệnh ");
        this.year = Integer.parseInt(sc.nextLine());

    }
    public void output() {
        System.out.println("|Tên bệnh nhân    : "+this.name);
        System.out.println("|Địa chỉ bệnh nhân: "+this.address);
        System.out.println("Năm sinh bệnh nhân: "+this.year);
        System.out.println("=========================================");

    }
}
