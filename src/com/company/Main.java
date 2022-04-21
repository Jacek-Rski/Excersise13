package com.company;

import org.w3c.dom.css.Counter;

import java.util.concurrent.Semaphore;

public class Main {
    static int counter = 20;
    public static void main(String[] args) {

        Restroom1 personOne = new Restroom1();
        Restroom2 personTwo = new Restroom2();
        Restroom3 personThree = new Restroom3();
        Restroom4 personFour = new Restroom4();
        Timer timer = new Timer();

        Thread t1 = new Thread(personOne);
        Thread t2 = new Thread(personTwo);
        Thread t3 = new Thread(personThree);
        Thread t4 = new Thread(personFour);
        //Thread t5 = new Thread (timer);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        //t5.start();

    }
}
class Restroom1 implements Runnable{

    public void run(){
        for (int i = 0; i <Main.counter; i++) {
            System.out.println("A person has used restroom one");
            try {Thread.sleep(2250);} catch (InterruptedException e) {e.printStackTrace();}
            Main.counter =- 1;

        }
    }
}



class Restroom2 implements Runnable{
    public void run(){
        for (int i = 0; i <Main.counter; i++) {
            System.out.println("A person has used restroom two");
            try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
            Main.counter =- 1;


        }
    }
}

class Restroom3 implements Runnable{

    public void run(){
        for (int i = 0; i <Main.counter; i++) {
        System.out.println("A person has used restroom three");
        try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
            Main.counter =- 1;

        }
    }
}

class Restroom4 implements Runnable{

    public void run(){
        for (int i = 0; i <Main.counter; i++) {
            System.out.println("A person has used restroom four");
            try {Thread.sleep(3500);} catch (InterruptedException e) {e.printStackTrace();}
            Main.counter =- 1;


        }
    }
}
class Timer implements Runnable{
    public void run(){
        for (int i = 0; i <30; i++) {
            System.out.println(i);
            try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}




        }
    }

}


