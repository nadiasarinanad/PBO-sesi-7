import java.util.List;

public class Iterations {

    static Iterable<String> names = List.of("Febriano", "Antonetah", "Nadia");
    static java.util.Iterator<String> Iterator = names.iterator();

    public static void iterable() {
        System.out.println("Iterable");

        for (String name: names) {
            System.out.println(name);
        }

        System.out.println();
    }
    
    public static void iterator() {
        System.out.println("Iterator");

        while (Iterator.hasNext()) {
            String name = Iterator.next();
            System.out.println(name);
        }

        System.out.println();
    }

}
