package main.java;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i<10 ; i++){
            System.out.println("Child Thread without using Lambda");
        }
    }
}
