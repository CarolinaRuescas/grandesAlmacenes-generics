package org.ies.grandesAlmacenes.model;

import java.util.Objects;

public class clothes extends product{

    private String type;
    private String size;
    private String brand;

    public clothes(int id, int price, int amount, String type, String size, String brand) {
        super(id, price, amount);
        this.type = type;
        this.size = size;
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        clothes clothes = (clothes) o;
        return Objects.equals(type, clothes.type) && Objects.equals(size, clothes.size) && Objects.equals(brand, clothes.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, size, brand);
    }

    @Override
    public String toString() {
        return "clothes{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", brand='" + brand + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
