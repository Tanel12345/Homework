package org.example;

public class Ship {
    private String name;
    private String color;
    private String engineType;
    private int age;

    public Ship(String name, String color, String engineType, int age) {
        this.name = name;
        this.color = color;
        this.engineType = engineType;
        this.age = age;
    }

    public Ship(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }


    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
    public String getEngineType() {
        return engineType;
    }


    public void setAge(int age) {this.age = age;}

    public int getAge() {return age;}

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", engineType='" + engineType + '\'' +
                ", age=" + age +
                '}';
    }
}

