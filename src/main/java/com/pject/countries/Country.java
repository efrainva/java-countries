package com.pject.countries;

public class Country {
    // Name, Population, Land Mass in Km2, Median Ag
    private String name;
    private int pop;
    private int land;
    private int age;

    public Country(String name, int pop, int land,int age){
        this.name = name;
        this.pop = pop;
        this.land= land;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPop() {
        return pop;
    }

    public void setPop(int pop) {
        this.pop = pop;
    }

    public int getLand() {
        return land;
    }

    public void setLand(int land) {
        this.land = land;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
