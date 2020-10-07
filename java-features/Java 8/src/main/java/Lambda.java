package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.*;

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

        // Normal thread handling without using lambda expression
//        MyRunnable r1 = new MyRunnable();
//        Thread thread1 = new Thread(r1);
//        thread1.start();
//        for (int j =0; j< 10; j++){
//            System.out.println("Main thread as Usual");
//        }

        // Thread handling using lambda, we don't need the MyRunnable class
        Runnable r = ()->{
            // do run method stuff here
            System.out.println("Hi I am child thread using lambda");
        };
        Thread thread1 = new Thread(r);
        thread1.start();
        System.out.println("Main thread as Usual");

        // use of lamdas in the collections
        // without using lambdas we have to make a seperate class MyComparator
        ArrayList<Integer> list = new ArrayList<>();
        list.add(25);
        list.add(15);
        list.add(45);
        list.add(35);
        list.add(5);
        list.add(-5);
        list.add(-15);
        list.add(45);

//        Collections.sort(list,new MyComparator());
//        System.out.println(list);

        // using lambdas
        Comparator<Integer> c = (I1,I2) -> (I1<I2)?-1:(I1>I2)?1:0;
        Collections.sort(list,c);
        list.stream().forEach(System.out::println);

        // using lambdas with the custom class
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Sahil",33));
        empList.add(new Employee("Aastha",13));
        empList.add(new Employee("Zinnia",23));
        empList.add(new Employee("John",3));
        empList.add(new Employee("Harry",133));
        empList.add(new Employee("Jazz",323));

        Collections.sort(empList,(e1,e2)->(e1.eno < e2.eno)?-1:(e1.eno > e2.eno)?1:0);
        empList.stream().forEach(System.out::println);

        System.out.println("----------");

        Collections.sort(empList,(e1,e2)->e1.name.compareTo(e2.name));
        empList.stream().forEach(System.out::println);

        // anonymous inner class
        // these can be replaced by the lambda as stated earlier in this class
        Runnable run1 = new Runnable() {
            @Override
            public void run() {
               // write code
            }
        };
        Thread th = new Thread(run1);
        th.start();

        // using predefined functional interfaces
        Predicate<Employee> p1 = employee -> employee.eno>200 && employee.name.startsWith("S");
        p1.test(new Employee("Sahil",309));

        Function<String,Integer> lengthLambda = s->s.length();

        Supplier<String> s = () -> {
            String otp = "";
            for(int k =0;k<4;k++){
                otp = otp+(int)(Math.random() * 10);
            }
            return otp;
        };
        System.out.println(s.get());

        // BiPredicate, takes 2 arguments and returns boolean
        BiPredicate<Integer, Integer> bp = (a,b) -> (a+b)%2 == 0;
        bp.test(3,3);

        // BiFunction
        BiFunction<String, Integer, Employee> bf = (name,eno)-> new Employee(name,eno);
        System.out.println(bf.apply("New Employee",12345));

    }
}
