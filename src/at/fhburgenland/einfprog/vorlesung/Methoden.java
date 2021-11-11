package at.fhburgenland.einfprog.vorlesung;

public class Methoden {
   static int funnyCalc(int a, int b){
            return (a*b) - (a+b);
    }
    static void pr(String outText){
       System.out.println(outText);
    }
    static String niceConcat(String value1, String value2){
       return value1 + " " + value2; //Return muss die letzte Anweisung sein
    }
    public static void main(String[] args){
       pr("at.fhburgenland.einfprog.vorlesung.Hello");
        int result = funnyCalc(3, 4);
       System.out.println(result);

       //Void wird genutzt wenn der Output nicht vorhanden ist
        // Kein Void wenn der return Befehl vorhanden ist

    pr("at.fhburgenland.einfprog.vorlesung.Hello");
    int nr1 = 3;
    int nr2 = 4;
    int resultnew = funnyCalc(nr1, nr2);
        System.out.println(result);
   }

}
