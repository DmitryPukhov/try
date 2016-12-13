package dmitrypukhov;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Stream;

/**
 * Created by dima on 12/13/16.
 */
public class Concurrencies {

    public void run() throws ExecutionException, InterruptedException {
        int threads = 100;
        ExecutorService es = Executors.newCachedThreadPool();


        String[] data = {"1. Cat", "2. Dog", "3. Monkey", "4. Human", "5. Horse", "6. Pig"};

        // Sequential
        System.out.println("Sequential");
        Stream.of(data).forEach(s -> {
            System.out.println(s);
        });
        System.out.println();

        // Parallel
        System.out.println("Parallel");
        Stream.of(data).parallel().forEach(s -> {
            System.out.println(s);
        });

/*
        int threads = 100;
        ExecutorService es = Executors.newFixedThreadPool(threads);


        for(int i = 0; i < threads; i++) {

            Future<String> result = es.submit(() -> {
                System.out.println(Thread.currentThread().getName());
                return Thread.currentThread().getName();
            });
        }
        es.shutdown();*/
    }


}
