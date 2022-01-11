/*
 * Copyright (c) 2021 Daniel Szankovich.
 *  Discord: Bricksmaster#7130
 *  Check out my GitHub: https://github.com/Bricksmaster
 */

package at.fhburgenland.einfprog.vorlesung.course;

import java.util.Objects;

public class Person {
    private final String name;

    public Person(String name) {
        Objects.requireNonNull(name, "Name must not be null");
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
