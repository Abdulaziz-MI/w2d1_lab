import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//
////        SCOTTISH ISLANDS
//        List<String> scottishIslands = new ArrayList<>();
//        scottishIslands.add("Jura");
//        scottishIslands.add("Mull");
//        scottishIslands.add("Skye");
//        scottishIslands.add("Arran");
//        scottishIslands.add("Tresco");
//
////        1. Add "Coll" to the end of the list
//        scottishIslands.add("Coll");
//        System.out.println("#1: "+ scottishIslands);
////        2. Add "Tiree" to the start of the list
//        scottishIslands.add(0, "Tiree");
//        System.out.println("#2: "+ scottishIslands);
////        3. Add "Islay" after "Jura" and before "Mull"
//        int indexOfJure = scottishIslands.indexOf("Jura");
//        scottishIslands.add(indexOfJure + 1, "Islay");
//        System.out.println("#3: "+ scottishIslands);
////        4. Print out the index position of "Skye"
//        System.out.println("#4: " +scottishIslands.indexOf("Skye"));
////        5. Remove "Tresco" from the list by name
//        scottishIslands.remove("Tresco");
//        System.out.println("#5: "+ scottishIslands);
////        6. Remove "Arran" from the list by index
//        scottishIslands.remove(4);
//        System.out.println("#6: "+ scottishIslands);
////        7. Print the number of islands in your arraylist
//        System.out.println("#7: "+ scottishIslands.size());
////        8. Sort the list alphabetically
//        Collections.sort(scottishIslands);
//        System.out.println("#8"+ scottishIslands);
////        9. Print out all the islands using a for loop
//             for (String scottishIsland : scottishIslands) {
//                 System.out.println("#9"+ scottishIsland);
//             }



//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
//        ArrayList<Integer> evenNumbers =
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                int evenNumber = number;
                System.out.println("#1N " +number);
            }
        }
//        2. Print the difference between the largest and smallest value
        int difference = Collections.max(numbers) - Collections.min(numbers);
        System.out.println("#2N " + difference);

//        3. Print True if the list contains a 1 next to a 1 somewhere.
        boolean sameNumber= false;

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == 1 && numbers.get(i+1) ==1){
                sameNumber = true;
              break;
            }
            System.out.println("#3N "+ sameNumber);

//        4. Print the sum of the numbers,
            int sum = 0;
            for (int number:numbers
                 ) {
                sum += number;}
            System.out.println("#4N " + sum);

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//          So [2, 7, 13, 2] would have sum of 9.

              sum = 0;
                for (i = 0; i < numbers.size(); i++) {
                    /* if the number is not 13 AND
                    is Either first in the array OR is not preceded by 13 */
                    if (numbers.get(i) != 13 && (i == 0 || numbers.get(i - 1) != 13)) {
                        sum += numbers.get(i);
                    }

    }
            System.out.println("#5N "+ sum);}
}}
