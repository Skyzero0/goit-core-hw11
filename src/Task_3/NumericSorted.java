package Task_3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumericSorted {
//    public static void main(String[] args) {
        public String getSortedNumbers (String [] arr){
//        String[] arr = {"1, 2, 0", "4, 5"};
        String sortedNumbers = Arrays.stream(String.join(", ", arr)
                .split(", "))
                .sorted()
                .map(s -> s.concat(""))
                .collect(Collectors.joining(", "));
//        System.out.println(sortedNumbers);
            return sortedNumbers;
        }
}
