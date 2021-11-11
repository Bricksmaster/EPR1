package at.fhburgenland.einfprog.vorlesung;

public class Operatoren {
    public static void main(String[] args) {
        int a = 17;
        int b = 3;

     /*   System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println("------");
     */
        a = a + 1;
        a += 1;
        a++;
        //Alle drei Elemente die gleiche Anweisung
        System.out.println(a);

        b = b - 1;
        b -= 1;
        b--;
        //Alle drei Elemente die gleiche Anweisung
    }
}