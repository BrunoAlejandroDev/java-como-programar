package com.bruno.javacomoprogramar.cap7.gradebookmatriz;

public class GradeBook {

    // ATRIBUTOS
    private String courseName;
    private int[][] grades; // array bidimensional de notas

    // CONSTRUTOR
    public GradeBook(String courseName, int[][] grades) {
        this.courseName = courseName;
        this.grades = grades;
    }

    // GETTERS E SETTERS
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // METODOS
    public void processGrades() {
        outputGrades();
        System.out.printf("Menor nota: %d%n", getMinimum());
        System.out.printf("Maior nota: %d%n", getMaximum());
    }

    // localizar menor nota
    public int getMinimum() {
        int lowGrade = grades[0][0];

        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                if (grade < lowGrade) {
                    lowGrade = grade;
                }
            }
        }
        return lowGrade;
    }

    // localizar nota maxima
    public int getMaximum() {
        int highGrade = grades[0][0];

        for (int[] studentGrades : grades) {
            for (int grade : studentGrades) {
                if (grade > highGrade) {
                    highGrade = grade;
                }
            }
        }
        return highGrade;
    }

    // verificar a nota media
    public double getAverage(int[] setOfGrades) {
        int total = 0;

        for (int grade : setOfGrades) {
            total += grade;
        }
        return (double) total / setOfGrades.length;
    }

    public void outputGrades() {
        System.out.println("          ==== NOTAS ====");
        System.out.print("            ");

        for (int test = 0; test < grades[0].length; test++) {
            System.out.printf("Test %d  ", test+1);
        }

        System.out.println("MÉDIA");
        for (int student = 0; student < grades.length; student++)
        {
            System.out.printf("Student %2d", student + 1);

            for (int test : grades[student])
            {
                System.out.printf("%8d", test); // imprimir as notas para cada linha
            }

            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }
    }
}
