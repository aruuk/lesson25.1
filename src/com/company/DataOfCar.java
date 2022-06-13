package com.company;

public class DataOfCar{

    private String color;
    private String model;
    private int price;
    private int year;

    public DataOfCar(String color, String model, int price, int year) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "DataOfCar{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                "}\n";
    }
}
