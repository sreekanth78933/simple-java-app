package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to My Simple Java Application!");

        // Keep the application running
        while (true) {
            try {
                Thread.sleep(1000);  // Sleep for 1 second
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
