package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello from Jenkins Maven Build!");

        while (true) {
            try {
                Thread.sleep(10000); // sleep for 10 seconds
                System.out.println("Application is running on version V2...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
