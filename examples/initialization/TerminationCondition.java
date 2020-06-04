//: initialization/TerminationCondition.java
package initialization; /* Added by Eclipse.py */
// Using finalize() to detect an object that
// hasn't been properly cleaned up.

class Book {
  boolean checkedOut = false;
  static int test = 1;
  Book(boolean checkOut) {
    checkedOut = checkOut;
  }
  void checkIn() {
    checkedOut = false;
  }
  protected void finalize() {
    if(checkedOut)
      System.out.println("Error: checked out");
    // Normally, you'll also do this:
    // super.finalize(); // Call the base-class version
  }
}

public class TerminationCondition {
  public static void main(String[] args) {

    Book novel = new Book(true);
    novel.test++;
    // Proper cleanup:
    novel.checkIn();
    // Drop the reference, forget to clean up:
    Book B = new Book(true);
    System.out.println(B.test);
    // Force garbage collection & finalization:
    System.gc();
  }
} /* Output:
Error: checked out
*///:~
