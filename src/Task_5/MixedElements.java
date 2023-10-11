package Task_5;

import java.util.Iterator;
import java.util.stream.Stream;

public class MixedElements {
//    public static void main(String[] args) {
        public Stream <String> zipStream (Stream<String> first,Stream<String> second){
//        Stream<String> first = Stream.of("1", "2", "3", " ", "-");
//        Stream<String> second = Stream.of("one", "two", "three", "khgjh");

        return zip(first,second);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> i1 = first.iterator();
        Iterator<T> i2 = second.iterator();
        Stream.Builder<T> builder = Stream.builder();

        while (i1.hasNext()&&i2.hasNext()){
            builder.add(i1.next());
            builder.add(i2.next());
        }
        return builder.build();
    }
}
