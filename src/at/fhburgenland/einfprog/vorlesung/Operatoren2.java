package at.fhburgenland.einfprog.vorlesung;

public class Operatoren2 {
    public static void main(String[] args) {
        System.out.println(17 < 3);
        System.out.println(17 > 3);
        System.out.println(17 == 3);
        System.out.println(17 != 3);

        System.out.println(17 <= 3);
        System.out.println(17 < 17);
        System.out.println(17 <= 17);

        String name = "John";
        if (name.equals("John")){
            System.out.println("at.fhburgenland.einfprog.vorlesung.Hello John");
        }
        else
        {
            System.out.println("at.fhburgenland.einfprog.vorlesung.Hello Stranger");
        }

    }

}
