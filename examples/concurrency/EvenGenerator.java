//: concurrency/EvenGenerator.java
package concurrency; /* Added by Eclipse.py */
// When threads collide.

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;

import java.nio.ByteOrder;

public class EvenGenerator extends IntGenerator {
    private int currentEvenValue = 0;

    private int counter;

    public  int next() {
        synchronized (EvenGenerator.class){
            ++currentEvenValue; // Danger point here!
            Thread.yield();
            ++currentEvenValue;
            return currentEvenValue;
        }



    }

    public static void main(String[] args) {
        EvenChecker.test(new EvenGenerator(), 10);
    }
} /* Output: (Sample)
Press Control-C to exit
89476993 not even!
89476993 not even!
*///:~
