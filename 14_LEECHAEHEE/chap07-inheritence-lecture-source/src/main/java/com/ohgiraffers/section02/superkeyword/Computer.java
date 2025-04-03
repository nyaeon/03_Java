package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {
    // Computer는 하나의 product이지만 product는 Computer가 아니다. (IS-A)
    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    public Computer() {
        System.out.println("Computer 클래스의 기본 생성자 호출...");
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        System.out.println("Computer 클래스의 매개변수 있는 생성자 호출됨..");
    }

    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price, manufacturingDate); // 반드시 첫줄
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
   /*     this(cpu, hdd, ram, operationSystemperationSystem);
         위에 처럼 사용하고싶지만 this()로 인해 작성한 생성자를 호출한다는 의미는
        super()를 두번 호출하는 것과 같기 때문에 허용되지 않는다.
         부모 인스턴스를 두개 생성할 수 없기 때문에 부모 생성자는 한번만 호출 가능하다.*  /
    */
        System.out.println("Computer 클래스의 부모필드도 초기화하는 생성자 호출함..");
        /* setter와 getter는 부모 필드의 메소드에 대해서는 자신의 것처럼 사용가능하기 때문애
        따로 작성할 필요 없이 부모클래스에 작성한 것을 사용할 수 있다.
        따라서 자식 클래스에 추가된 필드에 대해서만 getter/setter를 사용한다.



         */
    }

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

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public String getInformation() {
//        return "code = " + super.getCode()
//                + ", brand = " + super.getBrand()
//                + ", name = " + super.getName()
//                + ", price = " + super.getPrice()
//                + ", manufacturingDate = " + super.getManufacturingDate()
//                + ", cpu = " + cpu
//                + ", hdd = " + hdd
//                + ", ram = " + ram
//                + ", operationSystem = " + operationSystem;
        /*
        * super.getInformation() : 정상적으로 부모의 메소드 호출
        * this.getInformation() : 본인의 getInformation 호출 => 재귀호출이 일어나며 stackOverflow 발생
        * getInformation() :this.가 자동으로 붙어서 위와 결과가 같음
        * */
        return super.getInformation()
                + ", cpu = " + cpu
                + ", hdd = " + hdd
                + ", ram = " + ram
                + ", operationSystem = " + operationSystem;

    }
}
