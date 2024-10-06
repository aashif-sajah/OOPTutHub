package com.aashif.week1;

public class Task3 {
    public void runTask3() {
        int[] marks = {45, 32, 78, 90, 67, 55};

        System.out.println("Average: " + computeAverage(marks));
        System.out.println("Maximum mark: " + findMax(marks));
        System.out.println("Minimum mark: " + findMin(marks));

        int[] sortedMarks = sortMarks(marks);
        System.out.println("Sorted marks: ");
        for (int mark : sortedMarks) {
            System.out.println(mark);
        }
    }

    // Method to compute the average of the marks
    public double computeAverage(int[] marks) {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / (double) marks.length;
    }

    // Method to find the maximum mark
    public int findMax(int[] marks) {
        int max = marks[0];
        for (int mark : marks) {
            if (mark > max) {
                max = mark;
            }
        }
        return max;
    }

    // Method to find the minimum mark
    public int findMin(int[] marks) {
        int min = marks[0];
        for (int mark : marks) {
            if (mark < min) {
                min = mark;
            }
        }
        return min;
    }

    // Method to sort the marks in ascending order
    public int[] sortMarks(int[] marks) {
        int[] sortedMarks = marks.clone();
        for (int i = 0; i < sortedMarks.length - 1; i++) {
            for (int j = i + 1; j < sortedMarks.length; j++) {
                if (sortedMarks[i] > sortedMarks[j]) {
                    // Swap
                    int temp = sortedMarks[i];
                    sortedMarks[i] = sortedMarks[j];
                    sortedMarks[j] = temp;
                }
            }
        }
        return sortedMarks;
    }
}
