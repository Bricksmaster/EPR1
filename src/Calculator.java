public class Calculator {
    static float calculate(float valueOne, float valueTwo, String operator) {
        if (operator.equals("+")) {
            return (valueOne + valueTwo);
        } else if (operator.equals("-")) {
            return (valueOne - valueTwo);
        } else if (operator.equals("*")) {
            return (valueOne * valueTwo);
        } else if (operator.equals("/")) {
            return (valueOne / valueTwo);
        } else if (operator.equals("%")) {
            return (valueOne % valueTwo);
        } else {
            System.out.println("invalid");
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(calculate(1, 1, "+"));
        System.out.println(calculate(-2, 15, "-"));
        System.out.println(calculate(8, 4, "*"));
        System.out.println(calculate(49, 4, "/"));
        System.out.println(calculate(14, 3, "%"));
    }
}
