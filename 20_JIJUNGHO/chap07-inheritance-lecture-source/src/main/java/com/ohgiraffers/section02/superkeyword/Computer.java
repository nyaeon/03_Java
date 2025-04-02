package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {

    // Computer는 하나의 Product이지만, Product는 Computer가 아니다. (IS-A 관계)

    private String cpu;
    private int hdd;
    private int ram;
    private String operationSystem;

    public Computer() {
        System.out.println("Computer 클래스의 기본 생성자 호출...");
    }

    // 부모 클래스의 정보를 받지 않고 자식 클래스의 속성(cpu, hdd, ram, OS)만 초기화
    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }

    // 부모 클래스에서 정의된 생성자를 호출하여 초기화한 후, 자식 클래스의 속성도 초기화합니다.
    public Computer(String code, String brand, String name, int price, Date menufacturingDate, String cpu, int hdd, int ram, String operationSystem) {
        super(code, brand, name, price, menufacturingDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        /**
         * 위에 처럼 사용하고 싶지만 this()로 인해 작성한 생성자를 호출한다는 의미는
         * super()를 두번 호출하는 것과 같기 때문에 허용되지 않는다.
         * 부모 인스턴스를 두 개 생성할 수 없기 때문에 부모 생성자는 한번만 호출 가능하다.
         */
        // this(cpu, hdd, ram, operationSystem);
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

    public String getInfomation() {
        //        return "code" + super.getCode()
        //                + "brand" + super.getBrand()
        //                + "name" + super.getName()
        //                + "price" + super.getPrice()
        //                + "menufacturingDate" + super.getMenufacturingDate()
        //                + "cpu" + cpu
        //                + "hdd" + hdd
        //                + "ram" + ram
        //                + "operationSystem" + operationSystem;
        /*
         * super.getInfomation() : 정상적으로 부모의 메소드 호출
         * this.getInfomation() : 본인의 getInfomation() 호출 => 재귀호출이 일어나며 stackOverflow 발생
         * getInfomation() : this.이 자동 추가되어 재귀호출이 일어나고 stackOverflow 발생
         *
         * => 따라서 이런 경우 super.을 명시적으로 사용해야한다.
         **/
        return super.getInfomation()
                + ", cpu =" + cpu
                + ", hdd =" + hdd
                + ", ram =" + ram
                + "operationSystem =" + operationSystem;
    }
}
