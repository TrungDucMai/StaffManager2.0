package com.company;


public class PartTimeStaff extends Staff{
    private float workingHours;

    public PartTimeStaff() {
    }

    @Override
    public float getRealSalary() {
        return getWorkingHours()*10;
    }


    public PartTimeStaff(float workingHours) {
        this.workingHours = workingHours;
    }

    public PartTimeStaff(String code, String name, float age, double phoneNumber, String email, float workingHours) {
        super(code, name, age, phoneNumber, email);
        this.workingHours = workingHours;
    }

    public float getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(float workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public String toString() {
        return "NhanVienBanThoiGian{" +
                super.toString() +
                "GioLamViec=" + workingHours +
                '}';
    }
}
