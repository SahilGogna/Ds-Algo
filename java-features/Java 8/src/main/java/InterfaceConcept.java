package main.java;

public class InterfaceConcept implements I1, I2 {
    // to read about the new features of interfaces read the google doc

    public static void main(String[] args) {
        InterfaceConcept i = new InterfaceConcept();
        i.m1();
    }

    // since both interfaces has same method, it is compulsory to override
    @Override
    public void m1() {
//        System.out.println("Overridden print method");
        // if I want to call I1 m1 method?
        I1.super.m1();
    }
}
