package Com.test.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindAllDuplicateElementFromString {
    public static void main(String[] args) {
        List<String> nos = Arrays.asList("Hello", "Good", "Morning", "Hello", "Hello");

        List<String> duplicateEle = nos.stream()
                                       .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                                       .entrySet().stream()
                                       .filter(x -> x.getValue() > 1)
                                       .map(Map.Entry::getKey)
                                       .collect(Collectors.toList());

        System.out.println("Duplicate Elements: " + duplicateEle);
    }
}
