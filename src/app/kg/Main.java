package app.kg;

import app.kg.Exam;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Exam exam = new Exam("OOP", 89);
        Exam exam2 = new Exam("Database", 85);

        ArrayList<Exam> exams = new ArrayList<Exam>();
        exams.add(exam);
        exams.add(exam2);

        exams.add(new Exam("Electronics", 95));

        System.out.println( exams.size());
        System.out.println("Hello");

        for(Exam e:exams){
            System.out.println(e);
        }

    }
}