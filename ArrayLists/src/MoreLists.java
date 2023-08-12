import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreLists {

    public static void main(String[] args) {

        String[] items = {"apples", "bananas", "milk", "eggs"};
        /*
         The List.of() method is used to create an immutable (unchangeable) list of
         strings from the items array. This means you cannot add, remove, or modify
         elements in this list after it's created.
         */
        List<String> list = List.of(items);
        System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);
        //addAll() method adds all the elements of the groceries' ArrayList.
        groceries.addAll(groceries);
        System.out.println(groceries);
        //Printing an element based on index.
        System.out.println("Third item = " + groceries.get(2));
        //Checking if the ArrayList contains the word "mustard". Works with Strings too!
        if (groceries.contains("mustard")) {
            System.out.println("List contains mustard");
        }
        //Retrieving the third element of the ArrayList.
        System.out.println("Third item = " + groceries.get(2));
        groceries.add("yogurt");
        //indexOf() finds the FIRST occurrence of the word inside the ArrayList.
        System.out.println("First = " + groceries.indexOf("yogurt"));
        //indexOf() finds the LAST occurrence of the word inside the ArrayList.
        System.out.println("Last = " + groceries.lastIndexOf("yogurt"));

        System.out.println(groceries);
        //Removing an element by index.
        groceries.remove(1);
        System.out.println(groceries);
        /*
        The remove() method only removes a single element, more specifically,
        it removes the first occurrence of an item.
        Removing an element by value.
        */
        groceries.remove("yogurt");
        System.out.println(groceries);

        groceries.removeAll(List.of("apples", "eggs"));
        System.out.println(groceries);
        /*
        retainAll method retains the specified elements and removes all the others.
        If the list doesn't contain one of the specified elements, such as "apples" in
        the code below, it simply ignores it.
        */
        groceries.retainAll(List.of("apples", "milk", "mustard",
                "cheese"));
        System.out.println(groceries);
        //Clears all the elements inside the list.
        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty());
        /*
         The List.of() method is used to create an immutable list of elements,
         which is then added to the groceries list.
        */
        groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
        /*
        The Arrays.asList() method creates a fixed-size list backed by the specified array.
        In this case, it creates a list containing the elements
        "eggs", "pickles", "mustard", and "lamb", and then adds this list
        to the groceries list using the addAll method.
        */
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "lamb"));

        System.out.println(groceries);
        //Sorts in alphabetical order.
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        //Sorts in reversed alphabetical order.
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        /*
        The following line takes the elements from the groceries list and copies them into
        the groceryArray array, effectively converting the list to an array.

        -> groceries.toArray(...): This method is used to convert the groceries list into
           an array.
        -> new String[groceries.size()]: This creates a new array of strings with
           a size equal to the number of elements in the groceries list.
        */
        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));
    }
}
