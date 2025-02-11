package org.ies.grandesAlmacenes.model;

import java.util.Objects;

public class Electronics extends Product {

    private String type;
    private String model;
    private String manufacturer;

    public Electronics(int id, int price, int amount, String type, String model, String manufacturer) {
        super(id, price, amount);
        this.type = type;
        this.model = model;
        this.manufacturer = manufacturer;
    }

    @Override
    public void info() {
        System.out.println("Díspositivo electrónico (" + id + "): Precio " + price + ", unidades " + amount);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Electronics that = (Electronics) o;
        return Objects.equals(type, that.type) && Objects.equals(model, that.model) && Objects.equals(manufacturer, that.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, model, manufacturer);
    }

    @Override
    public String toString() {
        return "electronics{" +
                "type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
