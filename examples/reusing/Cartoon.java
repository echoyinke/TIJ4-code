//: reusing/Cartoon.java
package reusing; /* Added by Eclipse.py */
// Constructor calls during inheritance.
import static net.mindview.util.Print.*;

class Art {
  int i =8;
  Art() { print("Art constructor"); }
}

class Drawing extends Art {
  int i= 9;
  Drawing() { print("Drawing constructor"); }
}

public class Cartoon extends Drawing {
  int i = 7;
  public Cartoon() { print("Cartoon constructor"); }
  public static void main(String[] args) {
    Cartoon x = new Cartoon();
    int i=9;
  }
} /* Output:
Art constructor
Drawing constructor
Cartoon constructor
*///:~
