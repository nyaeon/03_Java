package HOMEWORK2_week.chep06.arrayhomework.hw1.model.dto;

public class Employee {
    private int empno;
    private String empname;
    private String dept;
    private String job;
    private int age;
    private char gender;
    private int salary;
    private double bonuspoint;
    private String phone;
    private String address;

    public Employee() {
    }

    public Employee( int empno, String empname,String dept, int age, String job, char gender, int salary, double bonuspoint, String address, String phone) {
        this.empno = empno;
        this.empname = empname;
        this.dept = dept;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.salary = salary;
        this.bonuspoint = bonuspoint;
        this.address = address;
        this.phone = phone;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getBonuspoint() {
        return bonuspoint;
    }

    public void setBonuspoint(double bonuspoint) {
        this.bonuspoint = bonuspoint;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;

    }


    public String information() {
        return
                this.empno + ", "
                + this.empname + ", "
                + this.dept + ", "
                + this.age + ", "
                + this.job + ", "
                +this.gender + ", "
                +this.salary + ", "
                +this.bonuspoint + ", "
                +this.phone + ", "
                +this.address + ", "
;
    }


}
