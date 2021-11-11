public class Weekdays {
    public static String weekday(int day){
        if (day == 1) {
            return ("Monday");
        }
                else if (day == 2){
                    return ("Tuesday");
        }
                         else if (day == 3){
                            return ("Wednesday");
        }
                                else if (day == 4){
                                    return ("Thursday");
        }
                                        else if (day == 5){
                                            return ("Friday");
        }
                                                else if (day == 6){
                                                    return ("Saturday");
        }
                                                        else if (day == 7){
                                                             return ("Sunday");
        }
                                                                else {
                                                                    return ("Invalid");
        }
    }
    public static void main(String[] args) {
        System.out.println(weekday(7));
        System.out.println(weekday(3));
        System.out.println(weekday(0));
    }
}
