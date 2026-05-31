package in.howtostartprogramming.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Demonstrates thread creation, ExecutorService usage, and basic synchronization.
 *
 * Full tutorial: https://howtostartprogramming.in/java-concurrency/
 */
public class ExecutorServiceExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        System.out.println("=== ExecutorService Example ===");
        fixedThreadPoolDemo();
        cachedThreadPoolDemo();
        scheduledExecutorDemo();
    }

    /** Fixed thread pool: limits concurrency to a set number of threads. */
    private static void fixedThreadPoolDemo() throws InterruptedException, ExecutionException {
        System.out.println("\n--- Fixed Thread Pool ---");
        ExecutorService executor = Executors.newFixedThreadPool(4);

        List<Future<Integer>> futures = new ArrayList<>();
        for (int i = 1; i <= 8; i++) {
            final int taskId = i;
            futures.add(executor.submit(() -> {
                System.out.printf("Task %d running on %s%n", taskId, Thread.currentThread().getName());
                TimeUnit.MILLISECONDS.sleep(200);
                return taskId * taskId;
            }));
        }

        for (Future<Integer> future : futures) {
            System.out.println("Result: " + future.get());
        }

        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);
    }

    /** Cached thread pool: creates new threads on demand, reuses idle ones. */
    private static void cachedThreadPoolDemo() throws InterruptedException {
        System.out.println("\n--- Cached Thread Pool ---");
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 1; i <= 5; i++) {
            final int id = i;
            executor.execute(() ->
                System.out.printf("Cached task %d on %s%n", id, Thread.currentThread().getName())
            );
        }

        executor.shutdown();
        executor.awaitTermination(5, TimeUnit.SECONDS);
    }

    /** Scheduled executor: run tasks with delay or fixed rate. */
    private static void scheduledExecutorDemo() throws InterruptedException {
        System.out.println("\n--- Scheduled Executor ---");
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(2);

        // one-shot delay
        scheduler.schedule(() -> System.out.println("Delayed task executed"), 1, TimeUnit.SECONDS);

        // periodic task
        ScheduledFuture<?> periodic = scheduler.scheduleAtFixedRate(
            () -> System.out.println("Periodic tick: " + System.currentTimeMillis()),
            0, 500, TimeUnit.MILLISECONDS
        );

        TimeUnit.SECONDS.sleep(2);
        periodic.cancel(false);
        scheduler.shutdown();
    }
}
