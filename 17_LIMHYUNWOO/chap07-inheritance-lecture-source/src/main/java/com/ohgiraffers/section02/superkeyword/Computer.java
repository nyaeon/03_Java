package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {
    // Computer는 하나의 Product이지만 Product는 하나의 Computer가 아니다. (IS-A)
    private String cpu;
    private int hdd;
    private int ram;
    private String operatingSystem;
    public Computer() {
        System.out.println("컴퓨터 클래스의 기본생성자 호출");
    }

    public Computer(String cpu, int hdd, int ram, String operatingSystem) {
        super();
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
    }

    public Computer(String code, String brand, String name, int price, Date manafacturingDate, String cpu, int hdd, int ram, String operatingSystem) {
        super(code, brand, name, price, manafacturingDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operatingSystem = operatingSystem;
//        this(cpu, hdd, ram, operatingSystem);
        // 위에처럼 사용하고 싶지만 this()로 인해 작성한 생성자를 호출한다는 의미는
        // super()를 두번 호출하는 것과 같기 때문에 허용되지 않는다.
        // 부모 인스턴스를 두 개 생성할 수 없기 때문에 부모 생성자는 한번만 호출가능하다.
        System.out.println("Computer 클래스의 부모필드도 초기화하는 생성자 호출함");
    }
    /***
     * setter와 gettr는 부모 필드의 메소드에 대해서는 자신의 것처럼 사용가능하기 때문에
     * 따로 작성할 필요없이 부모클래스에 작성한 것을 사용할 수 있다.
     * 따라서 자식 클래스에 추가된 필드에 대해서만 setter/getter를 작성한다.
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getInformation(){
//        return "code = " + super.getCode()
//                + ", brand = " + super.getBrand()
//                + ", name = " + super.getName()
//                + ", price = " + super.getPrice()
//                + ", manafacturingDate = " + super.getManafacturingDate()
//                + ", cpu = " + cpu
//                + ", hdd = " + hdd
//                + ", ram = " + ram
//                + ", operatingSystem = " + operatingSystem;
        return
                super.getInformation() + ", cpu = " + cpu
                + ", hdd = " + hdd
                + ", ram = " + ram
                + ", operatingSystem = " + operatingSystem;
    }
}

