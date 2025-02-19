package org.ies.grandesAlmacenes.model;

import java.util.Objects;

public abstract class Product {
    protected int id;
    protected int price;
    protected int amount;

    public Product(int id, int price, int amount) {
        this.id = id;
        this.price = price;
        this.amount = amount;
    }
    public abstract void info();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && price == product.price && amount == product.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, amount);
    }
}
