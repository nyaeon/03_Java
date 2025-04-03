package com.ohgiraffers.hw3.model.dto;

public class ProductDTO {
  int pid;
  String pName;
  int price;

  public ProductDTO() {}

  public ProductDTO(int pid, String pName, int price, double tax) {
    this.pid = pid;
    this.pName = pName;
    this.price = price;
    this.tax = tax;
  }

  public String information() {
    return String.format("제품번호=%d, 제품명=%s, 가격=%d, 세금=%.1f", pid, pName, price, tax);
  }

  public double getTax() {
    return tax;
  }

  public void setTax(double tax) {
    this.tax = tax;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getpName() {
    return pName;
  }

  public void setpName(String pName) {
    this.pName = pName;
  }

  public int getPid() {
    return pid;
  }

  public void setPid(int pid) {
    this.pid = pid;
  }

  double tax;


}
