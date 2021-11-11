public class ConvertToDashes {
   static String dashes (int number){

       String concat="";
    // Menge M{1,2,3,4,5,6,...,number} -> M{0,1,2,3,...,number-1}
       if (number<=0 || number >60){
           return "Error! Enter a number between 1-60!";
       }
       for (int i=0; i<number; i++){
            concat=concat + "-";
       }
       return concat;
    }

    public static void main(String[] args) {
        System.out.println(dashes(3));
        System.out.println(dashes(-90));
    }


    //String[] dash = {"-"};


}
