//: generics/Fibonacci.java
package generics; /* Added by Eclipse.py */
// Generate a Fibonacci sequence.

import net.mindview.util.*;

import java.util.concurrent.Callable;

public class Fibonacci implements Generator<Integer>, Callable<String> {
    private int count = 0;

    public Integer next() {
        return fib(count++);
    }

    private int fib(int n) {
        if (n < 2) return 1;
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        Fibonacci gen = new Fibonacci();
        for (int i = 0; i < 18; i++)
            System.out.print(gen.next() + " ");
    }

    @Override
    public String call() throws Exception {
        int res =  fib(3);
        return String.valueOf(res);
    }
} /* Output:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584
*///:~
