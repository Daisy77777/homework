package com.swufe.javaee.beerV1.model;

public class Beer {
    private String band;
    private double size;
    private String name;

    public Beer(String band, double size, String name) {
        this.band = band;
        this.size = size;
        this.name = name;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setNand(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Beer{" +
                "band='" + band + '\'' +
                ", size=" + size + "name=" + name +
                '}';
    }
}
