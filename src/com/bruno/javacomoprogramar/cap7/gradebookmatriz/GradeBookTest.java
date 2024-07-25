package com.bruno.javacomoprogramar.cap7.gradebookmatriz;

public class GradeBookTest {
    public static void main(String[] args) {

        int[][] gradesArray = {
                {87, 96, 70},
                {68, 87, 90},
                {94, 100, 90},
                {100, 81, 82},
                {83, 65, 85},
                {78, 87, 65}
        };

        GradeBook myGradeBook = new GradeBook("Introduction to Java Programming", gradesArray);
        System.out.println("Welcome to grade book for " + myGradeBook.getCourseName());
        myGradeBook.processGrades();

    }
}