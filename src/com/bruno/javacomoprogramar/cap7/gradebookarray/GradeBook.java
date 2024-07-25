package com.bruno.javacomoprogramar.cap7.gradebookarray;

public class GradeBook {

    // ATRIBUTOS
    private String courseName;
    private int[] grades; // array de notas

    // CONSTRUTOR
    public GradeBook(String courseName, int[] grades) {
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

    // METODOS PUBLICOS
    public void processGrades() {
        outputGrades();
        System.out.println();
        System.out.printf("Classe average is: %.2f%n", getAverage());
        System.out.printf("Lowest grade is: %d%n", getMinimum());
        System.out.printf("Highest grade is: %d%n", getMaximum());
    }

    // localizar nota minima
    public int getMinimum() {
        int lowGrade = grades[0]; // supôe que a menor nota está na posição 0 do array para fins de comparação

        for (int grade : grades) {
            if (lowGrade > grade) {
                lowGrade = grade; // nota mais baixa atualizada
            }
        }
        return lowGrade;
    }

    // localizar a maior nota
    public int getMaximum() {
        int highGrade = grades[0]; // supôe que a maior nota está na posição 0 do array para fins de comparação

        for (int grade : grades) {
            if (highGrade < grade) {
                highGrade = grade;
            }
        }
        return highGrade;
    }

    // calcular a media
    public double getAverage() {
        int total = 0;

        for (int grade : grades) {
            total += grade;
        }
        return (double)total / grades.length;
    }

    // gerar saida das notas
    public void outputGrades() {
        System.out.printf("The grades are: %n");

        for (int student = 0; student < grades.length; student++) {
            System.out.printf("Student %2d: %3d%n", student+1, grades[student]);
        }
    }

}
