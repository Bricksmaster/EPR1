public class ProfitableGamble {
    public static boolean isProfitable (double prob, int price, int pay){

        return (prob*price) > pay;
    }

    public static void main(String[] args) {
        System.out.println(isProfitable(0.2,50,9));
        System.out.println(isProfitable(0.9,1,2));
        System.out.println(isProfitable(0.9,3,2));
    }



}
