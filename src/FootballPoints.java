public class FootballPoints {
    static int footballPoints(int win, int draw, int loss){
       return ((win*3) + (draw)*1 + (loss*0));
    }

    public static void main(String[] args) {
        System.out.println(footballPoints(3 , 4 , 2 ));
        System.out.println(footballPoints(5 , 0 , 2 ));
        System.out.println(footballPoints(0 , 0 , 1 ));
    }
}
