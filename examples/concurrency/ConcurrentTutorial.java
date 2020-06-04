package concurrency;

import java.util.concurrent.*;

public class ConcurrentTutorial {



    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future  future = executorService.submit(()->{
            System.out.println("test");
            throw new RuntimeException("ex throw");

        });
        executorService.shutdown();

    }
}
