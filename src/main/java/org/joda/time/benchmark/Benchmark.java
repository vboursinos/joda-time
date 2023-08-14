package org.joda.time.benchmark;

public class Benchmark {

    public static void main(String[] args) throws Exception {
        Thread.sleep(10000);
        long start = System.currentTimeMillis();

        DateTimePerformance t = new DateTimePerformance();
        t.main();

        Examples e = new Examples();
        e.main();

        long end = System.currentTimeMillis();
        System.out.println("time: " + (end - start));
        Thread.sleep(100000);
    }
}
