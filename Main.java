package Main;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import PatientCaseManagement.Patient;
import Management.MedicalRecord;
public class Main{
    static void showMenu() {
        System.out.println("==============================================================");
        System.out.println("1. Nhập danh sách N bệnh án");
        System.out.println("2. Sắp xếp độ theo tuổi giảm dần của các bệnh nhân");
        System.out.println("3. Hiện ra màn hình danh sách các bệnh nhân tuổi <=10");
        System.out.println("4. Cho biết thông tin các bệnh nhân có tiền viện phí cao nhất");
        System.out.println("5. Hien thi ca danh sach                           ");
        System.out.println("0. Thoat chuong trinh                              ");
        System.out.println("==============================================================");
    }

    public static void main(String[] args) {
        MedicalRecord x = new MedicalRecord();
        Scanner input = new Scanner(System.in);
        ArrayList<MedicalRecord> list = new ArrayList<MedicalRecord>();
        while (true) {
            showMenu();
            System.out.println("Choose: ");
            int choose = input.nextInt();
            if (choose == 0) {
                break;
            }
            switch (choose) {
                case 1:
                    System.out.println("Nhập số bệnh án:");
                    int n = input.nextInt();
                    for(int i=0;i<n;i++) {
                        x.enterInformation();
                        list.add(x);
                        System.out.println(list.size());
                    }
                    break;
                case 2:
                    /*for (int i=0; i<list.size(); i++) {
                        for (int j=i; j<list.size(); j++) {
                            if (list.get(i).getAge()<list.get(j).getAge()) {
                                x = list.get(i);
                                list.set(i, list.get(j));
                                list.set(j, x);
                            }
                        }
                    }
                    for (MedicalRecord x : list) {
                        x.exportInformation();
                    }
                    break;*/
                    Collections.sort(list, new Comparator<MedicalRecord>() {


                        public int compare(MedicalRecord ba1, MedicalRecord ba2) {
                            if (ba1.getPrice() < ba2.getPrice()) {
                                return 1;
                            } else {
                                if (ba1.getPrice() == ba2.getPrice()) {
                                    return 0;
                                } else {
                                    return -1;
                                }
                            }
                        }
                    });
                    break;
                case 3:
                    for (int i=0; i<list.size(); i++) {
                        if (list.get(i).getAge()<=10) {
                            list.get(i).exportInformation();
                        }
                    }
                    break;
                case 4:
                    double max =0;
                    for (int i=0; i<list.size(); i++) {
                        if (list.get(i).getPrice()>max)
                            max = list.get(i).getPrice();
                    }

                    for (int i=0; i<list.size(); i++) {
                        if (max == list.get(i).getPrice())
                            list.get(i).exportInformation();
                    }
                case 5:
                    for(int i=0;i<list.size();i++) {
                        list.get(i).exportInformation();
                    }
                    break;
                default:
                    System.err.println("Nhập sai");
                    break;
            }
        }
    }
}
