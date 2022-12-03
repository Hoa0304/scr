package QLView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


import QLBenhNhan.BenhNhan;
import QLBenhAn.BenhAn;

public class QLViewBN  {
    public static void menu() {
        System.out.println("=================    Hello admin   ================");
        System.out.println("|1.Nhap benh an                                    |");
        System.out.println("|2.Sap xep benh an theo tuoi giam dan cua benh nhan|");
        System.out.println("|3.Hien thi danh sach benh nhan co tuoi <=10       |");
        System.out.println("|4.Danh sach benh nhan co tien vien phi cao nhat   |");
        System.out.println("|5.Hien thi ca danh sach                           |");
        System.out.println("|0.Thoat chuong trinh                              |");
        System.out.println("|==================================================|");
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        ArrayList<BenhAn> list = new ArrayList<BenhAn>();
        while(true) {
            menu();

            System.out.println("==>Chon tinh nang : ");
            int choice = Integer.parseInt(sc.nextLine());
            if(choice==0) {
                break;
            }
            switch(choice) {
                case 1: System.out.println("Nhap vao bao nhieu benh an : ");
                    int n = Integer.parseInt(sc.nextLine());
                    for(int i=0;i<n;i++) {
                        BenhAn x = new BenhAn();
                        x.inputbenhan();
                        list.add(x);

                    }
                    break;
                case 2:
                    Collections.sort(list, new Comparator<BenhAn>() {
                        @Override
                        public int compare(BenhAn ba1, BenhAn ba2) {
                            if (ba1.tinhtuoi() < ba2.tinhtuoi()) {
                                return 1;
                            } else {
                                if (ba1.tinhtuoi() == ba2.tinhtuoi()) {
                                    return 0;
                                } else {
                                    return -1;
                                }
                            }
                        }
                    });
                    break;
                case 3:
                    for(int i=0;i<list.size();i++) {
                        if(list.get(i).tinhtuoi()<=10) {
                            list.get(i).outputbenhan(
                            );
                        }
                    }
                    break;

                case 4: double max=0;
                    for(int i=0;i<list.size();i++) {
                        if(list.get(i).tienvienphi()>max) {
                            max=list.get(i).tienvienphi();
                        }
                        for( i=0;i<list.size();i++) {
                            if(list.get(i).tienvienphi()==max) {
                                list.get(i).outputbenhan();
                            }
                        }
                    }
                case 5:
                    for(int i=0;i<list.size();i++) {
                        list.get(i).outputbenhan();
                    }
                    break;

            }

        }
    }
}