import Task_1.NamesWithOddIndex;
import Task_2.SortedAndUpperCase;
import Task_3.NumericSorted;
import Task_4.PseudorandomGenerator;
import Task_5.MixedElements;

import java.io.IOException;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

////        Task 1
////        Метод приймає на вхід список імен. Необхідно повернути рядок вигляду 1. Ivan, 3. Peter...
////        лише з тими іменами, що стоять під непарним індексом (1, 3 тощо)
//        NamesWithOddIndex names = new NamesWithOddIndex();
//        System.out.println(names.getNames("names.txt"));


////        Task 2
////        Метод приймає на вхід список рядків (можна взяти список із Завдання 1). Повертає список цих
////        рядків у верхньому регістрі, і відсортованих за спаданням (від Z до A).
//        SortedAndUpperCase upperCase = new SortedAndUpperCase();
//        System.out.println(upperCase.getNn("names.txt"));


////        Task 3
////        Є масив: ["1, 2, 0", "4, 5"].Необхідно отримати з масиву всі числа,
////        і вивести їх у відсортованому вигляді через кому
//        NumericSorted numericSorted = new NumericSorted();
//        System.out.println(numericSorted.getSortedNumbers(new String[]{"1, 2, 0", "4, 5"}));


////        Task 4
////        Реалізуйте свій лінійний конгруентний генератор. Для цього почніть з x[0] = seed,
////        і далі кожний наступний елемент рахуйте за формулою на зразок x[n + 1] = 1 (a x[n] + c) % m
////        для коректних значень a, c, та m.
//        PseudorandomGenerator pseudorandomGenerator = new PseudorandomGenerator();
//        pseudorandomGenerator.pseudoRandom(25214903917L,21L, 2 ^ 48L);


////        Task 5
////        Напишіть метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) який "перемішує"
////        елементи зі стрімів first та second, зупиняючись тоді, коли у одного зі стрімів закінчаться елементи.
//        MixedElements mixedElements = new MixedElements();
//        Stream<String> first = Stream.of("1", "2", "3", " ", "-");
//        Stream<String> second = Stream.of("one", "two", "three", "khgjh");
//        mixedElements.zipStream(first,second).forEach(System.out::println);
    }
}