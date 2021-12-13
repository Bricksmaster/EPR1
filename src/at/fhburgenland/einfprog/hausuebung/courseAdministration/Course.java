/*
 * Copyright (c) 2021 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.hausuebung.courseAdministration;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private final String name;
    public  ArrayList<Student> students = new ArrayList<>();

    public Course(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public boolean removeStudent(Student student){
        return students.remove(student);
    }

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(name, course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

}

