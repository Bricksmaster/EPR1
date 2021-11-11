public class MinuteToSecond_Converter {
    static int convert(int min){
        return ( min * 60 );
    }

    public static void main(String[] args) {
        System.out.println(convert(5));
        System.out.println(convert(3));
        System.out.println(convert(2));
    }
}
