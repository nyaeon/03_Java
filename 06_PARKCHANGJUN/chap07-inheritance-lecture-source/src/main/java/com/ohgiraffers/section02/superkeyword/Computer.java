package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {

    // Computer는 하나의 Product이지만 Product는 Computer가 아니다. (IS-A)
    private String cpu;

    private int hdd;

    private int ram;

    private String operationSystem;

    public Computer() {
        System.out.println("Computer 클래스의 기본 생성자 호출...");
    }

    // 옵션 N 누르면 나오는 두개
    // 위에꺼 기본생성자
    // 밑에꺼 매개변수 있는 생성자
    // 상속구조 | 인스턴스 생성 순서 : 1. 부모클래스의 생성자를 호출, 2. 자식클래스의 생성자를 호출


    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        super(); // 처음엔 생략되어 나옴
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }

    public Computer(String code, String brand, String name, int price, Date manufacturingDate,
                    String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price, manufacturingDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
//        this(cpu, hdd, ram, operationSystem);
        // 위에 처럼 사용하고싶지만 this()로 인해 작성한 생성자를 호출한다는 의미는
        // super()를 두번 호출하는 것과 같기 때문에 허용되지 않는다.
        // 부모 인스턴스가 두 개 생성할 수 없기 때문에 부모 생성자는 한번만 호출가능하다.

        System.out.println("Computer 클래스의 부모필드도 초기화하는 생성자 호출함...");
    }

    /**
     * setter와 getter는 부모 필드의 메소드에 대해서는 자신의 것처럼 사용가능하기 때문에
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

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public String getInformation() {

//        return "code = " + super.getCode() // 부모의 필드값
//                + ", brand = " + super.getBrand()
//                + ", name = " + super.getName()
//                + ", price = " + super.getPrice()
//                + ", manufacturingDate = " + super.getManufacturingDate()
//                + ", cpu = " + this.cpu // this.cpu라 써도 무방. 전역변수이기 때문.
//                + ", hdd = " + this.hdd // 자식의 필드값
//                + ", ram = " + this.ram
//                + ", operationSystem = " + this.operationSystem;

        /**
         * super.getInformation() : 정상적으로 부모의 메소드 호출
         * this.getInformation() : 본인의 getInformation() 호출 => 재귀호출이 일어나며 stackoverflow 발생
         * getInformation() : this.이 자동 추가되어 재귀호출(자기 자신을 다시 호출)이 일어나고 stackoverflow 발생
         */
        return super.getInformation()
                + ", cpu = " + this.cpu
                + ", hdd = " + this.hdd
                + ", ram = " + this.ram
                + ", operationSystem = " + this.operationSystem;
    }
}

