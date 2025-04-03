package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {

    // 컴퓨터는 하나의 product이지만 product는 하나의 컴퓨터라고 할 수 없다.
    // 따라서 상속 관계 가능

    private String cpu;

    private int hdd;

    private int ram;

    private String operationSystem;

    public Computer() {
        System.out.println("Computer 클래스의 기본 생성자 호출");
    }

    public Computer(String cpu, int hdd, int ram, String operationSystem) {
        // super()가 생략되어있음
        super();
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
    }

    public Computer(String code, String breand, String name, int price, Date manufacturingDate, String cpu, int hdd, int ram, String operationSystem) {
        super(code, breand, name, price, manufacturingDate);    // super()는 부모의 것을 찾아감
        //  this() 생성자처럼 super() 생성자도 맨 윗줄에 있어야 함
        //  this(cpu, hdd, ram, operationSystem); // 자기의 생성자를 찾아야 하는데, 그러면 super를 두 번 찾게 되기 때문에 사용 불가
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;
        /*
         * 위처럼 사용하고 싶지만 this()로 인해 작성한 생성자를 호출한다는 의미는
         * super()를 두 번 호출하는 것과 같기 때문에 허용 x
         * 부모 인스턴스를 두 개 생성할 수 없기 때문에 부모 생성자는 한 번만 호출 가능함
         * */

        System.out.println("Computer 클래스의 부모필드도 초기화하는 생성자 호출함");
    }

    /*
     * setter와 getter는 부모 필드의 메소드에 대해서는 자신의 것처럼 사용 가능하기 때문에
     * 따로 작성할 필요 없이 부모 클래스에 작성한 것을 사용할 수 있다.
     * 따라서 자식 클래스에 추가된 필드에 대해서만 setter/getter를 작성한다.
     * */

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
        return "code =" + super.getCode()
                + ", breand=" + super.getBrand()
                + ", name=" + super.getName()
                + ", price=" + super.getPrice()
                + ", manufacturingDate=" + super.getManufacturingDate()
                + ", cpu=" + cpu
                + ", hdd=" + hdd
                + ", ram=" + ram
                + ", operationSystem=" + operationSystem;
    }

    /*
    * super.getInformation() : 정상적으로 부모의 메소드 호출
    * this.getInformation() : 본인의 getInformation() 호출 => 재귀호출이 일어나면 stackOverflow 발생
    * getInformation() : this.이 자동 추가되며 재귀호출이 일어나고 stackOverflow 발생
    * */

}
