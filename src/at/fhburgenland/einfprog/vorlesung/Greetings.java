package at.fhburgenland.einfprog.vorlesung;

public class Greetings {
    static String greet(String name){
        return "at.fhburgenland.einfprog.vorlesung.Hello " + name + "!";
    }
    public static void main(String[] args){
        System.out.println(greet("Gerald"));
        System.out.println(greet("Tiffany"));
        System.out.println(greet("Ed"));
    }
    //Kürzel für static void main "main"
    //Kürzel für system.out "sout"

}
