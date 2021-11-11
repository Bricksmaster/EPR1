public class ContainsNameSimple {

    static boolean contains(String[] names, String searchTerm ){
      if (names.length != 3) {
            System.out.println("Array does not have three elements!");
        }
       return names[0].equals(searchTerm) ||
               names[1].equals(searchTerm) ||
               names[2].equals(searchTerm);
    }

    public static void main(String[] args) {
        String[] names = {"Joe", "Jill", "Jim"};
        System.out.println(contains(names, "John"));
        System.out.println(contains(names, "Jill"));
    }
}
