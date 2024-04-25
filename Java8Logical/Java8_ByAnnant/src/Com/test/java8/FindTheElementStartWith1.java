package Com.test.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindTheElementStartWith1 {
    public static void main(String[] args) {
        int[] numbers = {5, 9, 11, 2, 8, 21, 1};
        List<String> stringList = Arrays.stream(numbers)
                                       .mapToObj(String::valueOf)
                                       .filter(s -> s.startsWith("1"))
                                       .collect(Collectors.toList());
        System.out.println(stringList);
    }
}