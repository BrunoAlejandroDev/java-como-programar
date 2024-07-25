package com.bruno.javacomoprogramar.cap7.gradebookarray;

public class GradeBookTest {
    public static void main(String[] args) {

        int[] gradesArray = {87, 65, 94, 73, 100, 51, 82, 67, 78, 85};

        GradeBook myGradeBook = new GradeBook("Introduction to Java Programming", gradesArray);

        System.out.printf("Welcome to the grade book for %s%n%n", myGradeBook.getCourseName());
        myGradeBook.processGrades();

    }
}
