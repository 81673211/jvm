package main.java;

import java.util.ArrayList;
import java.util.List;

public class MemoryTest {

    public static void main(String[] args) throws InterruptedException {
        List<byte[]> list = new ArrayList<>();
        while (true) {
            list.add(new byte[1024 * 100]);
            Thread.sleep(1000);
        }
    }
}
