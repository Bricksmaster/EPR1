public class Gamble {
        static boolean profitableGamble(double prob, int prize, int pay) {
            return (prob * prize) > pay;
        }
        public static void main(String[] args) {
            System.out.println(profitableGamble(0.2, 50, 9));
            System.out.println(profitableGamble(0.9, 1, 2));
            System.out.println(profitableGamble(0.9, 3, 2));
        }
    }

