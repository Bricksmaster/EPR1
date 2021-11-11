public class HackerSpeak {

    static String hecker(String word){
        //char[] heckercreate= new char[20];
        char[] heckerCreate = word.toCharArray();

        //"Daniel"
        /*char[] test = new char[word.length()];
        for(int i=0; i<word.length(); i++)
        {
            test[i]=word.charAt(i); //-> {'D','a','n', usw.}
        }*/

        for (int i=0; i < word.length(); i++) {
            if (heckerCreate[i]=='a'){
                heckerCreate[i]='4';
            }
            if (heckerCreate[i]=='e'){
                heckerCreate[i]='3';
            }
        }

        String heckerOutput="";
        for (char element : heckerCreate){
            heckerOutput=heckerOutput+element;
        }

        return heckerOutput;
    }

    public static void main(String[] args) {
        System.out.println(hecker("Daniel"));
    }

}
