package com.company;

public class FullTimeStaff extends Staff{
    private float salary;
    private float bonus;
    private float fineMoney;

    public FullTimeStaff(){};

    public FullTimeStaff(float salary, float bonus, float fineMoney) {
        this.salary = salary;
       this.bonus = bonus;
        this.fineMoney = fineMoney;
    }

    public FullTimeStaff(String code, String name, float age, double phoneNumber, String email, float salary, float bonus, float fineMoney) {
        super(code, name, age, phoneNumber, email);
        this.salary = salary;
        this.bonus = bonus;
        this.fineMoney = fineMoney;
    }
    public float getSalary() {
        return salary;
    }
    @Override
    public float getRealSalary(){
        return getSalary()+getBonus()-getFineMoney();
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public float getFineMoney() {
        return fineMoney;
    }

    public void setFineMoney(float fineMoney) {
        this.fineMoney = fineMoney;
    }

    @Override
    public String toString() {
        return "FullTimeStaff{"
                +super.toString()+
                "salary=" + salary +
                ", bonus=" + bonus +
                ", fineMoney=" + fineMoney +
                '}';
    }
}
