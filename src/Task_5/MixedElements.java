package Task_5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class MixedElements {
//    public static void main(String[] args) {
        public Stream <String> zipStream (Stream<String> first,Stream<String> second){
//        Stream<String> first = Stream.of("1", "2", "3", " ", "-");
//        Stream<String> second = Stream.of("one", "two", "three", "khgjh");

        return zip(first,second);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> list= new ArrayList<>();
        List<T> list1 = first.toList();
        List<T> list2 = second.toList();

        Iterator<T> i1 = list1.listIterator();
        Iterator<T> i2 = list2.listIterator();

        while (i1.hasNext()&&i2.hasNext()){
            list.add(i1.next());
            list.add(i2.next());
        }
        return list.stream();
    }
}
