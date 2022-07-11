package StreamApi;

import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApi {
    public static void main(String[] args) {
        sortedExample();
        filterExample();
        mapVsPeekExample();
        flatMapExample();
        reduceExample();
    }

    public static void sortedExample() {
        System.out.println("---- SORTED Example ----");

        Map<String, String> testMap = new LinkedHashMap<>(
                Map.of(
                        "1", "Ivan",
                        "3", "Hanna",
                        "2", "Natalia"));

//        https://stackabuse.com/guide-to-java-8-collectors-tomap/
        testMap = testMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> newValue,
                        LinkedHashMap::new));
        System.out.println(testMap);
    }

    public static void filterExample() {
        System.out.println("---- FILTER Example ----");

        List<Integer> intList = IntStream.range(0, 10).filter(x -> x % 2 == 0).boxed().collect(Collectors.toList());
        System.out.println(intList);
    }

    public static void mapVsPeekExample() {
        System.out.println("---- MAP VS PEEK Example ----");

        List<Integer> originalList = IntStream.rangeClosed(0, 10).boxed().collect(Collectors.toList());
        System.out.println("Original list: " + originalList);

        List<Integer> integerMappedList = originalList.stream().map(x -> x + 10).collect(Collectors.toList());
        System.out.println("Mapped integer list: " + integerMappedList);

        List<Integer> integerPeekList = originalList.stream().peek(x -> {
            if (x % 2 == 0) {
                System.out.println("Print list value in peek method if x %2 == 0: " + (x + 10));
            }
        }).collect(Collectors.toList());
        System.out.println("Peeked integer list: " + integerPeekList);
    }

    public static void flatMapExample() {
        System.out.println("---- FLATMAP Example ----");

        List<String> firstNamesList = List.of("Ivan", "Hanna", "Natalia");
        List<String> secondNamesList = List.of("Petro", "Igor", "Stepan");

        System.out.println("*** Convert many elements to one ***");
//        List<String> myNamesList = Stream.concat(
//                Stream.of(firstNamesList.toArray(String[]::new)),
//                Stream.of(secondNamesList.toArray(String[]::new)))
//                .collect(Collectors.toList());

        List<String> myNamesList = Stream.of(firstNamesList, secondNamesList)
                .map(x -> x.toArray(String[]::new))
                .flatMap(Stream::of)
                .collect(Collectors.toList());

        myNamesList.forEach(System.out::println);

        System.out.println("*** Convert one element to many ***");
        firstNamesList.stream().flatMap(x -> Stream.of(x + 1, x + 2)).forEach(System.out::println);
    }

    public static void reduceExample() {
        System.out.println("---- REDUCE Example ----");

        System.out.println("*** Reduce for primitives ***");
        Integer sumOfNumbers = IntStream.rangeClosed(0, 5).reduce(0, Integer::sum);
        System.out.println(sumOfNumbers);

        List<User> listOfUsers = List.of(
                new User("Ivan", getRandomValue()),
                new User("Stepan", getRandomValue()),
                new User("Fedor", getRandomValue()));

        System.out.println("Original list of users:" + listOfUsers);

        float averageUserAge = listOfUsers.stream()
                .reduce(0, (x1, x2) -> x1 + x2.getAge(), Integer::sum).floatValue() / listOfUsers.size();
//        System.out.println("Test: " + listOfUsers.stream().collect(Collectors.averagingInt(User::getAge)));
        System.out.println("*** Reduce for User class ***");
        System.out.println("The average user age is: " + new DecimalFormat("#.#").format(averageUserAge));
    }

    private static int getRandomValue() {
        return ThreadLocalRandom.current().nextInt(18, 60 + 1);
    }
}
