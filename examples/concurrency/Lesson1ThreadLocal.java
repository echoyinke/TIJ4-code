package concurrency;

class Lesson1ThreadLocal {
    public static ThreadLocal<String> local484 = new ThreadLocal<String>();//声明静态的threadlocal变量
    public static ThreadLocal<String> local485 = new ThreadLocal<String>();//声明静态的threadlocal变量

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            TestThread testThread = new TestThread();//创建5个线程
            new Thread(testThread, "T" + i).start();
        }

       Thread.sleep(8000);
        System.gc();
        int i  = 1;

    }

}

class TestThread implements Runnable {

    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            Thread.sleep(1l);//让线程停顿一下，便于其它线程执行
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Lesson1ThreadLocal.local484.set(Thread.currentThread().getName() + ":" + "testValue");
        Lesson1ThreadLocal.local485.set(Thread.currentThread().getName() + "");
        firstStep();
        try {
            Thread.sleep(1l);//让线程停顿一下，便于其它线程执行
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        secondStep();
        try {
            Thread.sleep(1l);//让线程停顿一下，便于其它线程执行
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        thirdStep();
        try {
            Thread.sleep(1l);//让线程停顿一下，便于其它线程执行
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        fourthStep();
        try {
            Thread.sleep(1l);//让线程停顿一下，便于其它线程执行
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        fStep();
    }

    public void firstStep() {
        System.out.println(Lesson1ThreadLocal.local484.get().toString() + ":first step");//获取本线程的threadlocal变量值并打印
    }

    public void secondStep() {
        System.out.println(Lesson1ThreadLocal.local484.get().toString() + ":second step");
    }

    public void thirdStep() {
        System.out.println(Lesson1ThreadLocal.local484.get().toString() + ":third step");
    }

    public void fourthStep() {
        System.out.println(Lesson1ThreadLocal.local484.get().toString() + ":fourth step");
    }

    public void fStep() {
        System.out.println(Lesson1ThreadLocal.local484.get().toString() + ":fifth step");
    }
}