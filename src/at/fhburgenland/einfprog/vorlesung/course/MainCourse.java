/*
 * Copyright (c) 2021 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.vorlesung.course;

public class MainCourse {

    public static void main(String[] args) {
        Course epr1 = new Course("EPR1");
        epr1.addStudent(new Person("Daniel"));

        epr1.addStudent(new Person(null));

        for (Person student : epr1.getStudents()){
            System.out.println(student.getName());
        }
    }

}
