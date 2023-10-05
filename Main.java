package HW1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter =
                new Counter();

        Thread thread01 =
                new Thread(() -> {
                    for (int i = 0; i < 1000; i++) {
                        counter.increment();
                    }
                });

        Thread thread02 =
                new Thread(() -> {
                    for (int i = 0; i < 1000; i++) {
                        counter.increment();
                    }
                });

        thread01.start();
        thread02.start();

        thread01.join();
        thread02.join();

        System.out.println("Count: " + counter.getValue());
    }
}