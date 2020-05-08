package main.java;

import java.util.function.Function;
import java.util.function.Predicate;

public class Lambda {
    public static void main(String[] args) {

        Function<Integer,Integer> square = i-> i*i;
        System.out.println(square.apply(4));

        Predicate<Integer> evenOdd = i-> i%2==0;
        System.out.println(evenOdd.test(4));

        // old approach
        Interf i = new InterfImpl();
        i.m1();

        // lambda approach
        // we can define anonymous function using lambda
        Interf i1 = ()->System.out.println("Hello");
        i1.m1();

        // if we want to create operations using MathInterf
        MathInterf add = (a,b) -> a+ b;
        MathInterf mult = (a,b) -> a*b;
        System.out.println(add.operate(2,3));
        System.out.println(mult.operate(2,3));
    }
}
