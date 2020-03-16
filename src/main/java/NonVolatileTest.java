package main.java;

public class NonVolatileTest {

    boolean stop;

    public void test() {

        new Thread(() -> {
            while (!stop) {
                // never stop
            }
        }).start();

        new Thread(() -> stop = true).start();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            new NonVolatileTest().test();
        }
    }
}
