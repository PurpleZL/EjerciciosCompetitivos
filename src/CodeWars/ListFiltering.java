package CodeWars;

import java.util.List;
import java.util.stream.Stream;

public class ListFiltering {
    public static void main(String[] args) {
        filterList(List.of(1, 2, "aasf", "1", "123", 123)).stream().forEach(System.out::println);
    }

    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(n -> n instanceof Integer).toList();
    }
}
