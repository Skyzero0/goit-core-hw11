package Task_4;

import java.util.stream.Stream;

public class Gen {
     private long a;
     private long c;
     private long m;

     public Gen (long a, long c, long m){
         this.a=a;
         this.c=c;
         this.m=m;
     }

    private long nextNumber(long x) {
        return (a * x + c) % m;
    }
    public Stream<Long> str (long x){
        return Stream.iterate(x, this::nextNumber);
    }
}
