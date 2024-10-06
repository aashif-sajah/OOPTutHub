package com.aashif.week1;

public class Task2 {
    public void runTask2() {
        int[] marks = {45, 32, 78, 90, 67, 55}; // Example array of marks

        int fail = 0, pass = 0, twoTwo = 0, twoOne = 0, first = 0;

        // Categorize marks
        for (int mark : marks) {
            if (mark < 40) {
                fail++;
            } else if (mark >= 40 && mark <= 49) {
                pass++;
            } else if (mark >= 50 && mark <= 59) {
                twoTwo++;
            } else if (mark >= 60 && mark <= 69) {
                twoOne++;
            } else if (mark >= 70) {
                first++;
            }
        }

        // Print the results
        System.out.println("Fail: " + fail);
        System.out.println("Pass: " + pass);
        System.out.println("2:2: " + twoTwo);
        System.out.println("2:1: " + twoOne);
        System.out.println("First: " + first);
    }
}
