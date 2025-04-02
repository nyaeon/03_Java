package com.ohgiraffers.section02.superkeyword;

import java.util.Date;

public class computer extends product{

    // Computer는 하나의 Product이지만
    // Product는 Computer가 아님
    // 고로 IS-A 관계임

    public computer(String code, String brand, String name, int price, Date manufacturingDate) {
        super();
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        dhis.operationSystem = operationSystem;
    }

    public computer() {
        super();
    }

    @Override
    public String getCode() {
        return super.getCode();
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public Date getManufacturingDate() {
        return super.getManufacturingDate();
    }

    @Override
    public void setCode(String code) {
        super.setCode(code);
    }

    @Override
    public void setBrand(String brand) {
        super.setBrand(brand);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setPrice(int price) {
        super.setPrice(price);
    }

    @Override
    public void setManufacturingDate(Date manufacturingDate) {
        super.setManufacturingDate(manufacturingDate);
    }

    public computer(String code, String brand, String name) {
        super(code, brand, name);
    }

    @Override
    public String getInformation() {
        return getInformation()
                + "";
    }

    public computer(String code, String brand, String name, int price, Date manufacturingDate, Date cpu, Date hdd) {
        super(code, brand, name, price, manufacturingDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operationSystem = operationSystem;

        // this(cpu, hdd, ram, operationSYstem);
        // 위에 처럼 사용하고 싶지만 this()로 인해 작성한 생성자를 호출한다는 의미는
        // super()를 두번 호출하는 것과 같기 때문에 허용되지 않는다.
        // 부모 인스턴스를 두 개 생성할 수 없기 땜누에 부모 생성자는 한번만 호출 가능하다.

        System.out.println("computer 클래스의 부모필드도 초기화 하는 생성자 호출함...");

        /*
        setter과 getter은 부모 필드의 메소드에 대해서는 자신의 것처럼 사용하능하기 때문에
        따로 작성할 필요없이 부모클래스에 작성한 것을 사용할 수 있다.
        따라서 자식 클래스에 추가된 필드에 대해서만 setter/getter를 작성한다.
         */






    }
}
