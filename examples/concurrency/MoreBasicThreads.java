//: concurrency/MoreBasicThreads.java
package concurrency; /* Added by Eclipse.py */
// Adding more threads.

public class MoreBasicThreads {


  public class yieldCpu implements Runnable {

    public yieldCpu(int i) {
      System.out.println(i+"constructed");
    }

    @Override
    public void run() {
      String  name = Thread.currentThread().getName();
        System.out.println(name +"step a");
        Thread.yield();
      System.out.println(name+"step b");
      Thread.yield();
      System.out.println(name+"step c");
      Thread.yield();
      System.out.println(name+"finished");
    }
  }

  public class  TestExt extends Thread {
    @Override
    public void run() {
      String  name = Thread.currentThread().getName();
      System.out.println(name +"step a");
      Thread.yield();
      System.out.println(name+"step b");
      Thread.yield();
      System.out.println(name+"step c");
      Thread.yield();
      System.out.println(name+"finished");
    }
  }
  public static void main(String[] args) {
    MoreBasicThreads moreBasicThreads = new MoreBasicThreads();
    for(int i = 0; i < 5; i++) {
      Thread thread = new Thread(moreBasicThreads.new TestExt(), "basic" + i);
      thread.setDaemon(true);
      thread.start();
    }

    System.out.println("Waiting for LiftOff");

  }
} /* Output: (Sample)
Waiting for LiftOff
#0(9), #1(9), #2(9), #3(9), #4(9), #0(8), #1(8), #2(8), #3(8), #4(8), #0(7), #1(7), #2(7), #3(7), #4(7), #0(6), #1(6), #2(6), #3(6), #4(6), #0(5), #1(5), #2(5), #3(5), #4(5), #0(4), #1(4), #2(4), #3(4), #4(4), #0(3), #1(3), #2(3), #3(3), #4(3), #0(2), #1(2), #2(2), #3(2), #4(2), #0(1), #1(1), #2(1), #3(1), #4(1), #0(Liftoff!), #1(Liftoff!), #2(Liftoff!), #3(Liftoff!), #4(Liftoff!),
*///:~
