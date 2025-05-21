import java.io.PrintWriter;

public class BenchMark {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter("nqueens_timing.csv")) {
            writer.println("N,Time(ms)");

            for (int N = 100; N <= 1000; N += 100) {
                long start = System.nanoTime();
                new NQueensSolver(N).solve();
                long end = System.nanoTime();
                double timeMs = (end - start) / 1_000_000.0;

                writer.printf("%d,%.3f%n", N, timeMs);
                System.out.printf("N=%d solved in %.3f ms%n", N, timeMs);
            }

            System.out.println("Timing data saved to nqueens_timing.csv.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}