/*
 * Copyright (c) 2021 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.vorlesung.course;

import java.util.ArrayList;

public class Course {
    private final String courseName;
    private final ArrayList<Person> students = new ArrayList<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<Person> getStudents() {
        return students;
    }

    public void addStudent(Person studentPerson){
        students.add(studentPerson);
    }
}
