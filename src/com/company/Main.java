package com.company;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Staff fullTimeStaff1 = new FullTimeStaff("c01", "Trung", 24, 89373859, "weor@gmail.com", 1000, 20, 10);
        Staff fullTimeStaff2 = new FullTimeStaff("c02", "Trang", 23, 89373859, "weor@gmail.com", 1200, 100, 30);
        Staff fullTimeStaff3 = new FullTimeStaff ("c02", "Thai", 22, 89373859, "weor@gmail.com", 900, 20, 0);
        Staff partTimeStaff1 = new PartTimeStaff("po1", "Binh", 21, 93852406, "trih@gmail", 70);
        Staff partTimeStaff2 = new PartTimeStaff("po2", "Binh", 21, 93852406, "trih@gmail", 70);

        List<Staff> staffList = new ArrayList<>();
        staffList.add(fullTimeStaff1);
        staffList.add(fullTimeStaff2);
        staffList.add(fullTimeStaff3);
        staffList.add(partTimeStaff1);
        staffList.add(partTimeStaff2);

        StaffManager trung = new StaffManager();
        trung.setStaffList(staffList);
        System.out.println(staffList);
        System.out.println(trung.totalSalary());
        System.out.println(trung.avarageSalary());
        trung.belowAvaragePayStaff();




    }
}



