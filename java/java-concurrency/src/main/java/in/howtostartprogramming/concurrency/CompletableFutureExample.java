package in.howtostartprogramming.concurrency;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Demonstrates CompletableFuture for building async, non-blocking pipelines.
 *
 * Full tutorial: https://howtostartprogramming.in/java-concurrency/
 */
public class CompletableFutureExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        System.out.println("=== CompletableFuture Example ===");
        basicPipelineDemo();
        combiningFuturesDemo();
        errorHandlingDemo();
    }

    /** Chain async steps: fetch → transform → aggregate */
    private static void basicPipelineDemo() throws ExecutionException, InterruptedException, TimeoutException {
        System.out.println("\n--- Basic Async Pipeline ---");

        CompletableFuture<String> result = CompletableFuture
            .supplyAsync(() -> {
                System.out.println("Step 1: fetching user ID on " + Thread.currentThread().getName());
                sleep(200);
                return "user-42";
            })
            .thenApplyAsync(userId -> {
                System.out.println("Step 2: loading profile for " + userId);
                sleep(200);
                return "Rajesh Mishra (id=" + userId + ")";
            })
            .thenApplyAsync(profile -> {
                System.out.println("Step 3: enriching data for " + profile);
                sleep(100);
                return "[ENRICHED] " + profile;
            });

        System.out.println("Pipeline result: " + result.get(5, TimeUnit.SECONDS));
    }

    /** Run multiple futures in parallel and combine their results. */
    private static void combiningFuturesDemo() throws ExecutionException, InterruptedException {
        System.out.println("\n--- Combining Multiple Futures ---");

        CompletableFuture<String> profileFuture = CompletableFuture.supplyAsync(() -> {
            sleep(300);
            return "Profile: Rajesh Mishra";
        });

        CompletableFuture<List<String>> ordersFuture = CompletableFuture.supplyAsync(() -> {
            sleep(400);
            return List.of("Order-1", "Order-2", "Order-3");
        });

        CompletableFuture<String> accountFuture = CompletableFuture.supplyAsync(() -> {
            sleep(200);
            return "Account: PREMIUM";
        });

        // allOf waits for all; join() is safe after allOf completes
        CompletableFuture<String> dashboard = CompletableFuture
            .allOf(profileFuture, ordersFuture, accountFuture)
            .thenApply(v -> String.format("Dashboard{%s, orders=%s, %s}",
                profileFuture.join(), ordersFuture.join(), accountFuture.join()));

        System.out.println(dashboard.get());
    }

    /** Handle exceptions gracefully with exceptionally() and handle(). */
    private static void errorHandlingDemo() throws ExecutionException, InterruptedException {
        System.out.println("\n--- Error Handling ---");

        CompletableFuture<String> riskyOperation = CompletableFuture
            .supplyAsync(() -> {
                if (Math.random() > 0.5) {
                    throw new RuntimeException("Simulated service failure");
                }
                return "Success!";
            })
            .exceptionally(ex -> {
                System.out.println("Caught exception: " + ex.getMessage());
                return "Fallback response";
            });

        System.out.println("Result: " + riskyOperation.get());
    }

    private static void sleep(long millis) {
        try {
            TimeUnit.MILLISECONDS.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
