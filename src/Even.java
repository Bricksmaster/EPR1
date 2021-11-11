public class Even {
    static boolean isEven(int i){
        return (i % 2) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(2));
        System.out.println(isEven(7));
        System.out.println(isEven(0));
        System.out.println(isEven(-3));
        System.out.println(isEven(-42));
    }
}
