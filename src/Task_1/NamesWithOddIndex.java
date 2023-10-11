package Task_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NamesWithOddIndex{
//    public static void main(String[] args) throws IOException {
    public List<String> getNames (String st) throws IOException {
        List<String>names = new ArrayList<>();
        AtomicInteger i = new AtomicInteger(1);

        Files.lines(Path.of(st))
                .map(s -> i.getAndIncrement() + ". " + s)
                .map(s -> {
                    Function<String, Double> ff = Double::valueOf;
                    boolean b = ff.apply(s.substring(0, s.lastIndexOf(". "))) % 2 != 0;
                    if (b) {
                        return s;
                    }
                    return "";
                })
                .filter(s -> s.length()!=0)
                .map(names::add)
                .collect(Collectors.toList());
//        System.out.println(names);
        return names;
    }
}
