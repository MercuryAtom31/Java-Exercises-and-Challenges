import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] originalArray = new String[] {"First", "Second", "Third"};
        /*
        The Arrays.asList() method in Java is used to convert an array into a List.
        It allows you to work with arrays more conveniently using the methods
        provided by the List interface.
        */
        var originalList = Arrays.asList(originalArray);
        /*
        set() => Replaces the element at the specified position in this list with
        the specified element.
        */
        originalList.set(0, "one");
        System.out.println("list: " + originalList);
        System.out.println("array: " + Arrays.toString(originalArray));

        originalList.sort(Comparator.naturalOrder());
        System.out.println("array: " + Arrays.toString(originalArray));

//        originalList.add("fourth");

        List<String> newList = Arrays.asList("Sunday", "Monday", "Tuesday");
        System.out.println(newList);

//        ArrayList<String> stringLists = new ArrayList<>(List.of("Jan", "Feb", "Mar"));
//        String[] stringArray = stringLists.toArray(new String[0]);
    }
}