package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello from Jenkins Maven Build!");

        while (true) {
            try {
                Thread.sleep(10000); // sleep for 10 seconds
                System.out.println("Application is gud running...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
