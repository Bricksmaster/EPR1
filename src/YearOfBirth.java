public class YearOfBirth {
    static boolean reasonableyear(int year){
      if (year < 1900){
          return false;
      }
            else return year <= 2021;
    }
    public static void main(String[] args) {
        System.out.println(reasonableyear(2020));
        System.out.println(reasonableyear(1971));
        System.out.println(reasonableyear(2022));
        System.out.println(reasonableyear(1492));
    }
}
