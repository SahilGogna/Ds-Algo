package main.java;

public class Employee {

    String name;
    int eno;
    Employee(String name, int eno){
        this.name = name;
        this.eno = eno;
    }

    @Override
    public String toString() {
        return "Name: "+ name +" Number: "+eno;
    }
}
