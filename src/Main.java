import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Converting a primitive array to streams
//        int[] arr = {1, 2, 3, 4, 5};
//        Arrays.stream(arr).forEach(System.out::println);

        ArrayList<Integer> numbers  = new ArrayList<>();
        numbers.add(1);
        numbers.add(12);
        numbers.add(143);
        numbers.add(-1);

        Integer sum = numbers.stream().filter((n) -> n > 0).reduce(0, Integer::sum);

        System.out.println(sum);

        List<String> godNames = Arrays.asList("Shiva", "Hanuman" , "Bramha", "Vishnu", "Krishna", "Vamana" ,"Bhairav");
        godNames.stream().map((name) -> name.toUpperCase()).forEach(System.out::println);

        //flatmap example

        List<List<Integer>> integer = Arrays.asList(
                Arrays.asList(1, 5),
                Arrays.asList(10, 3),
                Arrays.asList(6, 20)
        );
        Integer sumOfIntInMappedList = integer.stream().flatMap(list -> list.stream()).reduce(0, Integer::sum);
        System.out.println(sumOfIntInMappedList);

        //Peek example

        List<Integer> peekExample = Arrays.asList(1, 4, 5, 8);
        final List<Integer> collect = peekExample.stream().map(n -> n * n).peek(System.out::println).collect(Collectors.toList());
//        System.out.println(collect.toString());

        //Distnict exmaple
        List<Integer> nonDuplicateSum = Arrays.asList(1, 3, 2, 1, 11, 4, 4);
        System.out.println(nonDuplicateSum.stream().distinct().reduce(0, Integer::sum));

        //skip
        List<Integer> skip = nonDuplicateSum.stream().skip(2).toList();
        System.out.println(skip.toString());

        //limit
        System.out.println(nonDuplicateSum.stream().limit(3).toList());

        // min, max
        Optional<Integer> min = peekExample.stream().min(Comparator.naturalOrder());
        System.out.println(min.get());

        Optional<Integer> max = peekExample.stream().max(Comparator.naturalOrder());
        System.out.println(max.get());

        //any match
        List<Integer> anyMatchExample = Arrays.asList(1, 3, 5, 7);
        boolean result = anyMatchExample.stream().anyMatch(n -> n % 2 == 0);
        System.out.println(result);

        //sum
        int sumByFunction = peekExample.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sumByFunction);
    }
}