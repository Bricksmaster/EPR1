/*
 * Copyright (c) 2021 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.hausuebung.courseAdministration;

import java.util.Objects;

public class Student {
    private final String matricNumber;
    private final String name;
    private final String birthday;

    public Student(String matricNumber, String name, String birthday) {
        this.matricNumber = matricNumber;
        this.name = name;
        this.birthday = birthday;
    }

    public String getMatricNumber() {
        return matricNumber;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(matricNumber, student.matricNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricNumber);
    }

    @Override
    public String toString() {
       // return  "\nStudent Name: " + name + "\nStudent Matriculation Number: " + matricNumber + "\nStudent Birthday: " + birthday;
        String result = "";
        result += matricNumber;
        for (int i=0; i<20-matricNumber.length(); i++){
            result += " ";
        }
        result += name;
        for (int i=0; i<20-name.length(); i++){
            result += " ";
        }
        result += birthday;
        return result;
    }
}

