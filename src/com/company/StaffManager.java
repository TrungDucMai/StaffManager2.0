package com.company;

import java.util.ArrayList;
import java.util.List;

public class StaffManager {
    List<Staff> staffList = new ArrayList<>();
    String managerName;

    public List<Staff> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public void showAll() {
        for (int i = 0; i < staffList.size(); i++) {
            System.out.println(staffList.get(i));
        }
    }

    public void addNewStaff(int index, Staff newStaff) {
        staffList.set(index, newStaff);
    }

    public float totalSalary() {
        float sum = 0;
        for (int i = 0; i < staffList.size(); i++) {
            sum += staffList.get(i).getRealSalary();
        }
        return sum;

    }

    public float avarageSalary() {
        return totalSalary() / staffList.size();
    }

    public void belowAvaragePayStaff() {
        for (int i = 0; i < staffList.size(); i++) {

            if (staffList.get(i) instanceof FullTimeStaff && ((FullTimeStaff) staffList.get(i)).getSalary() < avarageSalary()) {
                System.out.println("Staff's name : " + staffList.get(i).getName());
            }
        }
    }

}

