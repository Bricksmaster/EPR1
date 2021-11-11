package at.fhburgenland.einfprog.vorlesung;

public class Maximum {

   //Sortiert die Nummern nach ihrer Größe
    public static void sortSimple(int firstNumber, int secondNumber, int thirdNumber) {

        if ((firstNumber > secondNumber && firstNumber > thirdNumber)) {
            System.out.println(firstNumber);
        }

        else if (secondNumber > thirdNumber) {
            System.out.println(secondNumber);
        }

        else if (thirdNumber > secondNumber) {
            System.out.println(thirdNumber);
        }


    }
    public static void main(String[] args) {

        sortSimple(5, 2, 9);
        sortSimple(3,2,1);
        sortSimple(7,2,5);
        sortSimple(1 ,2,3);
    }
}