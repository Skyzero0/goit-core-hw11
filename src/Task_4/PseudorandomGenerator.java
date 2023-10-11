package Task_4;

public class PseudorandomGenerator {
//    public static void main(String[] args) {
        public void pseudoRandom (long a, long c, long m){
//        long a = 25214903917L;
//        long c = 11L;
//        long m = 2 ^ 48L;

        Gen generator = new Gen(a,c,m);

        generator.str(3).limit(10).forEach(System.out::println);
    }
}
