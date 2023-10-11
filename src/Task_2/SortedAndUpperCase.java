package Task_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedAndUpperCase {
//    public static void main(String[] args) throws IOException {
    public List<String> getNn(String st) throws IOException {
        Stream <String> fs = Files.lines(Path.of(st));

        List<String> sorted = fs
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(ArrayList::new));

//        System.out.println(sorted);
        return sorted;
    }
}
