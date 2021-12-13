/*
 * Copyright (c) 2021 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.hausuebung.courseAdministration;
import java.util.Scanner;

public class CourseAdmin {
    static java.util.Scanner scanner = new java.util.Scanner((System.in));

    static void addStudent(Course c) {
        System.out.print("Enter matriculation number:");
        String matriclenumber = scanner.nextLine();
        System.out.print("Enter student name:");
        String studentname = scanner.nextLine();
        System.out.print("Enter student birthday:");
        String studentbirthday = scanner.nextLine();
        Student student = new Student(matriclenumber, studentname, studentbirthday);
        if (!c.getStudents().contains(student)){
            c.addStudent(student);
        }
        else {
            System.out.println("This student already exists!");
        }
    }

    static void listStudents(Course c) {
        System.out.println("Matric. Number:     Name:               Birthday:");
        for (Student student : c.getStudents()){
            System.out.println(student);
        }
    }

    static void removeStudent(Course c) {
        System.out.print("Enter matriculation number from the student you want to remove:");
        String matriclenumber = scanner.nextLine();
        if (!c.removeStudent(new Student(matriclenumber,"",""))){
            System.out.println("Student not found in the course!");
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter the course name:");
        String courseinput = scanner.nextLine();
        Course course = new Course(courseinput);

        boolean endProgram = false;
        while (!endProgram) {
            System.out.println();
            System.out.println();
            System.out.println("Main Menu");
            System.out.println("---------");
            System.out.println();
            System.out.println("    L  -> List Students");
            System.out.println("    A  -> Add Students");
            System.out.println("    R  -> Remove Students");
            System.out.println("\n    E  -> Exit program");
            System.out.print("\nChoice: ");
            String input2 = scanner.nextLine().toUpperCase();
            switch (input2) {
                case "L" -> listStudents(course);
                case "A" -> addStudent(course);
                case "R" -> removeStudent(course);
                case "E" -> endProgram = true;
                default -> System.out.println("Invalid Choice!");
            }
        }
    }
}
