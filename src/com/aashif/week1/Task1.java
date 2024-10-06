package com.aashif.week1;

import java.util.Scanner;

public class Task1 {
    public void runTask1() {
        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[6];

        // Read six marks from the user
        System.out.println("Enter six marks: ");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = scanner.nextInt();
        }

        // Print the entered marks
        System.out.println("Marks entered: ");
        for (int mark : marks) {
            System.out.println(mark);
        }
    }
}
