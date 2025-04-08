package HOMEWORK2_week.chep06.arrayhomework.hw3.dto;

public class ProductDTO {
    private int pid;
    private String pname;
    private int price;
    private double tax;

    public ProductDTO() {
    }

    public ProductDTO(int pid, double tax, int price, String pname) {
        this.pid = pid;
        this.tax = tax;
        this.price = price;
        this.pname = pname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return "제품 번호: " + pid +
                ", 제품명: " + pname +
                ", 가격: " + price +
                ", 세금: " + tax;
    }
}
