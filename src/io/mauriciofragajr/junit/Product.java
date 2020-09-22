package io.mauriciofragajr.junit;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        super();
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object p) {
        return ((Product) p).getName().equals(this.getName());
    }
}
