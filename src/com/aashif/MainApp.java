package com.aashif;

import java.util.Scanner;
import com.aashif.week1.Task1;
import com.aashif.week1.Task2;
import com.aashif.week1.Task3;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display week selection
        System.out.println("Select the week (e.g., 1 for Week 1):");
        int week = scanner.nextInt();

        switch (week) {
            case 1:
                // Week 1 task selection
                System.out.println("You selected Week 1. Now, select the task (1, 2, or 3):");
                int task = scanner.nextInt();
                switch (task) {
                    case 1:
                        Task1 task1 = new Task1();
                        task1.runTask1();  // Method to input and display marks
                        break;
                    case 2:
                        Task2 task2 = new Task2();
                        task2.runTask2();  // Method to categorize and print mark ranges
                        break;
                    case 3:
                        Task3 task3 = new Task3();
                        task3.runTask3();  // Methods to compute average, max, min, sorting
                        break;
                    default:
                        System.out.println("Invalid task selected.");
                }
                break;
            
            // Add more cases here for future weeks (e.g., case 2 for Week 2)
            default:
                System.out.println("Invalid week selected.");
        }

        scanner.close();
    }
}