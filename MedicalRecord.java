package Management;

import java.util.Scanner;
import PatientCaseManagement.Patient;
public class MedicalRecord extends Patient{
    private double price;
    private String nameMr;

    public MedicalRecord(){
    }

    public MedicalRecord(String name, String address, int year, double price, String nameMr) {
        super(name, address, year);
        this.price = price;
        this.nameMr = nameMr;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private String getNameMr() {
        return nameMr;
    }

    private void setNameMr(String nameMr) {
        this.nameMr = nameMr;
    }

    public void enterInformation(){
        input();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên bệnh án ");
        this.nameMr = sc.nextLine();
        System.out.println("Nhập vào số tiền viện phí ");
        this.price = Double.parseDouble(sc.nextLine());

    }
    public void exportInformation() {
        output();


        System.out.println("|Tên bệnh án    : "+this.nameMr);
        System.out.println("|Số tiền viện phí: "+this.price);
        System.out.println("=========================================");

    }
    public int getAge(){
        return 2022- super.getYear();
    }

}
