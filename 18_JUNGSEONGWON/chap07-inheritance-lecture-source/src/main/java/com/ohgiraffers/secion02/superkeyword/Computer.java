package com.ohgiraffers.secion02.superkeyword;

import java.util.Date;

public class Computer extends Product{

    // Computer는 하나의 Product 이지만 Product는 Computer가 아니다. (IS-A)
    private String cpu;
    private int hdd;
    private String operatingSystem;
    private int ram;
    public Computer(){
        System.out.println("Computer class common constructor called");
    }

    public Computer(String cpu, int hdd, String operatingSystem, int ram) {
        super();
        this.cpu = cpu;
        this.hdd = hdd;
        this.operatingSystem = operatingSystem;
        this.ram = ram;
    }

    public Computer(String code, String barnd, String name, int price,
                    Date manufacturingDate, String cpu, int hdd,
                    String operatingSystem, int ram)
    {
        super(code, barnd, name, price, manufacturingDate); // 부모의 필드를 가지고 온다.
        this.cpu = cpu;
        this.hdd = hdd;
        this.operatingSystem = operatingSystem;
        this.ram = ram;
//        this(cpu, hdd, operatingSystem, ram);
        // 위에 처럼 사용하고 싶지만 this()로 인해 작성한 생성자를 호출한다는 의미는
        // super()를 두번 호출하는 것과 같기 때문에 허용하지 않는다.
        // 부모 인스턴스를 두개 생성 할 수 없기 때문에 부모 생성자는 한번만 호출 가능하다.
        System.out.println("Computer class parented constructor called");
    }

    /*
    * setter 와 getter는 부모 필드의 메소드에 대해서는 자신의 것처럼 사용가능하기 때문에
    * 따로 작성할 필요없이 부모클래스에 작성한 것을 사용 할 수 있다.
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

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getInformation(){

        return "code = " + super.getCode()
                + ", brand = " + super.getBarnd()
                + ", name = " + super.getName()
                + ", price = " + super.getPrice()
                + ", manufacturingDate = " + super.getManufacturingDate()
                + ", cpu = " + this.cpu
                + ", hdd = " + this.hdd
                + ", operatingSystem = " + this.operatingSystem
                + ", ram = " + this.ram;
        /*
        * super.getInformation() : 정상적으로 부모의 메소드 호출
        * this.getInformation() : 본인의 getInformation() 호출 => 재귀호출이 일어나며 stackOverflow 발생
        * getInformation() : this.이 자동 추가되어 재귀호출이 일어나서 stackOverflow발생
        *
        * 따라서 이런 경우 super. 명시적으로 추가해준다.
        * */
//        return super.getInformation()
//                + ", manufacturingDate = " + super.getManufacturingDate()
//                + ", cpu = " + this.cpu
//                + ", hdd = " + this.hdd
//                + ", operatingSystem = " + this.operatingSystem
//                + ", ram = " + this.ram;
    }
}
