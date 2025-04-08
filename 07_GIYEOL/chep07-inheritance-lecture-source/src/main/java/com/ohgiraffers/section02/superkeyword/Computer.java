package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class Computer extends Product {
    //computer는 하나 product이지만 product는 computer가 아님 (IS-S)
    private String  cpu;
    private int  hdd;
    private int  ram;
    private String  operatingSystem;
    public Computer() {
        System.out.println("Computer클래스의 기본생성자 호출");
    }

    public Computer(String cpu, String operatingSystem, int ram, int hdd) {
        //super();
        this.cpu = cpu;
        this.operatingSystem = operatingSystem;
        this.ram = ram;
        this.hdd = hdd;
    }

    public Computer(String code, String brand, String name, int price, 
                    Date manufacturingDate, String cpu, String operatingSystem,
                    int ram, int hdd) {
        super(code, brand, name, price, manufacturingDate);
           this.cpu = cpu;
           this.ram = ram;
           this.hdd = hdd;
           this.operatingSystem = operatingSystem;
        // this(cpu, operatingSystem, ram, hdd);
        // 위에처럼 사용하고 싶지만 this()로 인해 작성한 생성자를 호출한다는 의미는
        //super()를 두번 호출하는 것과 같기 때문에 허용하지 않는다
        //부모 인스턴슬 두개 생성할 수 없기 꺠문에 부모 생성자는 한번만 호출가능하다
        System.out.println("computer이 부모 필드도 초기화 하는 생성자 호출");
    }
    /***
     * setter와 getter는 부모필드의 메소드에 대해서는 자신의 것처럼 사용하는 것이 가능하기 떄문에
     * 따로 작성할 필요없이 부모클래스에 작성한 것을 사용할 수 있다
     * 따라서 자식 클래스에 추가된 필드에 대해서만 setter/getter를 사용
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
    public String getinformation() {
    //  return  "code =" + super.getCode() +
    //          ", brand=" + super.getBrand() +
    //          ", name=" + super.getName()+ ",price= "+ super.getPrice()+
    //          ", manufactutingDate =" + super.getManufacturingDate()+ ", cpu=" + this.cpu+
    //          ", hdd=" + this.hdd+",ram=" + this.ram+",operatingSystem=" + this.operatingSystem;
        /***
         * super.getinformation():정상적으로 부모 메소드 호출'
         * this.getinformation():본인의 getinformatiion 호출 => 재귀호출이 발생하며 stackoverflow발생
         * get.information(): this.이 자동 추가돠며 재귀호출이 발생, stackoverflow발생
         * super.을 꼭 사용해야함
         */
        return super.getinformation()+ ", cpu=" + this.cpu+
                ", hdd=" + this.hdd+",ram=" + this.ram+",operatingSystem=" + this.operatingSystem;
    }
}
