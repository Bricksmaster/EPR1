public class PositiveOrNegative {
    static String positiveornegative(int i){
        if (i > 0) {
            return "Positive";
        }
        else if (i == 0){
            return "Zero";
        }
        else {
            return "Negative";
        }
    }

    public static void main(String[] args) {
        System.out.println(positiveornegative(7));
        System.out.println(positiveornegative(-2));
        System.out.println(positiveornegative(0));
    }
}
