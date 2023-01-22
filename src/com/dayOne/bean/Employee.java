package com.dayOne.bean;

public class Employee {
    private int eId;
    String name;
    double salary;

    Employee( ){
        System.out.println("Rajeta is Great !");
    }
    public Employee(int eId, String name, double salary){
        System.out.println(eId+" "+name+" "+salary);
    }

    public void setData (int eId, String name, double salary ) {
        //this is used to refer to the data for the object locally i.e. only inside the method
        this.eId = eId;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println(eId + " " + name + " " + salary);
    }

    // Getter and Setter
    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //now if you try to disply the object then this toString function will be invoked internally

    public String toString() {
        return eId + " " + name + " " + salary;
    }

}

