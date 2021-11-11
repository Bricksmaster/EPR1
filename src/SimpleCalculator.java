public class SimpleCalculator {
    static int calculation(int a, int b, String c) {
        if (c == "+") {
            return (a + b);
        }
            else if (c == "-") {
             return (a - b);
        }
                else if (c == "*") {
                    return (a * b);
        }
                    else if (c == "/") {
                        return (a / b);
        }
                        else if (c == "%") {
                            return (a % b);
        }
                                else {
                                    System.out.println("Invalid Operator: " + c );
                                    System.exit(1);
                                    return  (-99999);

        }
    }

    public static void main(String[] args) {
        System.out.println(calculation(4, 9, "+"));
        System.out.println(calculation(12, 5, "-"));
        System.out.println(calculation(6, 3, "*"));
        System.out.println(calculation(25, 5, "/"));
        System.out.println(calculation(14, 3, "%"));
        System.out.println(calculation(14, 3, "++"));
    }
}
