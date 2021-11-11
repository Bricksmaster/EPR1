package at.fhburgenland.einfprog.vorlesung;

public class Person {
    private final String name;
    private final boolean hasGlasses;

    public Person(String name, boolean hasGlasses){
        this.name = name;
        this.hasGlasses = hasGlasses;
    }

    public String getName(){
        return name;
    }

    public boolean hasGlasses(){
        return hasGlasses;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Joe", true);
        if (person1.hasGlasses()){
            System.out.println(person1.getName() + " has glasses");
        }
        else {
            System.out.println(person1.getName() + " does not have glasses");
        }

    }
}
