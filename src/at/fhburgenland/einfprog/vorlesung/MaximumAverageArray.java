package at.fhburgenland.einfprog.vorlesung;

public class MaximumAverageArray {
    static int maximum(int[] numbers){
        if (numbers[0] > numbers[1] && numbers[0] > numbers[2]){
            return numbers[0];
        } else if (numbers[1] > numbers[2]){
            return numbers[2];
        } else {
            return numbers[3];
        }
    }

    static double average(int[] numbers){
        double sum = numbers[0] + numbers[1] + numbers[2];
        return sum / numbers.length;
    }
}
