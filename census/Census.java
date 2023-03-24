package com.census;

public class Census {
    private int id;
    private String state;
    private long population;
    private double literacy;

    public Census(int id, String state, long population, double literacy) {
        this.id = id;
        this.state = state;
        this.population = population;
        this.literacy = literacy;
    }

    public Census(Integer id, String state, String s) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public double getLiteracy() {
        return literacy;
    }

    public void setLiteracy(double literacy) {
        this.literacy = literacy;
    }

    @Override
    public String toString() {
        return "Census{" +
                "id=" + id +
                ", state='" + state + '\'' +
                ", population=" + population +
                ", literacy=" + literacy +
                '}';
    }
}


